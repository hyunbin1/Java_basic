public class This {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("blue", "hi", 4);
        System.out.println("hello");
        System.out.println(car2.color);
    }
}

class Car {
    // 이부분이 iv(instance variable)
    String color;
    String gearType;
    int door;

    // 지역변수와 인스턴스 변수의 이름이 다를 때는 이런식으로 사용해주면 된다.
//    Car(String c, String g, int d){
//        color = c;
//        gearType = g;
//        door = d;
//    }


    // 지역변수와 인스턴스 변수의 이름이 같을 경우 this를 사용해준다.
   Car(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    // iv의 초기화(값 할당) 역할을 한다. - 파라미터가 아무것도 없다면 이는 디폴트 값이 된다. - 생성자 this를 사용한 것이다.
    Car(){
        this("white", "auto", 4);
    }



}




/*
생성자 this() = 같은 클래스에서 다른 생성자를 호출할 때 사용한다.
주의: 다른 생성자 호출시 첫 줄에서만 사용 가능하다.

참조변수 this: 괄호가 없다. 생성자 this()와 전혀 다른 연관없는 것이다.
특징:
    인스턴스 자신을 가리키는 참조변수
    인스턴스 메서드(생성자 포함)에서 사용 가능
    지역변수(lv)와 인스턴스 변수 (iv)를 구별할때 사용


 */