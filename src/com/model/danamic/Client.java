package com.model.danamic;

/**
 * @ClassName: Client
 * @Description: test
 * @Author: lijun
 * @Date: 2019/4/10 0010下午 4:11
 * @Version: 1.0.0$
 **/
public class Client {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        DanamicProxy danamicProxy = new DanamicProxy();
        danamicProxy.setAnimal(cat);
        Animal animal = (Animal)danamicProxy.getProxyNewInstance();
        animal.eatFood("tony");
    }
}
