package com.model.observer;

/**
 * @author hongwei
 * @date 2018/10/18 16:38
 */
public class ObserverEntity implements Observer {
    @Override
    public void update(String status) {
        System.out.println("更新主题状态:"+status);

    }
}
