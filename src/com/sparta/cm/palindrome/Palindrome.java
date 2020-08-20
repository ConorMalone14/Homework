package com.sparta.cm.palindrome;

public class Palindrome {
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

        int lastIndex = subString.lastIndexOf(letter);
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
