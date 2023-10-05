package com.mystudy.binary;

public class ConditionalOperation {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 99) ? 'A' : ((score >89) ? 'B' : 'C');
        System.out.println(score + "점은 " + grade + "등급입니다");
        //삼항연산자는 if 문을 간략하게 만든 것임
        //물음표 앞에는 괄호()를 입력하는 것이 예의

    }
}
