package week2;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Main {
    public static void main(String[] args) {

        // kullanici girisi
        Scanner scStr = new Scanner(System.in);

        int girisHakki = 3;
        String username = "medipol";
        String password = "medipol123";
        String inputUsername, inputPassword;

        System.out.println("--------- Panel Giriş ------------");

        while (girisHakki > 0) {
            System.out.print("Kullanici adi giriniz: ");
            inputUsername = scStr.next();
            System.out.print("Sifre giriniz: ");
            inputPassword = scStr.next();

            if (username.equals(inputUsername) && password.equals(inputPassword)) {
                System.out.println("Giriş başarılı. Anasayfaya yönlendiriliyorsunuz...");
                break;
            }else {
                System.out.println("Giriş başarısız, tekrar deneyiniz..");
                girisHakki--;
                System.out.println("Kalan giriş hakkınız " + girisHakki);
            }

            if(girisHakki == 0) {
                System.out.println("Giriş hakkınız kalmadı, çıkış yapılıyor...");
            }


        }

        /*

        Kullanicinin girmis oldugu hava sicakligina gore kullaniciya etkinlik oneren uygulama
        30 veya yuksek ise yuzme etkinligi oner
        5 veya 30 derece arasindaysa sinema oner
        4 veya daha az ise kayak yapmayi oner

         */

        int sicaklik;
        System.out.print("Hava derecesini yaziniz: ");
        sicaklik = scStr.nextInt();

        if(sicaklik <= 4) {
            System.out.println("Hava kayak yapmak icin uygun gorunuyor");
        }else if (sicaklik > 4 && sicaklik < 30) {
            System.out.println("Hava sinemaya gitmek icin uygun gorunuyor");
        }else System.out.println("Hava yuzmek icin uygun gorunuyor");


        /*
        kullanicidan 3 adeet sayi isteyiniz ve sayilari buyukten kucuge siralayiniz
         */
        Scanner scInt2 = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("----- ***** Girilen sayıları büyükten küçüğe sıralama programı ***** -----");
        System.out.println("----- ***** 3 adet sayi girisi yapilacak buyukten kucuge siralanicak ***** -----");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Sayıi" + (i+1) + " girin -> ");
            arr[i] = scInt2.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if(i == 0) {
                System.out.println("En kucuk sayi " + arr[i]);
            }else if (i == 1) {
                System.out.println("Ortanca sayi " + arr[i]);
            }else System.out.println("En buyuk sayi " + arr[i]);
        }


    }
}
