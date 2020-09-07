package com.lianxi.dao;

import com.lianxi.Bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 增删改查的所有方法都已经被JpaRepository这个父接口定义好了
 * （接口可以继承多个接口）
 */
@Repository
public interface UserDao extends JpaRepository<User,Integer> {

}
