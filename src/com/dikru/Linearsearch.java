package com.dikru;

public class Linearsearch {
    public static void main(String[] args) {

        int[] num = {12, 345, 65, 54, 67, 88};
        int target = 65;
        int ans = linearSearch(num, target);
        System.out.println("yes in the position");
        System.out.println(ans);

    }

        static int linearSearch(int[] arr,int target) {
            if(arr.length==0){
                return -1;
            }
            for(int index=0; index<arr.length;index++){
                int element = arr[index];
                if (element==target){
                    return index;
                }
            }
            return -1;
        }
    }
