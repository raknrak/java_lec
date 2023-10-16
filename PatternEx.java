import java.util.regex.Pattern;

public class PatternEx {
    public static void main(String[] args) {
        // 정규표현식을 나타내는 문자열 정의
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        //데이터 문자열 정의
        String data = "010-123-4567";
        //정규표현식과 데이터 문자열을 비교하여 일치 여부 확인
        boolean result = Pattern.matches(regExp, data);
        //일치하면 실행됨
        if (result) {
            System.out.println("정규식과 일치합니다.");
            //일치하지 않을때 실행됨
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
        //이메일 주소의 형식을 확인하는 정규표현식
        regExp = "\\w+@\\w+\\. \\w+(\\. \\w=)?";
        // 이메일 주소 문자열 정의
        data = "angel@mycompanycom";
        // 정규표현식과 데이터 문자열을 비교하여 일치 여부 확인
        result = Pattern.matches(regExp, data);
        // 일치할 경우 실행
        if (result) {
            System.out.println("정규식과 일치합니다");
        //일치하지 않을 경우 실행
        } else {
            System.out.println("정규식과 일치하지 않습니다.");
        }
    }
}
