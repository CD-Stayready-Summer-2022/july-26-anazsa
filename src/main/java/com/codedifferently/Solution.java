package com.codedifferently;

import java.util.TreeMap;



public class Solution {
    public String howManyLettersDoYouSee(String input){
        TreeMap<Character,Integer> newMap = new TreeMap();
        char[] toChar = input.toCharArray();
       // int count =0;
        for (int i =0; i < toChar.length; i++){
            newMap.put(toChar[i],1);
            int count = newMap.get(toChar[i]);
            if(newMap.containsKey(toChar[i])){
                count++;
            }
            if(count > 0){
                newMap.put(toChar[i],count+1);
            }
        }        return newMap.toString();
    }
}
