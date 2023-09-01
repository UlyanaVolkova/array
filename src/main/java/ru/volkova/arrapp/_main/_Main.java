package ru.volkova.arrapp._main;

import ru.volkova.arrapp.util.Utility;

public class _Main {

    public static void main(String [] args){
        int [] arr1 = new int[10];
        arr1[0] = 12;
        arr1[1] = -3;
        arr1[2] = 50;
        arr1[3] = 7;
        arr1[4] = -8;
        arr1[5] = 33;
        arr1[6] = 6;
        arr1[7] = 1;
        arr1[8] = 14;
        arr1[9] = -5;

        Utility utility = new Utility();
        utility.sumNum (arr1);
        utility.evenNumAmount(arr1);
        utility.oddNumAmount(arr1);
        utility.primeNumAmount(arr1);
        utility.diffSumIndex(arr1);
        utility.zeroAmount(arr1);
    }
}