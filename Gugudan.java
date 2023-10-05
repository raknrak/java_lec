package xece;

import java.util.Scanner;

public class Gugudan {

    public static void main(String[] args) {
        while (true) {

            System.out.print("구구셈 - 원하는 단을 입력(0또는1이면 종료) : ");
            Scanner scanner = new Scanner(System.in);

            String strX = scanner.nextLine();
            int dan = Integer.parseInt(strX);

            if (dan == 0 || dan == 1) break;
            //while 문 안에 if - break 입력

            for (int i = 1; i <= 9; i++) {
                System.out.printf("%2d * %2d = %2d", dan, i, dan * i);
            }
        }
    }
}




