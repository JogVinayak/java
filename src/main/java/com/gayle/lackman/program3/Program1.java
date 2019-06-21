package com.gayle.lackman.program3;

// Remove duplicates in a give string

public class Program1 {

    public static void main(String[] args) {
        String  str = "Hello ji kaise";
        System.out.println(str);
        str = removeDuplicates(str);
        System.out.println(str);

    }
    public static String removeDuplicates(String str){
        char[] a = str.toCharArray();
        int tail = 0;
        for(int i=0; i<a.length; i++){
            int j = 0;
            for(j=0; j<tail; j++){
                if (a[i] == a[j]) break;
            }
            if (j == tail) {
                a[tail] = a[i];
                ++tail;
            }
        }

        a[tail] = 0;

        return new String (a);
     }
}
