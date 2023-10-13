package com.mystudy.except;

public class ExceptionHandling1 {
    // 매개변수로 문자열을 받는 printlength라는 비공개 메소드
    private static void printLength(String data){
        //메소드에 입력된 문자열의 길이를 가져옴
        int result = data.length();
        //입력 문자열이 null인 경우 lengrh() 메소드를 호출하면 NullpPointerException이 발생함
        System.out.println("문자수: "+ result);
    }

    public static void main(String[] args) {
        System.out.println("[프로그램 시작]\n");
        // 문자열의 길이가 계산 및 출력
        printLength("ThisIsJava");
        // null 인수로 printLength메소드 호출
        // null 객체에서 length()를 호출할 수 없음
        //예외가 발생한 후 프로그램이 종료
        printLength(null); //NullPointerException 오류 발생

        // 이전 라인에서 오류가 발생했기 때문에 출력되지 않음
        System.out.println("[프로그램 종료]");
    }

}
