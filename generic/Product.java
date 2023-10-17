package org.study.run.exam02;
// 제네릭 타입
//Product 클래스 정의
public class Product<K,M> { // 타입 파라미터 K와 M 정의
    // 대문자 obj로 인식
    //private 사용하므로 get, set
    //필드
    private K kind; // 제품의 종류를 나타내는 변수
    private M model; // 제품의 모델을 나타내는 변수

    //메소드
    //타입 파라미터를 리턴 타입과 매개변수 타입으로 사용
    public K getKind() {return kind;} //K 변수값을 반환하는 메소드
    //kind 변수에 제품의 종류(K)를 설정하는 setKind 메소드
    public void setKind(K kind) {this.kind = kind;}
    public M getModel() {return model;} //model 변수값을 반환하는 메소드
    // model 변수에 제품의 모델(M)을 설정하는 setModel 메소드
    public void setModel(M model) {this.model = model;}
}
