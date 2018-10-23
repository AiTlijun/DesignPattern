package com.model.strategy;

/**
 * @author hongwei
 * @date 2018/10/23 14:00
 */
public class Loan {

    RepaymentMethod repaymentMethod;

    public Loan(RepaymentMethod repaymentMethod) {
        this.repaymentMethod = repaymentMethod;
    }

    public void loan(double money){
        System.out.println("开始借款---");
        repaymentMethod.refund(money);
    }
}
