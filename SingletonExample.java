package com.mystudy.myclass.exam03;

public class SingletonExample {
    public static void main(String[] args) {

//        Singleton obj1 = new.Singleton; 컴파일 에러 new 사용 안함
//        Singleton obj2 = new.Singleton; 컴파일 에러

        Singleton obj1 = Singleton.getSingleton();
        Singleton obj2 = Singleton.getSingleton();

        if(obj1 == obj2){
            System.out.println("같은 Singleton 객체입니다.");
        }
        else {
            System.out.println("다른 Singleton 객체입니다.");
        }

    }
}
