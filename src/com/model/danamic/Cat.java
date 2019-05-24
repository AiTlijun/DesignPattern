package com.model.danamic;

/**
 * @ClassName: Cat
 * @Description: cat
 * @Author: lijun
 * @Date: 2019/4/10 0010下午 4:28
 * @Version: 1.0.0$
 **/
public class Cat implements Animal {
    @Override
    public void eatFood(String name) {
        System.out.println("this is cat，"+"it's name:"+name+",it's eating fish!");
    }
}
