package com.sparta.cm.bubblesort;

public class BubbleSort {
    public static int[] bubbleSort(int[] array){

        int totalSwaps = 0;
        int totalComparisons = 0;
        //outer loop
        for(int pass = 0; pass<array.length;pass++) {
            //pass
            int swapsOnPass = 0;
            for (int position = 0; position < array.length -pass; position++) {
                if(position+1>= array.length){
                    break;
                }
                else if (array[position + 1] < array[position]) {
                    array = swap(array, position);
                    swapsOnPass++;
                    totalComparisons++;
                    totalSwaps++;
                }else{
                    totalComparisons++;
                }
            }
            if (swapsOnPass==0){
                System.out.println("no more swaps");
                break;
                //this isn't necessary it just wastes less time on a sorted list
            }
        }
        System.out.println("no of comparisons: "+totalComparisons);
        System.out.println("no of swaps: " + totalSwaps);
        return array;
    }

    private static int[] swap(int[] array, int position) {
        int temp = array[position + 1];
        array[position + 1] = array[position];
        array[position] = temp;
        return array;
    }
}
