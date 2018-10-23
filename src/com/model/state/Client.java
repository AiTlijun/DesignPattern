package com.model.state;

/**
 * @author hongwei
 * @date 2018/10/23 14:49
 */
public class Client {

    public static void main(String[] args) {
        TaxManager taxManager1 = new TaxManager(8000);
        TaxManager taxManager2 = new TaxManager(14000);
        TaxManager taxManager3 = new TaxManager(25000);

        taxManager1.charge();
        taxManager2.charge();
        taxManager3.charge();


    }


}
