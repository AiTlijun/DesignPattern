package com.model.strategy;

/**
 * @author hongwei
 * @date 2018/10/23 13:59
 */
public class EqualityInterestRepayment implements RepaymentMethod{

    @Override
    public void refund(double money) {
        System.out.println("还款方式等额本金：借款金额："+money);
    }
}
