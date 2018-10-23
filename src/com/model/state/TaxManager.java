package com.model.state;

/**
 * @author hongwei
 * @date 2018/10/23 14:37
 */
public class TaxManager {

    double salary;

    TaxState taxState;

    public TaxManager(double salary) {
        this.salary = salary;
    }

    void charge(){

        if(salary <  10000){
            taxState = new FirstTaxState();
        }else if(salary < 20000 && salary > 10000){
            taxState = new SecondTaxState();
        }else{
            taxState = new ThirdTaxState();
        }
        taxState.charge(salary);
    }
}
