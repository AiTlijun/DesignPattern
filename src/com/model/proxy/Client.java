package com.model.proxy;

/**
 * @author hongwei
 * @date 2018/10/23 16:32
 */
public class Client {

    public static void main(String[] args) {
        ProxyUserService proxyUserService = new ProxyUserService();
        proxyUserService.addUser("5");
    }

}
