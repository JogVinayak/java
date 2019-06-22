package com.gayle.lackman.program4;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "helloween";

        char[] strChar1 = str1.toCharArray();
        char[] strChar2 = str2.toCharArray();
        Arrays.sort(strChar1);
        Arrays.sort(strChar2);

        System.out.println(new String (strChar1));
        System.out.println(new String (strChar2));

        if(strChar1.length > strChar2.length){

        }else if (strChar1.length < strChar2.length){

        }
    }
}
