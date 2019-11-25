package com.masa.flip;

public class FlipFunction {

    static void flip(String s){
        String [] words=s.split(" ");
        for (int i = words.length-1; i >=0 ; i--) {
            System.out.print(words[i]+" ");
        }
    }


}

