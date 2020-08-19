package com.sparta.cm;

public class Main {

    public static void main(String[] args) {
        Printer p = new Printer();
        Methods m = new Methods();
        int[] array = {8,4,16,6,9,12};
        //p.fibonacci(10);
        //p.printArray(m.getFibonacci(10));
        p.printArray(m.bubbleSort(array));

    }
}
