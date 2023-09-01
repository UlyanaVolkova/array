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

    public void evenNumAmount(int [] arr1){
        int index = 0;
        int amount = 0;
        while (index<10){
            int num = arr1[index];
            if (num % 2 == 0){
                amount = amount + 1;
                index = index + 1;
            } else {
                index=index +1;
            }
        }
        System.out.println("Количество всех чётных чисел = " + amount);
        }

    public void oddNumAmount(int [] arr1){
        int index = 0;
        int amount = 0;
        while (index<10){
            int num = arr1[index];
            if (num % 2 == 0){
                index = index + 1;
            } else {
                amount = amount + 1;
                index=index +1;
            }
        }
        System.out.println("Количество всех нечётных чисел = " + amount);
    }

}
