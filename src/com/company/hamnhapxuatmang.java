package com.company;
   import java.util.Scanner;
public class hamnhapxuatmang {
        public static void nhapmangA(int[] A)
        {
            @SuppressWarnings("resource")
            Scanner in = new Scanner(System.in);
            System.out.print("Nhập kích thước mảng A: ");
            int n = in.nextInt();

            A = new int[n];
            for(int i=0;i<n;i++)
            {
                System.out.print("A["+i+"] = ");
                A[i] = in.nextInt();
            }
        }
        public static void xuatmang(int[] A) {
            System.out.print("Danh sách mảng: ");
            for(int i=0;i<A.length;i++)
            {
                System.out.print("\t"+A[i]);
            }
        }

        public static void main(String[] args) {
            int [] B = null;
            nhapmangA(B);
            xuatmang(B);
        }
    }

