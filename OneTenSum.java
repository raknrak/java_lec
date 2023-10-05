package xece;

public class OneTenSum  {
    public static void main(String[] args) {

        int sum = 0;
//1부터 10 까지 더하기

        for(int i=1; i<10; i++)
            sum = sum + i;
        System.out.println("1~10 => sum : " +sum);
        //println 사용 할 때 문자열 + 변수, 변수 + 변수 일 때 변수 앞에 + 붙여야 출력 됨

    }
}
