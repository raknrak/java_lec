package com.mystudy.array;

import java.util.Scanner;

//if~else, if~else를 사용하여 학점을 구하는 프로그램 작성
//조건 90점 이상이면 A
//80점 이상이면 B
//70점 이상이면 C
//60점 이상이면 D
//그 외는 F
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner 객체를 생성하여 키보드 입력을 읽을 준비

        System.out.println("점수를 입력하세요: ");

        int score = scanner.nextInt();
        // 입력받은 정수를 변수 score에 저장
        char grade;
        //학점을 저장할 변수 선언

        if (score >= 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        //입력된 점수에 따라 학점이 결정
        System.out.println("당신의 학점은 :" + grade);

        scanner.close();
        //scanner객체를 닫아 리소스 해체
    }

}








