package com.tracy.redis;

import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

import java.util.*;

@Slf4j
public class RedisTest {


    private static final int ONE_WEEK_IN_SECONDS = 7 * 86400;
    private static final int VOTE_SCORE = 432;
    private static final int ARTICLES_PER_PAGE = 25;

    public static void main(String args[]) {
        //***************************集群**********************
        Set<HostAndPort> hostAndPorts = new HashSet<>();

        hostAndPorts.add(new HostAndPort("127.0.0.1", 6379));


        JedisCluster cluster = new JedisCluster(hostAndPorts,10000, 3);
        //*****************集群*****************


        Jedis connection = new Jedis("localhost",6379);
        connection.select(0);
        connection.set("忠钦瑜","女");
        log.debug(connection.get("忠钦瑜"));

        connection.lpush("mylist", "child1", "child2", "child3");
        log.debug(connection.lpop("mylist"));

        connection.sadd("myset","set1", "set2","set3");
        log.debug(""+connection.sismember("myset", "set1"));

        connection.hset("myhash", "hash1","value1");
        log.debug(connection.hget("myhash","hash1"));
        String articleId = postArticle(connection, "sunmeng", "第二篇文章", "www.baidu.com");


        log.debug("We posted a new article with id: " );
        log.debug("Its HASH looks like:");
        Map<String,String> articleData = connection.hgetAll(articleId);
        for (Map.Entry<String,String> entry : articleData.entrySet()){
            log.debug("  " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();


    }

    public static String postArticle(Jedis connection, String user, String title, String url){
        String articleId = String.valueOf(connection.incr("article:"));
        HashMap<String,String> articleMap = new HashMap<String, String>();

        long time = Calendar.getInstance().getTimeInMillis()/1000;
        String article = "article:"+articleId;
        articleMap.put("user",user);
        articleMap.put("title",title);
        articleMap.put("url", url);
        articleMap.put("time", String.valueOf(time));

        connection.hmset(article, articleMap);
        connection.zadd("score",time + VOTE_SCORE, article);
        connection.zadd("publishtime",time,article);
        return article;

    }


    public static void volt(Jedis connection, String user, String articleId) {

        long cutoff = (System.currentTimeMillis() / 1000) - ONE_WEEK_IN_SECONDS;

        if (connection.zscore("publishtime",articleId) < cutoff){
            return;
        }
        String voltId = "volt:"+  articleId.split(":")[1];
        if (connection.sadd(voltId,user) == 1) {
            connection.zincrby("score", VOTE_SCORE, articleId);
        }
    }
}
