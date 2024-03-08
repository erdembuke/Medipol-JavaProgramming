package week3;

import java.util.Scanner;

public class _01_Loops {
    public static void main(String[] args) {
        /*
        Loops
        - While / Do-While / For
         */

        // while dongusu icerisinde 1-100 e kadar olan çift sayilari ekrana yazdirin
        int count = 1;

        System.out.println("***** ----- While ile ----- *****");
        while (count < 100) {
            if (count % 2 == 0) {
                System.out.print(count + ",");
            }
            count++;
        }

        System.out.println();

        System.out.println("***** ----- For ile ----- *****");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }

        System.out.println();

        System.out.println("***** ----- Do While ----- *****");
        int count2 = 1;
        do {
            if (count2 % 2 == 0)
                System.out.print(count2 + ",");
            count2++;
        } while (count2 < 100);

        // kullanici negatif bir deger girene kadar, girilen tek sayı değerlerin toplamını alan program
        System.out.println();
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        System.out.println("***** ----- negatif sayı girilene kadar tek değerleri toplayan program ----- *****");

        while (sayi >= 0) {
            System.out.print("Sayı girin -> ");
            sayi = scanner.nextInt();
            if (sayi % 2 == 1) {
                toplam += sayi;
                System.out.println("Sayı tek sayı! anlık toplam = " + toplam);
            } else if (sayi < 0) {
                System.out.println("Negatif sayı girdiniz! Program sonlanıyor...");
            } else System.out.println("Sayı çift! toplama eklenmedi!");

        }

        System.out.println("Program sonlandı... Toplam = " + toplam);


    }
}
