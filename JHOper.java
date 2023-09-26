package etc;

public class JHOper {

    public static void main(String[] args) {
        int a = 5;
        int sum = 0;

        System.out.println("a="+a+"sum="+sum);

        sum = a++ + ++a; // 5 -> (a++)6+7(++a)

        System.out.println("a="+a+"sum="+sum);

        sum = 0;
        sum += a++; //줄이 바뀌면 효과 소용 없음
        sum += ++a; // sum= sum ++a

        System.out.println("a="+a+"sum="+sum);

        for (int i = 0; i < 10; ++i)
            System.out.print(i + 1 + " ");

    }
}