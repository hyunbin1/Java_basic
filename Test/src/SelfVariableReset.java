
/* 변수의 초기화

지역변수는 수동 초기화를 해야한다. 꼭 사용전!!
public class SelfVariableReset {
    int x;
    int y=x; // 자동 초기화 해서 가능하다
    void method1() {
        int i;
        int j = i; // 에러가 난다.
    }

}
 */


/* 멤버 변수의 초기화
방법 1. 명시적 초기화(선언시 =를 사용한다)
class Car{
    int door =4; // 기본형 변수의 초기화
    Engine e = new Engine(); // 참조형 변수의 초기화

방법 2. 초기화 블럭 - 복잡한 초기화에 사용한다.
   인스턴스 초기화 블럭: {}
   클래스 초기화 블럭: static {}

방법 3. 생성자
Car(String color, String gear){
    this.color= color;
    this.gear= gear;
}
*/