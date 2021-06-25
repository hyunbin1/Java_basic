public class Overloading {

    int add(int a, int b ){
        System.out.print("int add(int a, int b - ");
        return a + b;
    }

    long add(long a, long b){
        System.out.print("long add(long a, long b ) - ");
        return a + b;
    }

    int add(int[] a){
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i=0; i < a.length; i++)
            result += a[i];
        return result;
    }


    public static void main(String[] args){

    }
}


/* 오버로딩: 과적하다 - 한 클래스 안에 같은 이름의 매서드 여러개를 정의한다.
    즉, 하나의 매서드를 사용해도 서로 타입이 다른 것들을 사용해도 된다는 것이다.

    오버로딩이 성립하기 위한 조건:
        1. 매서드 이름이 같아야 한다.
        2. 매개변수의 개수 또는 타입이 달라야 한다.
        3. 반환 타입은 영향이 없다.
* */