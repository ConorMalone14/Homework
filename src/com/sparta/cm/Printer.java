package com.sparta.cm;

import com.sparta.cm.fibonacci.Fibonacci;

public class Printer {

    public void fibonacci(int numberOfSequence){

        int[] output = Fibonacci.getFibonacci(numberOfSequence);
        for(int position = 0; position<numberOfSequence; position++) {
            System.out.println("Position:" + position + " Output:" + output[position]);
        }
    }

    public void printArray(int[] array){

        for(int position = 0; position< array.length; position++) {
            System.out.print(array[position]+ ", ");
        }
        System.out.println("");

    }

}
