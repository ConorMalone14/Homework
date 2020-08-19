package com.sparta.cm;

public class Methods {

    public int[] getFibonacci(int numberOfSequence){
        int[] sequence = new int[numberOfSequence];

        for(int position = 0; position<numberOfSequence;position++){
            if(position == 0){
                sequence[0]=0;
            }else if(position==1){
                sequence[1]=1;
            }else{
                sequence[position]= sequence[position-1]+sequence[position-1];

            }

        }
        return sequence;
    }
    public int[] bubbleSort(int[] array){

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
                    int temp = array[position + 1];
                    array[position + 1] = array[position];
                    array[position] = temp;
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
            }
        }
        System.out.println("no of comparisons: "+totalComparisons);
        System.out.println("no of swaps: " + totalSwaps);
        return array;
    }

}
