package org.study.lam.exam01;

public class LamdaEx {
    public static void main(String[] args) {
        //람다식은 클래스를 함수로
        action((x, y) -> {
            int result = x + y;
            System.out.println("result: "+ result);
        }); // result: 14

        action((x, y) -> {
            int result = x - y;
            System.out.println("result: "+ result);
        });//result: 6


    }
    //사용자 정의함수는 static 들어가야함
    public static void action(Calculable calculable){
        //데이터
        int x = 10;
        int y = 4;
        //데이터 처리
        calculable.calculate(x,y);
    }
}
