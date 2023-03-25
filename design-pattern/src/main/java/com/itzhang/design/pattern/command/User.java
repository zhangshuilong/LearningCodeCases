package com.itzhang.design.pattern.command;

/**
 * @Author: 张水龙
 * @Date: 2023/3/248:37
 * @Descripton: 用户类
 */
public class User {
    private String userName;
    private String userSex;

    public User() {
    }

    public User(String userName, String userSex) {
        this.userName = userName;
        this.userSex = userSex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userSex='" + userSex + '\'' +
                '}';
    }
}
