package com.example.helloworld;

import java.lang.*;
public class    HelloWorld {

    public static int[] insertShiftArray(int[] array, int value) {

        int newArray[] = new int[array.length +   1];
        int midVal =  array.length % 2 ;
        for (int i = 0; i < newArray.length; i++) {
            if (midVal == i) {
                newArray[i] = value;
            } else {
                 {
                    newArray[i] = array[i];
                }
            }
        }
        return newArray;
    }

    public static void   HelloWorld (String) {
     
            System.out.println(newArrat);
        }
    }
}