package com.greatlearning.currencycalculator;

import java.util.ArrayList;
import com.greatlearning.utils.*;

public class CurrencyCalcDriver {

    public static void main(String[] args) {
        CurrencyCollector cc = new CurrencyCollector();
        int[] curr_denom = cc.collectCurrencyDenominations();

        Utils utils = new Utils();
        curr_denom = utils.selectionSort(curr_denom);

        int amount = cc.collectAmount();

        ArrayList ccyList = cc.calcCurrencyDenominations(curr_denom.length, amount, curr_denom);

        System.out.println("Your payment approach in order to give min no of notes will be");
        System.out.println(ccyList.toString());

    }
}
