package com.mystudy.myclass.exam01;

public class CarExample {
    public static void main(String[] args) {
        //car 객체 생성
        Car myCar = new Car();

        //car 객체의 필드값 읽기
        System.out.println("제작회사:" + myCar.company);
        System.out.println("모델명:" + myCar.model);
        System.out.println("색깔:" + myCar.color);
        System.out.println("최고속도:" + myCar.maxSpeed);
        System.out.println("현재속도:" + myCar.speed);

        // 클래스만 있고 입력된 값이 없기 때문
        // 변수는 초기화 해야하지만, 클래스는 초기화 할 필요 없이 초기값으로 출력
        // stack을 제외한 영역에 들어가는 memory는 초기화 선언을 하지 않아도 초기값이 입력되어있음.

        //Car 객체의 필드값 변경
        myCar.speed = 60;
        System.out.println("수정된 속도: " + myCar.speed);  //수정된 값으로 출력
    }
}
