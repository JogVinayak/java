package com.gayle.lackman.program1;


// Implement algorithm to find all the characters in the given string are unique

// assume that characters being used are ascii values and considering them to be 256

import java.sql.SQLOutput;

public class Program1 {
    public static void main(String[] args) {
        String str = "abcda";
        boolean[] chRegister = new boolean[256];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(chRegister[ch - 0]){
                System.out.println("Found duplicate ! - " + ch);
            }else{
                chRegister[ch - 0] = true;
            }
        }
    }
}
