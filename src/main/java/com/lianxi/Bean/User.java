package com.lianxi.Bean;

import javax.persistence.*;
import java.io.Serializable;

/*
    根据JPA规范：进行ORM映射
    object  Relationship
    User类   uesr表
    属性名称  字段名称
    java类型  SQL类型
 */
@Entity //声明实体类
@Table(name = "y_name")
public class User implements Serializable {

    //主键
    @Id //声明主键字段
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY等价于auto_increment
    @Column(name = "id")    //该属性名对应的字段名，省略时，是按照默认的属性名创建
    private Integer id;
    //用户名
    @Column(name = "username", unique = true, nullable = false) //unique表示是否唯一，nullable表示是否可以为null
    private String username;
    //密码
    @Column(name = "password", unique = true, nullable = false)
    private String password;
    //姓名
    @Column(name = "name", nullable = false)
    private String name;

    public User() {
    }

    public User(Integer id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
