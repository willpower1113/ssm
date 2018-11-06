package com.willpower.entity;

public class User {

    private Integer id;

    private String phone;

    private String password;

    private String nickname;

    private String userIdentity;//身份


    public User(Integer id, String phone, String password, String nickname, String userIdentity) {
        this.id = id;
        this.phone = phone;
        this.password = password;
        this.nickname = nickname;
        this.userIdentity = userIdentity;
    }

    public User(String phone, String password, String nickname, String userIdentity) {
        this.phone = phone;
        this.password = password;
        this.nickname = nickname;
        this.userIdentity = userIdentity;
    }

    public User(String phone, String password, String userIdentity) {
        this.phone = phone;
        this.password = password;
        this.userIdentity = userIdentity;
    }

    public User(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUserIdentity() {
        return userIdentity;
    }

    public void setUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", userIdentity='" + userIdentity + '\'' +
                '}';
    }
}
