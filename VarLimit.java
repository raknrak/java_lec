package com.mystudy.run;

public class VarLimit {
    public static void main(String[] args) {

        byte i = 127;
        byte j = 4;
        byte sum = 0;

        sum = (byte) (i + j);
        // 강제형 변환

        System.out.println(i + "+" + j + "="+ sum);
    }
}
//127 초과하여 임의의 값이 결과값으로 출력됨