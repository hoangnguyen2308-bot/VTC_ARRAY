package com.company;

import java.util.Random;
import java.util.Scanner;

public class bailamthu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        Random rd = new Random();
        int a[] = new int[n];

        for(int i = 0; i<a.length;i++){
            a[i] = sc.nextInt();
            System.out.println("a["+i+"]= "+a[i]);
        }
        System.out.println("so am:");
        for(int i = 0;i<a.length;i++) {
            if (a[i] < 0) {
                System.out.print(a[i] + " ");
            }
        }

    }
}
