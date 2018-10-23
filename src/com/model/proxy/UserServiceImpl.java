package com.model.proxy;

/**
 * @author hongwei
 * @date 2018/10/23 16:21
 */
public class UserServiceImpl extends UserService {

    @Override
    void addUser(String id) {
        System.out.println("添加用户，id:"+id);
    }
}
