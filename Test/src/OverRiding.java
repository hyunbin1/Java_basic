/* 오버라이딩: 상속받은 조상의 메서드를 자신에 맞게 변경하는 것이다.
주의: 선언부는 바꿀 수 없고, 구현부{} 내용만 변경 가능하다.
 */


public class OverRiding {

}

class Point1 { // 2차원 좌표
    int x;
    int y;

    String getLocation(){
        return "x:" + x +"y:" + y;
    }
}

class point3D extends Point1 {
    int z;
    String getLocation(){
        return "x:" + x +"y:" + y + "z" + z;
    }
}