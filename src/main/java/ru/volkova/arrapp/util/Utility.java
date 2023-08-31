package ru.volkova.arrapp.util;

public class Utility {
    public void sumNum(int [] arr1){
        int index = 0;
        int sum = 0;
        while (index < 10){
            sum = sum + arr1[index];
            index = index + 1;
        }
        System.out.println("Сумма всех чисел массива = " + sum);
    }
}
