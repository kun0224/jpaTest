package com.lianxi.service.impl;

import com.lianxi.Bean.User;
import com.lianxi.dao.UserDao;
import com.lianxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    /**
     * 查询所有
     * @return
     */
    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Override
    public User findUserById(Integer id) {
        return userDao.findById(id).get();
    }

    /**
     * 保存
     * @param user
     */
    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    /**
     * 更新
     * @param user
     */
    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    /**
     * 根据id删除
     * @param id
     */
    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }
}
