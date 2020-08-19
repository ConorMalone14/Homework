package com.sparta.cm;

public class Printer {

    public void fibonacci(int numberOfSequence){
        Methods m = new Methods();
        int[] output = m.getFibonacci(numberOfSequence);
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
