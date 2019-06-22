package com.gayle.lackman.program4;


// check the two strings are anagrams

import java.util.HashMap;

public class Program1 {
    public static void main(String[] args) {
        String str2 = "cap";
        String str1 = "tux";

        System.out.println(checkAnagram(str1, str2)? "Is a anagram" : "Is not a anagram");
    }

    public static boolean checkAnagram(String str1, String str2){
        HashMap<Character, Integer> mapString1 = new HashMap<>();
        HashMap<Character, Integer> mapString2 = new HashMap<>();

        int shortMap = 0;
        for(int i=0; i<str1.length(); i++){
            mapString1.put(str1.charAt(i), mapString1.getOrDefault(str1.charAt(i), 0) + 1);
        }

        //
        for (int i=0; i<str2.length(); i++){
            mapString2.put(str2.charAt(i), mapString2.getOrDefault(str2.charAt(i), 0) + 1 );
        }

        System.out.println(mapString1);
        System.out.println(mapString2);

        if (mapString1.keySet().size() > mapString2.keySet().size()){
            System.out.println("Map string 1 is bigger ");
            for(Character key: mapString2.keySet()){
                if(mapString2.get(key) != mapString1.get(key)){
                    return false;
                }
            }
        }else if (mapString1.keySet().size() == mapString2.keySet().size()) {
            System.out.println("Two maps are equal size ");
            for(Character key: mapString1.keySet()){

                if(mapString1.get(key) != mapString2.get(key)){
                    return false;
                }
            }
        }else{
            System.out.println("Map string 2 is bigger ");
            for(Character key: mapString1.keySet()){
                if(mapString1.get(key) != mapString2.get(key)){
                    return false;
                }
            }
        }

        return true;
    }
}
