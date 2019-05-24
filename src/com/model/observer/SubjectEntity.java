package com.model.observer;

import java.util.Observable;

/**
 * @author hongwei
 * @date 2018/10/18 16:38
 */
public class SubjectEntity extends Observable {

    public void notifyAllObserver(){
        setChanged();
        notifyObservers("新年快乐！");
    }
}
