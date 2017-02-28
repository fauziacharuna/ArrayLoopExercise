package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Masukkan bilangan perulangan");

        int y[] = {1, 2, 3, 4, 5};
        System.out.println(y);// memiliki indeks 5
        int min = 0;
        int i;
        for (i = 1; i <= 5; i++) {
            min = i;
            int j;
            for (j = i + 1; i <= 5; i++) {
                if (y[j] <= y[min]) {
                    min = j;
                }
            }
            //tukar posisi
            int temp;
            temp = y[i];
            y[i] = y[min];
            y[min] = temp;
        }

        for (int a = 1; a <= 5; a++) {
            System.out.println(y[a] + "");

        }

    }
}

