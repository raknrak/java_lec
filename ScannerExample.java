package com.mystudy.run;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX); //정수의 값으로 파싱, 정수의 값으로 맞춤

        System.out.println("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        while (true){
            //중괄호 {}안을 무한히 반복 실행
            //true = 1
            System.out.println("입력 문자열: ");
            String data = scanner.nextLine();
            if(data.equals("q")) {
            //입력된 문자열이 q라면 반복 중지
                break;
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();//한줄 띄우기 위해
            //아니면 System.out.println("출력 문자열: " + data'\n');
        }

        System.out.println("종료");

    }
}