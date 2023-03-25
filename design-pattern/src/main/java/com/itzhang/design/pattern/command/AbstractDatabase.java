package com.itzhang.design.pattern.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: 张水龙
 * @Date: 2023/3/248:36
 * @Descripton: 命令模式，数据库类
 */
public class AbstractDatabase {
    private Map<String,User> userMap;
    private Map<String,User> deletetKey;
    private Map<String,User> insertKey;
    private Map<String,User> updateKey;

    public AbstractDatabase() {
        this.userMap =  new ConcurrentHashMap<>();
        this.deletetKey = new ConcurrentHashMap<>();
        this.insertKey = new ConcurrentHashMap<>();
        this.updateKey = new ConcurrentHashMap<>();
    }

    public void add(User user){
        this.insertKey.put(user.getUserName(),user);
        this.userMap.put(user.getUserName(),user);

    }

    public void deleteInsert(String delete){
       if(insertKey.containsKey(delete)){
           User after = insertKey.get(delete);
           User before = userMap.get(delete);
           String info = String.format("{before: %s,after: %s}", before, after);
           System.out.println(info);
           this.insertKey.remove(delete);
           this.userMap.remove(delete);
       }

    }

    public void update(User user){

    }
}
