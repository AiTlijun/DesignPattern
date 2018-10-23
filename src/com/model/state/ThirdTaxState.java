package com.model.state;

/**
 * @author hongwei
 * @date 2018/10/23 14:40
 */
public class ThirdTaxState implements TaxState{
    @Override
    public void charge(double salary) {
        System.out.println("3档扣税30%,");
        System.out.println("薪资"+salary+"   扣税："+salary*0.3);
    }
}
