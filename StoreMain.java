public class StoreMain {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //builder().build(); -> 생성자가 많고 복잡할때
        StoreDTO storeDTO = StoreDTO.builder()
                .name("가게이름")
                .lat(37.1234)
                .lng(127.23332)
                .menu("쌈밥")
                .build();

        System.out.println(storeDTO);
    }
}
