
/* 오버라이딩: 상속받은 조상의 메서드를 자신에 맞게 변경하는 것이다.
주의: 선언부는 바꿀 수 없고, 구현부{} 내용만 변경 가능하다.

오버라이딩 조건:
    1. 선언부가 조상 클래스의 메서드와 일치해야된다.
    2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
        cf) 접근 제어자: public, private, protected
    3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다(8장)

오버로딩 vs 오버라이딩:
    오버로딩: 이름만 같을 뿐 기존에 없는 새로운 메서드를 정의하는 것이다(new)
    오버라이딩: 상속받은 메서드의 내용을 변경하는 것이다.(change, modify)
 */


public class OverRiding {
    public static void main(String[] args){
        Point1 p = new Point1(3,5);

    }

}

class Point1 { // 2차원 좌표
    int x;
    int y;

    //생성자
    Point1(int x, int y) {
    this.x = x;
    this.y = y;
    }

    // object클래스의 toString()을 오버라이딩 한다.
    public String toString(){
        return "x:" + x +"y:" + y;
    }
}
//
//class Point3D extends Point1 {
//    int z;
//    String getLocation(){
//        return "x:" + x +"y:" + y + "z" + z;
//    }
// }
