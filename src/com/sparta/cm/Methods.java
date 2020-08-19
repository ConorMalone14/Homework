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
    public static boolean isPalindrome(String input){
        if(input.length()<=1){
            return false;
        }
        boolean isPal=false;
        for(int i = 0; i <input.length();i++){
            if(input.charAt(i)==input.charAt((input.length()-1)-i)){
                isPal=true;
            }else{
                isPal=false;
                break;
            }
        }
        return isPal;
    }

    public static String findLongestPalindromeRecursively(String input) {
        String output = "";
        input = input.replaceAll(" ", "");
        for(int i=0; i<input.length(); i++) {
            char letterToFind = input.charAt(i);
            String excludeLetter = input.substring(i+1);
            String palindrome = recurPalindromeFinder(letterToFind,excludeLetter);
            if (output.length()<palindrome.length()){
                output=palindrome;
            }
        }
        return output;
    }
    private static String recurPalindromeFinder(char letter, String subString){

        int lastIndex = subString.indexOf(letter);
        if (lastIndex<0){
            return "";
        }
        String secondSubString = subString.substring(0, lastIndex+1);
        if(isPalindrome(letter+secondSubString)){
            return letter+secondSubString;
        }else{
            return recurPalindromeFinder(letter, secondSubString.substring(0,lastIndex-1));
        }
    }

}
