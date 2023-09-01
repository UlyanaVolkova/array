package ru.volkova.arrapp.util;

public class Utility {
    public void sumNum(int [] arr1){
        int index = 0;
        int sum = 0;
        while (index < 10){
            sum = sum + arr1[index];
            index ++;
        }
        System.out.println("Сумма всех чисел массива = " + sum);
    }

    public void evenNumAmount(int [] arr1){
        int index = 0;
        int amount = 0;
        while (index<10){
            int num = arr1[index];
            if (num % 2 == 0){
                amount ++;
                index ++;
            } else {
                index ++;
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
                index ++;
            } else {
                amount ++;
                index ++;
            }
        }
        System.out.println("Количество всех нечётных чисел = " + amount);
    }

    public void primeNumAmount(int [] arr1){
        int index = 0;
        int amount = 0;
        int i = 2;
        while (index<10){
            int num = arr1[index];
            if (i <= num/2 && num % i == 0){
                index ++;
                i ++;
            } else {
                amount ++;
                index ++;
                i ++;
            }
        }
        System.out.println("Количество всех простых чисел = " + amount);
    }

    public void diffSumIndex(int [] arr1){
        int index = 0;
        int sumEven = 0;
        int sumOdd = 0;
        while (index < 10){
            if(index % 2 == 0){
                sumEven = sumEven + arr1[index];
                index ++;
            } else {
                sumOdd = sumOdd + arr1[index];
                index ++;
            }
        }
        int diff = sumEven - sumOdd;
        System.out.println("Разность сумм чисел с чётными и нечётными индексами равна = " + diff);
    }

    public void zeroAmount(int [] arr1){
        int index = 0;
        int amount = 0;
        while (index<10){
            int num = arr1[index];
            if (num == 0){
                amount ++;
                index ++;
            } else {
                index ++;
            }
        }
        System.out.println("Количество раз, когда встречается 0 = " + amount);
    }

}
