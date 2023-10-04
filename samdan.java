package xece;

public class samdan {
    public static void main(String[] args) {
        int dan = 3; // 원하는 숫자를 입력하면 구구단 바뀜
        for (int i = 1; i<= 9; i++) { // i가 1이 되면 계속 만족이라 반복
             System.out.printf("%2d * %2d = %2d", dan, i, dan*i);
            System.out.println(); //다음줄로 넘기기
           // System.out.printf("%2d / %2d = %4.2f", dan, i, (float) dan / i);
//            System.out.println();

        }
    }
}

