package com.mystudy.binary;

public class conditionaloperation2 {
    public static void main(String[] args) {
        int score = 85;
        char grade; // 변수 선언 값이 없으므로 그냥 ;로 닫음

        if (score > 99)
             grade = 'A'; // char에는 ""(쌍따옴표)가 아닌 ''(따옴표)

        else if (score>89)
             grade = 'B';

        else  grade = 'C';
        System.out.println(score + "점은 " + grade + "등급입니다");
        //if문 리팩토링 버전이 else if임


        if (score>90) {
            grade = 'A';
            if (score > 80)
                grade = 'B';
            else
                grade = 'C';
        }
        System.out.println(score + "점은 "+grade+"등급입니다.");


    }
}
