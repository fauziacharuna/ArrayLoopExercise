package com.company;

import java.util.Scanner;

/**
 * Created by FauziAchmad on 2/27/17.
 */
public class Array {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       /* int[] myArray = new int[5];
        myArray[1]=1;
        myArray[2]=6;
        myArray[3]=3;
        System.out.println(myArray[1]);*/


        int[] inputArray = new int[5];
        System.out.println("Input your 5 Data  : ");

        for (int i = 0; i < inputArray.length; i++)//Perulangan untuk memasukkan data
            inputArray[i] = scan.nextInt();
        System.out.println("before sorting ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i]);//perulangan untuk memunculkan data
        }

    }

   /* public void ArrayInput() {

        int[] inputArray = new int[5];
            System.out.println("Input your 5 Data  : ");

        for (int i = 0; i < inputArray.length; i++)//Perulangan untuk memasukkan data
            inputArray[i] = scan.nextInt();

        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("the element of " + i + " is " + inputArray[i]);//perulangan untuk memunculkan data
        }
    }
    public static double getAverage(int[] array){
        int sum=0;
        for (int i=0;i<5;i++){
            sum +=array[i];
        }
        return (double) sum/(double) array.length;
    }*/
}

