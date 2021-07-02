/* 패키지
    1. 서로 관련된 클래스의 묶음
    2. 클래스는 클래스 파일, 패키지는 폴더, 하위 패키지는 하위 폴더에 있다.
    3. 클래스 패스: 클래스 파일의 위치를 알려주는 경로이다. - 환경변수(os) classpath에 등록하여 루트를 등록해준다.

    4. static import문 = static멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.
    import static java.lang.Math.random;

    math.random(); -> random();
 */

/* 제어자(modifier) - 형용사 역할
클래스와 클래스의 멤버(멤버 변수, 메서드)에 부가적인 의미를 부여한다.
1. 접근 제어자: public, protected, (default), private
2. 그외: static, final, abstract, native, transient, synchronized, volatile, strictfp

특징: 하나의 대상에 여러 제어자를 같이 사용 가능하다. (접근 제어자는 하나만.)
ex] public static final int WIDTH = 200;
 */

/* final - 마지막의, 변경될 수 없는
final - 클래스: 변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다.
               그래서 final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
      - 메서드: 변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해 재정의 할 수 없다.
      - 멤버, 지역변수: 변수 앞에 final이 붙으면, 값을 변경할 수 없는 상수가 된다.
 */


/* abstract - 추상의, 미완성의
abstract - 클래스: 클래스 내에 추상 메서드가 선언되어 있음을 의미한다.
abstract - 메서드: 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알린다.

abstract class AbstractTest{ // 추상 클래스(추상 메서드를 포함한 클래스)
    abstract void move(); // 추상 메서드(구현부가 없는 메서드)

=> 미완성 설계도라는 뜻이기 때문에 제품 생성(객체 생성) 불가하다.
추상 클래스의 인스턴스 생성 불가.

 */

/* 접근제어자(access modifier)
1. private:  같은 클래스 내에서만 접근이 가능하다
2. default: 같은 클래스 + 같은 패기지 내에서만 접근 가능
3. protected: 같은 클래스 + 같은 패키지+ 다른 패키지의 자손 클래스에서 접근이 가능하다
4. public: 접근 제한이 전혀 없다.
*/

class Packages1 {
    private int prv; // 같은 클래스
            int dft; // 같은 패키지(= 같은 파일)
    protected int prt; // 같은 패키지 + 자손(다른 패키지 자손도 가능하다.)
    public int pub; // 접근 제한 없음

    public void printMember(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

public class Packages {
    public static void main(String[] args){
        Packages1 x = new Packages1();
        // System.out.println(x.prv); // 에러
        System.out.println(x.dft); // ok
        System.out.println(x.prt);
        System.out.println(x.pub);
    }
}


