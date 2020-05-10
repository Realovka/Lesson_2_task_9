package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[11];
        array[0]=1;
        array[1]=1;
        for (int i = 2; i <= 10; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i <= 10; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
