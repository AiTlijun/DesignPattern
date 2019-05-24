package com.model.observer;

import java.util.Observable;
import java.util.Observer;
import java.util.or;

/**
 * @author hongwei
 * @date 2018/10/18 16:30
 */
public abstract class Subject {

    Observable observable = new Observable();

    public void addObserver(Observer observer){
        observable.addObserver(observer);
    };

    public void removeObserver(Observer observer){
        observable.deleteObserver(observer);
    };

    public void nodifyObservers(String status){
            if(observable.hasChanged()){
                System.out.println("通知所有观察者改变主题状态---");
            }
    };
}
