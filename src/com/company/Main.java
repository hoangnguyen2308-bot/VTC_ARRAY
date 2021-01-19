package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = { 4, 5 ,6 , -3 , 6 ,-7 , 9, 12};
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length; j >0 ; j--){
                if(arr[i] % 2 != 0 )
                    arr[arr.length - i - 1] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = arr.length; j >0 ; j--){
               System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }

    }
}
