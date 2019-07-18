package com.tracy.curator;

import javafx.util.Pair;
import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.AuthInfo;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.imps.CuratorFrameworkState;
import org.apache.curator.framework.recipes.cache.*;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.data.ACL;
import org.apache.zookeeper.data.Id;
import org.apache.zookeeper.data.Stat;
import org.apache.zookeeper.server.auth.DigestAuthenticationProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CuratorConnect {
    public CuratorFramework curatorFramework = null;

    private static final String zkServerIps = "127.0.0.1:2181";


    public void createConnect() {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000 ,5 );  // 重连策略


        curatorFramework = CuratorFrameworkFactory.builder()   // 创建客户端
                .connectString(zkServerIps)
                .sessionTimeoutMs(10000)
                .retryPolicy(retryPolicy)
                .authorization("digest","sunmeng:sunmeng".getBytes())  // 访问有密码认证
                .build();
        curatorFramework.start();
    }

    /**
     * 创建节点
     * @param path
     * @param data
     */
    public void createNameSpace(String path, String data, List<ACL> acls)  {

        try {
            String result = curatorFramework.create().creatingParentsIfNeeded()  // 创建父节点，也就是会递归创建
                    .withMode(CreateMode.PERSISTENT)  // 节点类型
                    .withACL(acls)  // 节点的acl权限
                    .forPath(path, data.getBytes());
            System.out.println("创建节点:"+result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 关闭zk客户端连接
    private void closeZKClient() {
        if (curatorFramework != null) {
            this.curatorFramework.close();
        }
    }

    /**
     * 修改节点
     * @param path
     * @param data
     */
    public void modifyNode(String path, String data)   {

        try {
            Stat result = curatorFramework.setData().withVersion(0).forPath(path,data.getBytes());
            System.out.println("修改节点,version:"+result.getVersion());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 删除节点
     * @param path
     */
    public void deleteNode(String path)   {

        try {
            curatorFramework.delete().guaranteed().deletingChildrenIfNeeded().forPath(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 判断一个节点是否存在
     * @param path
     * @return
     */
    public boolean exists(String path){
        try {
            Stat stat = curatorFramework.checkExists().forPath(path);
            if (stat == null) {
                return false;
            }else{
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 获取节点数据
     * @param path
     * @return Pair对
     */
    public Pair<Stat, byte[]> getDataOfNode(String path) {
        Stat stat = new Stat();
        try {

            byte[] msg = curatorFramework.getData().storingStatIn(stat).forPath(path);
            return new Pair<Stat, byte[]>(stat,msg);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 获取子节点列表
     * @param path
     * @return
     */
    public List<String> getChildNode(String path) {
        try {
            List<String> childNode = curatorFramework.getChildren().forPath(path);
            return childNode;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 监听节点事件,多次监听，不需要手动去重新注册，只能监听到节点数据的变化。
     */
    public void listenNode(String path) throws Exception {

        final NodeCache nodeCache = new NodeCache(curatorFramework, path);
        // 参数 buildInitial : 初始化的时候获取node的值并且缓存

        nodeCache.start(true);
        if (nodeCache.getCurrentData() != null) {
            System.out.println("节点初始化数据为：" + new String(nodeCache.getCurrentData().getData()));

        }else{
            System.out.println("节点初始化数据为空...");

        }

        nodeCache.getListenable().addListener(new NodeCacheListener() {
            public void nodeChanged() throws Exception {
                if (nodeCache.getCurrentData() == null) {
                    System.out.println("获取节点数据异常，无法获取当前缓存的节点数据，可能该节点已被删除");
                    return;
                }
                // 获取节点最新的数据
                String data = new String(nodeCache.getCurrentData().getData());
                System.out.println(nodeCache.getCurrentData().getPath() + " 节点的数据发生变化，最新的数据为：" + data);

            }
        });



    }


    /**
     * 监听子节点事件，有event标识，可以获取具体的事件类型
     */
    public void listenChildNode(String path) throws Exception {

        // 为子节点添加watcher
        // PathChildrenCache: 监听数据节点的增删改，可以设置触发的事件
        PathChildrenCache pathChildrenCache = new PathChildrenCache(curatorFramework, path, true );

        /**
         * StartMode: 初始化方式
         * POST_INITIALIZED_EVENT：异步初始化，初始化之后会触发已有节点的新增和初始化事件
         * NORMAL：异步初始化
         * BUILD_INITIAL_CACHE：同步初始化,
         */
        pathChildrenCache.start(PathChildrenCache.StartMode.BUILD_INITIAL_CACHE);


        pathChildrenCache.getListenable().addListener(new PathChildrenCacheListener() {
            public void childEvent(CuratorFramework curatorFramework, PathChildrenCacheEvent event) throws Exception {
                if (PathChildrenCacheEvent.Type.CHILD_ADDED.equals(event.getType())) {
                    System.out.println("新增子节点");
                    System.out.println("\n--------------\n");
                    System.out.print("子节点：" + event.getData().getPath() + " 添加成功，");
                    System.out.println("该子节点的数据为：" + new String(event.getData().getData()));

                }else if (PathChildrenCacheEvent.Type.CHILD_UPDATED.equals(event.getType())){
                    System.out.println("更新子节点");

                    System.out.println("\n--------------\n");
                    System.out.print("子节点：" + event.getData().getPath() + " 数据更新成功，");
                    System.out.println("子节点：" + event.getData().getPath() + " 新的数据为：" + new String(event.getData().getData()));

                }else if (PathChildrenCacheEvent.Type.CHILD_REMOVED.equals(event.getType())){
                    System.out.println("删除子节点");

                }
            }
        });
    }

    public static void main(String args[]) throws Exception {
        CuratorConnect connect = new CuratorConnect();
        connect.createConnect();


        String name = "1:sunmeng";
        String [] names = name.split(name,2);

        System.out.println(name);

        // zookeeper将用户名和密码一起编码作为密码
        System.out.println(DigestAuthenticationProvider.generateDigest("sunmeng:sunmen"));


        // 获取当前客户端的状态
        CuratorFrameworkState isZkCuratorStarted = connect.curatorFramework.getState();
        System.out.println("当前客户端的状态：" + isZkCuratorStarted.name() );

        String path = "/curator/test1";

        connect.createNameSpace("/curator/test1","sunmeng",ZooDefs.Ids.OPEN_ACL_UNSAFE);


        connect.modifyNode(path,"modifysunmeng");

        System.out.println(connect.exists(path));
        System.out.println(new String(connect.getDataOfNode(path).getValue()).toString());


        for (String node : connect.getChildNode("/curator")){
            System.out.println(node);

        }

        connect.listenNode("/curator");
        connect.listenChildNode(path);

        List<ACL> acls = new ArrayList<ACL>();

        ACL acl = new ACL(ZooDefs.Perms.CREATE,new Id("digest", DigestAuthenticationProvider.generateDigest("sunmeng:sunmeng")));
//        connect.deleteNode(path);
        try {
            Thread.sleep(100000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        connect.closeZKClient();
//
//
//
//        // 获取当前客户端的状态
//         isZkCuratorStarted = connect.curatorFramework.getState();
//        System.out.println("当前客户端的状态：" + isZkCuratorStarted.name() );

    }
}
