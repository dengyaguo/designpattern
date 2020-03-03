package com.hutool.entity;

import java.time.LocalDateTime;

public class User {
    public User() {
    }

    public User(String name, Integer age, LocalDateTime createTime) {
        this.name = name;
        this.age = age;
        this.createTime = createTime;
    }

    public User(String name, String gender, Integer age, LocalDateTime createTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.createTime = createTime;
    }

    private String name; //名称
    private String gender;//性别
    private Integer age; //年龄
    private LocalDateTime createTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", createTime=" + createTime +
                '}';
    }
}
