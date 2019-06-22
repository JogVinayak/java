package com.gayle.lackman.program5;


//Write a method to replace all spaces in a string with ‘%20’
public class Program1 {
    public static void main(String[] args) {
        String str = "hello how are you";
        char [] a = str.toCharArray();

        int spaceCounter = 0;
        for(int i=0; i<a.length; i++){
            if(a[i] == ' '){
                spaceCounter++;
            }
        }

        System.out.println("There are : " + spaceCounter + " spaces in this sentence.");

        int newLength = spaceCounter * 2 + a.length;
        char[] a1 = new char[newLength];

        for(int i=0, j=0; i<a.length;  i++){
            if(a[i] == ' '){
                a1[j++] = '%';
                a1[j++] = '2';
                a1[j++] = '0';
            }else{
                a1[j++] = a[i];
            }
        }

        System.out.println(new String (a1));

    }
}
