package com.sparta.cm;

public class Main {

    public static void main(String[] args) {
        Printer p = new Printer();
        int[] array = {8,4,16,6,9,12};
        //p.fibonacci(10);
        //p.printArray(Methods.getFibonacci(10));
        //p.printArray(Methods.bubbleSort(array));
        //p.printArray(Methods.getRecursiveFibonacci(5));
        p.printArray(Methods.getRecursiveFibonacciWithEvenMoreRecursion(1));
    }
}
