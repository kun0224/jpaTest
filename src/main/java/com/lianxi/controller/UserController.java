package com.lianxi.controller;

import com.lianxi.Bean.User;
import com.lianxi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findUser")
    public List<User> findUser(){
        return userService.findUsers();
    }

    /**
     * 保存
     * @param user
     */
    @RequestMapping("/save")
    public void saveUser(User user){
        userService.saveUser(user);
    }

    /**
     * 根据id删除
     * @param id
     */
    @RequestMapping("/deleteUesrById/{id}")
    public void deleteUesrById(@PathVariable("id") Integer id){
        userService.deleteUserById(id);
    }

    /**
     * 根据id查询
     * http://localhost:18081//findUserById?id=2
     * @param id
     * @return
     */
    @RequestMapping("/findUserById")
    public User findUserById(Integer id){
        return userService.findUserById(id);
    }
}
