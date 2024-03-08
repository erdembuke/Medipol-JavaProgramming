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
        int destinationValue;
        double price = 0;
        boolean completed = false;

        System.out.println("----- ***** Uçak bileti satın alma programı ***** -----");
        while (!completed) {
            System.out.println("1- Ankara (500km)");
            System.out.println("2- İzmir (350km)");
            System.out.println("3- Muğla (700km)");
            System.out.print("Please choose a destination (1/2/3): ");
            destinationValue = scInt3.nextInt();
            switch (destinationValue) {
                case 1:
                    price = switchCaseMethod(500,birimFiyat);
                    completed = true;
                    break;
                case 2:
                    price = switchCaseMethod(350,birimFiyat);
                    completed = true;
                    break;
                case 3:
                    price = switchCaseMethod(700,birimFiyat);
                    completed = true;
                    break;
                default:
                    System.out.println("Incorrect destination value. Try again");
            }
        }
        System.out.println("Purchase completed! price is " + price + "$");
    }


    // switch case method for more readable code
    public static double switchCaseMethod(int distance, double birimFiyat) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        boolean completedSwitch = false;

        while (!completedSwitch) {
            System.out.print("Lütfen yaş giriniz: ");
            int age = scanner.nextInt();
            if (age < 12 && age >= 0) {
                price = (distance * birimFiyat) * 0.50;
                completedSwitch = true;
                break;
            } else if (age > 12 && age < 24) {
                price = (distance * birimFiyat) * 0.90;
                completedSwitch = true;
                break;
            } else if (age >= 24 && age <= 65) {
                price = (distance * birimFiyat);
                completedSwitch = true;
                break;
            } else if (age > 65 && age <= 100) {
                price = (distance * birimFiyat) * 0.80;
                completedSwitch = true;
                break;
            } else
                System.out.println("Incorrect age value, try again. Age cannot be lower than 0 " +
                        "and cannot be above 100");
        }

        return price;
    }
}
