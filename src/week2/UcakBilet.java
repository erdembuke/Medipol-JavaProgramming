package week2;

import java.util.Scanner;

public class UcakBilet {

    /*
        Hava yolu şirketinin bilet fiyatını hesaplayan program yazınız
        Özellikler:
        - km birim fiyatı 0.10$
        - 12 yasindan kucuklere toplam fiyat uzerinden %50 indirim uygulansın
        - 12 ve 24 yaş arasına toplam fiyatı uzerinden %10 indirim uygulansın
        - 65 yas ustune %20 indirim
        gidis donus alirsa toplam fiyat uzerinden %20 indirim
        bu kosullara gore ucak bilet fiyatini hesaplayan program yaziniz.
    */

    public static void main(String[] args) {
        Scanner scInt3 = new Scanner(System.in);
        double birimFiyat = 0.10;
        int destination;
        int age;
        double price = 0;
        boolean completed = false;
        boolean completedSwitch = false;

        System.out.println("----- ***** Uçak bileti satın alma programı ***** -----");
        while (!completed) {
            System.out.println("1- Ankara (500km)");
            System.out.println("2- İzmir (350km)");
            System.out.println("3- Muğla (700km)");
            System.out.print("Please choose a destination (1/2/3): ");
            destination = scInt3.nextInt();
            switch (destination) {
                case 1:
                    while (!completedSwitch) {
                        System.out.print("Lütfen yaş giriniz: ");
                        age = scInt3.nextInt();
                        if (age < 12 && age >= 0) {
                            price = (500 * birimFiyat) * 0.50;
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else if (age > 12 && age < 24) {
                            price = (500 * birimFiyat) * 0.90;
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else if (age >= 24 && age <= 65) {
                            price = (500 * birimFiyat);
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else if (age > 65 && age <= 100) {
                            price = (500 * birimFiyat) * 0.80;
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else
                            System.out.println("Incorrect age value, try again. Age cannot be lower than 0 " +
                                    "and cannot be above 100");
                    }
                    break;

                case 2:
                    while (!completedSwitch) {
                        System.out.print("Lütfen yaş giriniz: ");
                        age = scInt3.nextInt();
                        if (age < 12 && age >= 0) {
                            price = (350 * birimFiyat) * 0.50;
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else if (age > 12 && age < 24) {
                            price = (350 * birimFiyat) * 0.90;
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else if (age >= 24 && age <= 65) {
                            price = (350 * birimFiyat);
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else if (age > 65 && age <= 100) {
                            price = (350 * birimFiyat) * 0.80;
                            completed = true;
                            completedSwitch = true;
                            break;
                        } else
                            System.out.println("Incorrect age value, try again. Age cannot be lower than 0 " +
                                    "and cannot be above 100");
                    }
                    break;

                case 3:
                    while (!completedSwitch) {
                        System.out.print("Please input age: ");
                        age = scInt3.nextInt();
                        if (age < 12 && age >= 0) {
                            price = (700 * birimFiyat) * 0.50;
                            completed = true;
                            completedSwitch = true;
                        } else if (age > 12 && age < 24) {
                            price = (700 * birimFiyat) * 0.90;
                            completed = true;
                            completedSwitch = true;
                        } else if (age >= 24 && age <= 65) {
                            price = (750 * birimFiyat);
                            completed = true;
                            completedSwitch = true;
                        } else if (age > 65 && age <= 100) {
                            price = (700 * birimFiyat) * 0.80;
                            completed = true;
                            completedSwitch = true;
                        } else
                            System.out.println("Incorrect age value, try again. Age cannot be lower than 0 " +
                                    "and cannot be above 100");
                    }
                    break;

                default:
                    System.out.println("Incorrect destination value. Try again");

            }
        }
        System.out.println("Purchase completed! price is " + price + "$");
    }
}
