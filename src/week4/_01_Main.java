package week4;

import java.util.Random;
import java.util.Scanner;

public class _01_Main {

    public static void main(String[] args) {
        /*
        Question 1: int veri tipinde bir dizi tanimlayin. dizinin icerisine for dongusunde 10 tane sayı atayin
         */

        int[] arr = new int[10];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int dizi : arr) {
            System.out.print(dizi + " ");
        }

        System.out.println();

        /*
        Question 2: sayi adinda int bir dizi tanimlayiniz. dizinin içerisine 4 tane rastgele sayi atayiniz.
        sayilar 0-20 araliginda bulunsun
         */

        int[] arr2 = new int[4];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 20);
        }

        for (int dizi2 : arr2) {
            System.out.print(dizi2 + " ");
        }

        System.out.println();

        /*

         */


    }


}
