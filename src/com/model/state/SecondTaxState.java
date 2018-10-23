package com.model.state;

/**
 * @author hongwei
 * @date 2018/10/23 14:40
 */
public class SecondTaxState implements TaxState{

    @Override
    public void charge(double salary) {
        System.out.println("2档扣税20%,");
        System.out.println("薪资"+salary+"   扣税："+salary*0.2);
    }
}
