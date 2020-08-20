package com.sparta.cm.fibonacci;

public class Fibonacci {
    public static int[] getFibonacci(int numberOfSequence){
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
    private static int getRecursiveIntFib(int num){
        if (num==1){
            return 1;
        }else if(num==0){
            return 0;
        }else{
            return getRecursiveIntFib(num-1) + getRecursiveIntFib(num-2);
        }

    }
    public static int[] getRecursiveFibonacci(int sequenceLength){
        int[] sequence = new int[sequenceLength];
        for(int i= sequenceLength-1;i>=0;i--){
            sequence[i]=getRecursiveIntFib(i);
        }
        return sequence;
    }
    public static int[] getRecursiveFibonacciWithEvenMoreRecursion(int sequenceLength){
        int[] sequence = new int[sequenceLength];
        recur(sequenceLength-1, sequence);
        return sequence;
    }
    private static int[] recur(int numOfSequence, int[] sequence){
        if (numOfSequence>=0) {
            sequence[numOfSequence] = getRecursiveIntFib(numOfSequence);
            recur (numOfSequence - 1, sequence);
        }
        return sequence;
    }
}
