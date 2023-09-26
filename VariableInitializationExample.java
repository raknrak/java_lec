package com.mystudy.run;

public class VariableInitializationExample {
    public static void main(String[] args) {

        int value = 0;
        //  int value만 하면 변수가 선언되었지만 초기화 되지 않아 컴파일 에러
        int result = value + 10;

        //변수 result 값을 읽고 콘솔에 출력
        System.out.println(result);

    }
}
