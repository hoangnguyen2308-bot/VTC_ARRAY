package com.company;
import java.util.Random;
import java.util.Scanner;
public class bt112 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Random rd = new Random();
            int a[] = new int[5];
            for (int i = 0; i < a.length; i++) {
                System.out.println(String.format("a[%d]=", i));
                a[i] = sc.nextInt();
            }
            for (int i:a) {
                System.out.println(String.format("a[%d]=",i));
            }
            System.out.println("A");

        }

    }

