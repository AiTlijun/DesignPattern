package com.model.danamic;

/**
 * @ClassName: Dog
 * @Description: dog
 * @Author: lijun
 * @Date: 2019/4/10 0010下午 3:55
 * @Version: 1.0.0$
 **/
public class Dog implements Animal {
    @Override
    public void eatFood(String name) {
        System.out.println("this is dog，"+"it's name:"+name+",it's eating bone!");
    }
}
