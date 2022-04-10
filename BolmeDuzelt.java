package com.company;

import java.util.Scanner;

public class BolmeDuzelt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("İşlem Menüsü\n1-Toplama\n2-Bölme");

        int islem;
        while (true) {

            System.out.println("Lütfen İşlem Seçiniz (1-2) :");
            islem = scanner.nextInt();

            if (islem > 0 && islem < 3) {
                // System.out.println("Lütfen 1 veya 2 arasında bir seçim yapınız");
                break;

            }
        }
        System.out.println("1.Sayı:");
        int s1 = scanner.nextInt();

        System.out.println("2.Sayı:");
        int s2 = scanner.nextInt();

        if (islem == 1) {

            System.out.println(toplamaİslemiYap(s1, s2));
        } else if (islem == 2) {

            System.out.println(bolmeİslemiYap(s1, s2));

        }
    }


    public static int toplamaİslemiYap(int x, int y) {
        int toplam = x + y;
        return toplam;
    }

    public static double bolmeİslemiYap(double m, double n) {
        if (m == 0 && n != 0) {
            System.out.println("cevap 0 dir");
        } else if (n == 0 && m != 0)
            System.out.println("cevap tanımsız ");
        else if (n == 0 && m == 0)
            System.out.println("cevap sonsuz ");

        return m / n;
    }

}