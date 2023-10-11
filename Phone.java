package com.mystudy.inheretance.exam01;

public class Phone {

    //필드 선언
    public String model;
    public String color;

    //메소드 선언
    public void bell(){
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void recieveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hanfup() {
        System.out.println("전화를 끊었습니다.");
    }
}
