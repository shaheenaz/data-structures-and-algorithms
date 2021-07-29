package com.example.helloworld;
import java.util.*;
//
//
public class HelloWorld {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};
        System.out.println((Arrays.toString(reverse(array, array.length))));
    }
    public static int[] reverse(int[] array , int n ) {
       int []newArr = new int[n];
       int length = n;
        for (int i = 0; i < n; i++) {
            newArr[length -1 ] = array[i];
            length= length-1;
        }
        return newArr;
        }
}