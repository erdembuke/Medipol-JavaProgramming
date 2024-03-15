package week4;

import java.util.Scanner;

public class _02_AtmClass {

    public static void main(String[] args) {
        /*
        ATM Uygulaması
        Hosgeldiniz, guncel bakiye 1000 TL
        **********************
        1- Para yatir
        a) yatirmak istedininiz miktar
        a1) Guncel bakiye 1500 TL
        a2) *Menuye geri doner*

        2- Para cek
        b1) Cekmek istediniz miktar: 2000
        b2) yetersiz bakiye
        b3) *menuye geri doner*

        3- Bakiye sorgula
        c1) Guncel bakiye 1500 TL
        c2) *Menuye geri doner*

        4- Cikis yap
        d1) *uygulama sonu*
        **********************
        Yapmak istediginiz islemi secin:
         */
        Scanner scInt = new Scanner(System.in);
        int bakiye = 500, secim;

        System.out.println("Hosgeldiniz, Guncel bakiyeniz: " + bakiye + "$");
        while (true) {
            System.out.println("***************");
            System.out.println("1-Para Yatirmak");
            System.out.println("2-Para Cekmek");
            System.out.println("3-Bakiye Sorgulamak");
            System.out.println("4-Cikis Yapmak");
            System.out.println("***************");
            System.out.print("Yapmak istediğiniz işlemi seçin ->");
            secim = scInt.nextInt();

            switch (secim) {
                case 1:
                    bakiye = paraYatir(bakiye);
                    break;
                case 2:
                    bakiye = paraCek(bakiye);
                    break;
                case 3:
                    bakiyeSorgula(bakiye);
                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Yanlis islem secimi, tekrar deneyin.....");
            }
        }

    }

    static Scanner scMethod = new Scanner(System.in);

    public static int paraYatir(int balance) {
        int amount = 0;

        System.out.print("Yatirilacak miktari girin ->");
        amount = scMethod.nextInt();
        balance += amount;
        System.out.println("Para yatirma islemi basarili! Guncel bakiye " + balance + "$");

        return balance;
    }

    public static int paraCek(int balance) {

        int amount = 0;
        System.out.print("Cekmek istediniz miktari girin ->");
        amount = scMethod.nextInt();

        if(amount > balance) {
            System.out.println("Yetersiz bakiye, tekrar deneyiniz...");
        }else {
            balance -= amount;
            System.out.println("Para cekme islemi basarili! Guncel bakiye " + balance + "$");
        }

        return balance;
    }

    public static void bakiyeSorgula(int balance) {
        System.out.println("Guncel bakiyeniz: " + balance + "$");
    }




}



