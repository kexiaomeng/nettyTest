package com.tracy.redis;

import javafx.util.Pair;
import lombok.extern.slf4j.Slf4j;
import redis.clients.jedis.*;

import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.*;

@Slf4j
public class ZsetTest {

    public static final SimpleDateFormat TIMESTAMP =
            new SimpleDateFormat("EEE MMM dd HH:00:00 yyyy");
    public static final Collator COLLATOR = Collator.getInstance();

    private static final SimpleDateFormat ISO_FORMAT =
            new SimpleDateFormat("yyyy-MM-dd'T'HH:00:00");

    public static final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String args[]) throws InterruptedException {
        Pair<String,String> pair = new Pair<String, String>("KEY", "VALUE");

        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


        Jedis connection = new Jedis("localhost",6379);
        connection.select(0);


        connection.zadd("newzset",10 ,"sunmeng");
        connection.zadd("newzset",20, "sunmeng1");


        connection.zadd("newzset1",10 ,"sunmeng");
        connection.zadd("newzset1",20, "sunmeng1");

        connection.zinterstore("newzsetinter",new ZParams().aggregate(ZParams.Aggregate.MIN),"newzset","newzset1");



        Set<String> set = connection.zrange("newzsetinter",0,-1);

        for (String child : set){
            log.debug(child);

        }

        List<String> strings = connection.sort("mylist", new SortingParams().alpha());


        for (String child : strings){
            log.debug(child);

        }
        log.debug(connection.get("忠钦瑜"));

        connection.watch("newzset");


        Transaction transaction = connection.multi();

        transaction.zadd("newzset", 100, "sunmeng100");
        List<Object> results = transaction.exec();


        for (int i = 0; i < results.size(); i++) {
            log.debug(results.get(i)+"");
        }


        Pipeline pipeline = connection.pipelined();
        pipeline.set("s6-27-1","sunmeng");
        pipeline.set("s6-27-2","sunmeng");
        pipeline.lpush("L6-27-1","sunmegn","wangyunzhuang");

        pipeline.sync();

        if (results == null){
            log.error("false");
        }else {
            log.debug("success");
        }



//        testLog(connection);

        logCommon(connection, "test", "mymsg");


    }

    public static void testLog(Jedis conn) {
        System.out.println("\n----- testLogRecent -----");
        System.out.println("Let's write a few logs to the recent log");
        for (int i = 0; i < 5; i++) {
            logRecent(conn, "test", "this is message " + i);
        }
        List<String> recent = conn.lrange("recent-debug", 0, -1);
        System.out.println(
                "The current recent message log has this many messages: " +
                        recent.size());
        System.out.println("Those messages include:");
        for (String message : recent){
            System.out.println(message);
        }
        assert recent.size() >= 5;
    }

    public static void logRecent(Jedis jedis, String name , String msg){
        String key = "recent-"+"debug";
        String value = sf.format(new Date())+":"+ msg;

        Pipeline pipeline = jedis.pipelined();

        pipeline.lpush(key,value);
        pipeline.ltrim(key, 0,99);

        pipeline.sync();



    }


    public static void logCommon(Jedis conn, String name, String message) {
        logCommon(conn, name, message, "info", 5000);
    }

    public static void logCommon(
            Jedis conn, String name, String message, String severity, int timeout) {
        String commonDest = "common:" + name + ':' + severity;
        String startKey = commonDest + ":start";
        long end = System.currentTimeMillis() + timeout;
        while (System.currentTimeMillis() < end){
            conn.watch(startKey);
            String hourStart = ISO_FORMAT.format(new Date());
            String existing = conn.get(startKey);

            Transaction trans = conn.multi();
            if (existing != null && COLLATOR.compare(existing, hourStart) < 0){
                trans.rename(commonDest, commonDest + ":last");
                trans.rename(startKey, commonDest + ":pstart");
                trans.set(startKey, hourStart);
            }
            System.out.println(commonDest);
            trans.zincrby(commonDest, 1, message);

            String recentDest = "recent:" + name + ':' + severity;
            trans.lpush(recentDest, TIMESTAMP.format(new Date()) + ' ' + message);
            trans.ltrim(recentDest, 0, 99);
            List<Object> results = trans.exec();
            // null response indicates that the transaction was aborted due to
            // the watched key changing.
            if (results == null){
                continue;
            }
            return;
        }
    }
}
