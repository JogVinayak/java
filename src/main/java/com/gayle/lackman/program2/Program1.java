package com.gayle.lackman.program2;


// reverse the string
public class Program1 {
    public static void main(String[] args) {
        String str = "kim";
        System.out.println(str);
        str = reverseString(str);
        System.out.println(str);
    }

    public static String reverseString(String str){
        char [] a = str.toCharArray();
        for(int i=0, j=a.length -1 ; i<a.length /2; i++, j--){
            char temp = a[j];
            a[j] = a[i];
            a[i] = temp;
        }
        return new String(a);
    }
}
