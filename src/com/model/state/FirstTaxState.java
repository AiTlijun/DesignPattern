package com.model.state;

/**
 * @author hongwei
 * @date 2018/10/23 14:40
 */
public class FirstTaxState implements TaxState{

    @Override
    public void charge(double salary) {
        System.out.println("1档扣税10%,");
        System.out.println("薪资"+salary+"   扣税："+salary*0.1);

    }
}
