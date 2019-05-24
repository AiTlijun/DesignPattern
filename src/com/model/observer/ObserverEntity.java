package com.model.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author hongwei
 * @date 2018/10/18 16:38
 */
public class ObserverEntity implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof SubjectEntity) {
            System.out.println("更新主题状态:" + arg.toString());
        }
    }
}
