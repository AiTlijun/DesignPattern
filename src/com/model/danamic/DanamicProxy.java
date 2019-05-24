package com.model.danamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName: DanamicProxy
 * @Description: 代理类
 * @Author: lijun
 * @Date: 2019/4/10 0010下午 3:57
 * @Version: 1.0.0$
 **/
public class DanamicProxy implements InvocationHandler {

    private Animal animal;

    public DanamicProxy() {
    }

    public DanamicProxy(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Object getProxyNewInstance() {
        return Proxy.newProxyInstance(animal.getClass().getClassLoader(),
                animal.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        dosomethingBefore();
        Object ret = method.invoke(animal, args);
        dosomethingAfter();
        return ret;
    }

    private void dosomethingBefore() {
        System.out.println("前戏。。。。");
    }

    private void dosomethingAfter() {
        System.out.println("后戏。。。。");
    }
}
