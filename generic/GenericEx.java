package org.study.run.exam02;

public class GenericEx {
    public static void main(String[] args) {

        //Tv는 변수가 아닌 클래스
        //Generic을 사용하는 이유는 클래스를 넣기 위해 사용
        //VO를 집어넣기 위해
        //타입을 원하는 형태로 바꿀 수 있음
        //K는 TV로, M은 String으로 대체
        //product1은 TV 타입의 kind와 String 타입의 model
        Product<Tv, String> product1 = new Product<>();
        //Setter 매개값은 Tv와 String 제공
        //Tv 객체를 생성하고 kind 변수에 할당
        product1.setKind(new Tv());
        //모델 정보 설정
        product1.setModel("스마트 TV");

        //Getter 리턴값은 Tv와 String이 됨
        //kind 변수에서 TV 객체를 가져와서 tv 변수에 저장
        Tv tv = product1.getKind();
        //model 변수에서 모델 정보를 가져와서 tvModel 변수에 저장
        String tvModel = product1.getModel();
// -----------------------------------------------
        //K는 Car로 M은 String으로 대체
        //product2는 Car 타입의 kind와 String 타입의 model을 가짐
        Product<Car, String> product2 = new Product<>();
        //Setter 매개값은 Car와 String 제공
        //Car 객체를 생성하고 kind 변수에 할당
        product2.setKind(new Car());
        //모델 정보 설정
        product2.setModel("SUV자동차");
        //kind 변수에서 Car 객체를 가져와서 car 변수에 저장
        Car car = product2.getKind();
        //model 변수에서 모델 정보를 가져와서 carModel 변수에 저장
        String carModel = product2.getModel();

    }
}
