package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Sayı:");
        int s1 = scanner.nextInt();

        System.out.println("2.Sayı:");
        int s2 = scanner.nextInt();

        System.out.println("toplam="+toplamaİslemiYap(s1,s2));


    }


    public static int toplamaİslemiYap(int x, int y) {
        int toplam = x + y;
        return toplam;
    }


}