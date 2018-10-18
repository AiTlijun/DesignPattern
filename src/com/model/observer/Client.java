package com.model.observer;

/**
 * @author hongwei
 * @date 2018/10/18 16:45
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new SubjectEntity();

        Observer observer1 = new ObserverEntity();
        Observer observer2 = new ObserverEntity();
        Observer observer3 = new ObserverEntity();
        Observer observer4 = new ObserverEntity();

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.addObserver(observer4);

        ((SubjectEntity) subject).changeStatus("2");

    }
}
