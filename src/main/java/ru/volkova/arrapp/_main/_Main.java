package ru.volkova.arrapp._main;

import ru.volkova.arrapp.util.Utility;

public class _Main {

    public static void main(String[] args) {
        int[] arr1 = {12, -3, 50, 7, -8, 33, 6, 1, 14, -5};
        Utility utility = new Utility();
        utility.sumNum(arr1);
        utility.evenNumAmount(arr1);
        utility.oddNumAmount(arr1);
        utility.primeNumAmount(arr1);
        utility.diffSumIndex(arr1);
        utility.countZeroAmount(arr1);
    }
}