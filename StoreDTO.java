import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
//3개 한 세트
//모든 변수를 파라미터로 받는 생성자 자동완성
@AllArgsConstructor
/*해당 클래스의 객체의 생성에 Builder패턴 적용
모든 변수들에 대해 build하기를 원한다면 클래스 위에
특정 변수만을 build하기 원한다면 생성자를 작성하고 그 위에*/
@Builder
//파라미터 없는 기본 생성자 자동완성
@NoArgsConstructor


public class StoreDTO {
    //private = 접근금지 get,set만 가능
    private String name;
    private double lat, lng;
    private String menu;
    private double score;

}
