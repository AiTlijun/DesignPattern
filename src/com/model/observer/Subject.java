package com.model.observer;

import java.util.Vector;

/**
 * @author hongwei
 * @date 2018/10/18 16:30
 */
public abstract class Subject {

    private Vector<Observer> vectorObservers = new Vector<Observer>();

    public void addObserver(Observer observer){
        vectorObservers.add(observer);
    };

    public void removeObserver(Observer observer){
        vectorObservers.remove(observer);
    };

    public void nodifyObservers(String status){
        for (Observer observer: vectorObservers) {
            System.out.println("通知所有观察者改变主题状态---");
            observer.update(status);
        }
    };
}
