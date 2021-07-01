/*
참조변수 super:
    1. 객체 자신을 가리키는 참조변수, instance method(=생성자)내에서만 존재한다 == static 메서드 내에서 사용 불가.
    2. this가 local 변수와 instance 변수 구별에 사용되었다면, super은 조상의 멤버와 자신의 멤버를 구별할때 사용한다.
    3. 조상에만 멤버가 있다면, 조상에는 this, super 둘다 사용이 가능하다.
*/

public class Super {
    public static void main(String[] args){
        Child c = new Child();
        c.method();
        Point2 p3 = new Point3D1(1,3,4);

   }
}


class Parent { int x = 10; }// super.x

class Child extends Parent{
    int x  = 20; // this.x - 조상과 이름이 겹칠때, 조상은 super을 붙이고 자기멤버에는 this를 붙인다.

    void method(){
        System.out.println(x); //20
        System.out.println(this.x); // 20
        System.out.println(super.x); // 10
    }
}


/* suepr() = 조상의 생성자
1. 조상의 생성자를 호출할 때 사용 - 생상자와 초기화 블럭은 상속이 안된다.
2. 조상의 멤버는 조상의 생성자를 호출해서 초기화한다.

주의: 자손의 생성자는 자신이 생성한 iv만 초기화해야된다. - 이때 조상의 생성자를 호출하여 조상의 멤버를 초기화 하는 것이다.
*/

class Point2{
    int x;
    int y;

    Point2(int x, int y){


        this.x = x;
        this.y = y;

    }
}

class Point3D1 extends Point2{
  int z;
    Point3D1(int x, int y, int z){
        /*      생성자의 첫줄에 생성자를 호출하지 않으면 컴파일러가 생성자의 첫 줄에 super();을 삽입한다. - Object의 생성자를 가져오는 것이다.
            super();
            this.x = x;
            this.y= y;
            따라서 아래와 같이 하면 된다.
            */
        super(x,y); // 조상의 생성자를 호출한다.
        this.z = z;
}
}












