package org.example;

public class BubbleSort {

    public static int[] sort(int[] arr){
        boolean pass = false;
        int current;
        while (pass==false){
            pass = true;
            for(int i = 0; i<arr.length-1; i++){
                current = arr[i];
                if(current > arr[i+1]){
                    arr[i] = arr[i+1];
                    arr[i+1] = current;
                    pass = false;
                }
            }
        }

        return arr;
    }
    public static int[] mergeTwoArrays(int[] first, int[] second){
        int totalLength = first.length + second.length;
        int[] arr = new int[totalLength];
        System.out.println("Total length is: " + totalLength);

        for (int i = 0; i<first.length; i++){
            arr[i] = first[i];
        }
        for (int i = 0; i<second.length; i++){
            arr[i+first.length] = second[i];
        }
        return arr;
    }
}
