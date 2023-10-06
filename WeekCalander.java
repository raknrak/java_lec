package com.mystudy.enumtest;
//Calendar는 java.util패키지에 있으므로 import 필요
import java.util.Calendar;

public class WeekCalander {
    public static void main(String[] args) {
        //enum을 가져옴
        //Week 열거 타입 변수 today 선언
        Week today = null;

        //calendar 얻기
        //컴퓨터 날짜 및
        Calendar cal = Calendar.getInstance();

        //요일 얻기(1~7)
        int week = cal.get(Calendar.DAY_OF_WEEK);
        //숫자를 열거 상수로 변환해서 변수에 대입
        switch (week) {
            case 1: today = Week.SUNDAY; break;
            case 2: today = Week.MONDAY; break;
            case 3: today = Week.TUESDAY; break;
            case 4: today = Week.WEDNESDAY; break;
            case 5: today = Week.THURSDAY; break;
            case 6: today = Week.FRIDAY; break;
            case 7: today = Week.SATURDAY; break;

        }

            //열거 타입 변수 사용
            if(today == Week.SUNDAY) { // 명령이 한 줄 일때는 생략해도 됨
                //사용하는 이유 헷갈리지 말기, 코드가 추가될 경우를 대비
                System.out.println("일요일에는 축구를 합니다");
            } else {
                System.out.println("열심히 자바를 공부합니다.");
            }
    }
}
