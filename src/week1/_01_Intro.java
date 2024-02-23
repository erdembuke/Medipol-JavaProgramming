package week1;

import java.util.Scanner;

public class _01_Intro {

    public static void main(String[] args) {
        System.out.println("15 minutes break");

        String text = "wp";
        int a = 5;
        float b = 0.5f; // float da f olarak sonuna tanımlarken eklemeliyiz
        double c = 0.5;

        Scanner scInt = new Scanner(System.in);

        System.out.print("Yasinizi girin-> ");
        int textInput = scInt.nextInt();
        System.out.println("Yasiniz " + textInput);

        /*
        Kullanicidan vize, final ve odev notu isteyiniz.
        Girilen notların %20 - %50 - %30 hesaplayarak
        50 nin altinda ise kaldi, ustundeyse gecti mesaji veren java kodunu yaziniz
         */
        Scanner scanner = new Scanner(System.in);
        double vizeNot, finalNot, odevNot, totalNot;

        System.out.print("Vize notu girin-> ");
        vizeNot = scanner.nextInt();

        System.out.print("Final notu girin-> ");
        finalNot = scanner.nextInt();

        System.out.print("Odev notu girin-> ");
        odevNot = scanner.nextInt();

        vizeNot *= 0.20;
        finalNot *= 0.50;
        odevNot *= 0.30;
        totalNot = vizeNot + finalNot + odevNot;

        System.out.println("Ogrenci ortalamasi " + totalNot);

        String result = (totalNot >= 50) ? "Gectiniz" : "Kaldiniz"; // Ternary
        System.out.println(result);

        /*
        Fiyati verilen urunun kdvli fiyatini hesaplayan bir uygulama yaziniz.
        Kdv yi ister sabit fiyat tutun isterseniz kullanicidan alin
         */

        double taxRate; double priceIncludedTax; double price; double tax;

        System.out.print("Input product price-> ");
        price = scanner.nextInt();

        System.out.print("Input tax rate (%) -> ");
        taxRate = scanner.nextInt();

        tax = price * (taxRate / 100);
        System.out.println("Tax on the product = " + tax);

        priceIncludedTax = price + tax;
        System.out.println("Price included 20% tax -> " + priceIncludedTax);






    }

}
