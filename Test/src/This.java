public class This {
    public static void main(String[] args){
        Car car1 = new Car();
        Car car2 = new Car("blue", "hi", 4);
        System.out.println("hello");
        System.out.println(car2.color);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    Car(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }

    Car(){
        this("white", "auto", 4);
    }

    /*
    Car(){
    color = "yello";
    gearType = "auto";
    door = 4
    */


}




/*
생성자 this() = 생성자에서 다른 생성자를 호출할 때 사용한다.
주의: 다른 생성자 호출시 첫 줄에서만 사용 가능하다.
 */