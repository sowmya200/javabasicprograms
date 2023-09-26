package com.company;

public class Pascaltriangle {public static void main(String[] args) {

   // System.out.println("         "+1);
    int arrayIndex = 1;
    int n = 0;
    int[] arr = new int[10];
    int[] ar = new int[50];
    for (int i = 1; i < 7; i++) {
        for (int k=10; k>i;k--)
        {
            System.out.print(" ");
        }
        for (int j = 1; j < 7; j++) {
            if (i % 2 == 0) {
                if (j == 1) {
                    arr[0] = 1;
                    System.out.print(1 + " ");
                }
                else if (i == j) {
                    arr[i - 1] = 1;
                    System.out.print(1);
                }
                while (j < i && j != 1 && j != n + 1) {
                    arr[arrayIndex] = ar[n] + ar[n + 1];
                    System.out.print(arr[arrayIndex] + " ");
                    arrayIndex++;
                    n++;
                }
            }
            else {
                if (j == 1) {
                    ar[0] = 1;
                    System.out.print(1 + " ");
                }
                else if(i == j) {
                    ar[i - 1] = 1;
                    System.out.print(1);
                }
                while (j < i && j != 1 && j != n + 1) {
                    ar[arrayIndex] = arr[n] + arr[n + 1];
                    System.out.print(ar[arrayIndex] + " ");
                    arrayIndex++;
                    n++;
                }
            }
        }
        arrayIndex=1;
        n=0;
        System.out.println("");
    }
}
}
