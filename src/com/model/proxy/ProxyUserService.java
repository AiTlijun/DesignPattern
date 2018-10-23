package com.model.proxy;

/**
 * @author hongwei
 * @date 2018/10/23 16:20
 */
public class ProxyUserService extends UserService {

    UserServiceImpl userService = new UserServiceImpl();

    public void addUser(String id){
        System.out.println("开始调用方法："+Thread.currentThread().getStackTrace()[1].getMethodName());
        userService.addUser(id);
        System.out.println("调用方法结束："+Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
