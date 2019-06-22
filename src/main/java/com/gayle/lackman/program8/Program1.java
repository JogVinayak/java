package com.gayle.lackman.program8;

//Assume you have a method isSubstring which checks if one word is a substring of
//another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using
//only one call to isSubstring (i.e., “waterbottle” is a rotation of “erbottlewat”).

public class Program1 {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "ohlel";

        System.out.println( isRotation(str1, str2)? "Yes rotation ": "No its not a rotation" );

    }

    public static boolean isRotation(String str1, String str2){
        boolean result = false;

        if(str1.length() != str2.length()){
            return false;
        }else{
            for(int i = 0; i<str1.length(); i++){
                str1 = rotateOnce(str1);
                System.out.println(str1);
                if(str2.equals(str1)){
                    return true;
                }
            }
        }
        return result;
    }

    public static String rotateOnce(String str){
        char[] a = str.toCharArray();

        char firstChar = str.charAt(0);

        for(int i=0; i<a.length-1; i++){
            a[i] = a[i+1];
        }
        a[a.length -1 ] = firstChar;

        return new String(a);
    }
}
