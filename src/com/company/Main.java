package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int size = 6;
        Pair minmax = getMinMax(arr, size );
        System.out.println("Minimum element is = " + minmax.min);
        System.out.println("Maximum element is = " + minmax.max);
    }
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int arr[], int size){
        Pair minmax = new Pair();
        if (size == 1){
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]){
            minmax.max = arr[0];
            minmax.min = arr[1];
        } else {
         minmax.max = arr[1];
         minmax.min = arr[0];
        }
        for (int i = 2; i<size;i++ ){
            if (arr[i] > minmax.max){
                minmax.max = arr[i];
            } else if (arr[i]< minmax.min){
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
}
