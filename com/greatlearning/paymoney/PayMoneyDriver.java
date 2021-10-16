package com.greatlearning.paymoney;

public class PayMoneyDriver {

    public static void main(String[] args) {
        PayMoney pm = new PayMoney();
        pm.collectTransactionData();
        pm.collectAndVerifyTarget();
    }
}
