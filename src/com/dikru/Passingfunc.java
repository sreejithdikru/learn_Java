package com.dikru;

import java.util.Arrays;

public class Passingfunc {
    public static void main(String[] args) {
        int[] arr = {34,55,46,89};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }


    static void change(int[] arr) {
        arr[0] = 00;
    }
}
