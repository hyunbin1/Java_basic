/* 다형성: 여러 가지 형태를 가질 수 있는 능력
    - 조상 타입 참조변수로 자손 타입 객체를 다루는 것. => 유연함을 부여해준다.
    -> 찹조변수로 사용할 수 있는 멤버의 개수가 달라진다.
   
    주의: 자손 타입의 참조변수로 조상 타입의 객체를 가리키지는 못한다.

    Car c = new SmartCar();
    */
    
/* 참조변수의 형변환
    조상, 자손이 서로 참조변수 형변환이 가능하다.
    결론: 사용할 수 있는 멤버의 개수를 조절하는 것이다. 
    
    ex]
    FireEngine f = new FireEngine();

    Car c = (Car)f;
    FireEngine f2 = (FireEngine)c; 




*/
public class Polymorphism {
    
}
