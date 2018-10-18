package com.model.observer;

/**
 * @author hongwei
 * @date 2018/10/18 16:38
 */
public class SubjectEntity extends Subject{
    private String status;

    public String getStatus() {
        return status;
    }

    public void changeStatus(String newStatus){
        System.out.println("主题新状态为：" + newStatus);
        //状态发生改变，通知各个观察者
        this.nodifyObservers(newStatus);
    }
}
