package com.model.strategy;

/**
 * @author hongwei
 * @date 2018/10/23 14:06
 */
public class Client {

    public static void main(String[] args) {
        double money = 150000;
        RepaymentMethod repaymentMethod = new EqualityCorpusRepayment();
        Loan loan = new Loan(repaymentMethod);
        loan.loan(money);

        double money2 = 20000;
        RepaymentMethod repaymentMethod2 = new EqualityInterestRepayment();
        Loan loan2 = new Loan(repaymentMethod2);
        loan2.loan(money2);
    }
}
