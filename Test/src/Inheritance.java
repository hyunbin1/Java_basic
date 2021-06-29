import java.awt.*;

class Tv {
    boolean power; // 전원상태
    int channel; // 채널

    void power() { power = !power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }
}

class SmartTv extends Tv{
    boolean caption;
    void displayCaption(String text){
        if (caption){ //만약 캡션이 true이면 text를 보여준다.
            System.out.println(text);
        }
    }
}

public class Inheritance{
    public static void main(String[] args){
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello, world");
        stv.caption = true;
        stv.displayCaption("hi");
    }
}
/* 클래스의 관계: 1. 상속, 2. 포함
2. 포함이란: 클래스의 멤버로 참조변수를 선언하는 것.
상속 혹은 포함 둘중의 하나를 고를때 방법:
1. 원은 점이다. - 상속관계(is -a)
2. 원은 점을 가지고 있다. - 포함관계(has - a) 90%는 포함이다.

*/
class Circle1 {
    int x; // 원점의 x좌표
    int y; // 원점의 y좌표
    int r; // 원의 반지름
}

// Circle1과 동일.
class Point {
    int x;
    int y;
}

class Circle2 { // Point클래스를 Circle에 포함시킨 포함관계이다.
    // 다른 클래스 타입의 객체를 선언하고, 참조변수를 만들어 준 것이다.
    Point c = new Point(); // 원점
    int r;//반지름
}

/* Object 클래스: 모든 클래스의 조상이다.
조상이 없는 클래스는 자동적으로 Object클래스를 상속받는다.
그렇기 때문에 모든 클래스는 Object클래스에 정의된 11개의 메서드를 상속받는다.
ex] toString(), equals(Object obj), hashCode(), ...
*/






