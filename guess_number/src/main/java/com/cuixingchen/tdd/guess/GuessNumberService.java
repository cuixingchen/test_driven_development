package com.cuixingchen.tdd.guess;

/**
 * Created by cuipengfei1 on 2018/5/16.
 */
public class GuessNumberService {
    public static String deal(String input) {
        if(input==null||input.length()!=4){
            throw new IllegalArgumentException("参数非法");
        }
        String target="1234";
        int a=0;
        int b=0;
        for (int i=0;i<4;i++) {
            if(target.substring(i,i+1).equals(input.substring(i,i+1))){
                a++;
            }else if (target.contains(input.substring(i,i+1))) {
                b++;
            }
        }
        return a+"A"+b+"B";
    }
}
