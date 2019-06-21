package com.gayle.lackman.program1;

// find duplicate in a string without using extra array

public class Program2 {
    public static void main(String[] args) {
        String str = "Hello ji";
        int checker = 0;

        for(int i=0; i<str.length(); i++){
            int val = str.charAt(i) - 'a';
            if( (checker & (1 << val )) > 0 ){
                System.out.println("Duplicate found " + str.charAt(i));
            }else{
                checker |= (1 << val);
            }
        }
    }

}
