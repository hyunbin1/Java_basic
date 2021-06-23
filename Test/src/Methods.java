


// 매서드: 이름이 있는 하나의 작업을 하는 것. - 클래스 안에 있어야한다.
        /*
        방법: 반환할타입(출력) 메서드 이름(매겨변수 선언(입력=작업에 필요한 정보) -> 타입 변수명){}
        ex] int hi(int x, int y){
        int result = x+y;
        return result; // 결과 반환

        반환할 것이 없을 때: int hi 대신 void hi로 적는다


//매서드 호출(사용): 1. 작업 결과가 따로 저장할 필요 없는 경우
        printArr(numArr);
//매서드 호출(사용): 2. 작업 결과가 따로 저장해야될 경우 - 변수 넣어주기

        int result = add(3,5);

    }

    private static int add(int i, int i1) {
    }

    static void printArr(int[] numArr) {
        for(int i = 0; i<10; i++){
            System.out.println("%d", numArr[i]);
        }
    }
     */

//매서드 만들기
class MyMath {
    long add(long a, long b){ // static 없는 것은 인스턴트 매서드라고 한다.
        return a+b;
    }

    static long added(long a, long b){ //static 매서드 혹은 클래스 매서드라고 부른다.
        return a+b;
    }
    /* 인스턴스 매서드
    1. 인스턴스 생성 후, '참조변수.매서드이름()' 으로 호출
    2. 인스턴스 멤버(iv(instance variable), im(instance method))와 관련된 작업을 하는 매서드
    3. 매서드 내에서 인스턴스 변수 사용가능
    4. 클래스 전체에서 사용할수 있다.

     */

    /* static 매서드(class 매서드) - iv를 사용하면 static 을 붙일 수 없다.
    1. 객체생성 없이!! '클래스이름.매서드이름()'으로 호출
    2. 인스턴스 멤버와 관련없는 작업을 하는 매서드
    3. 매서드 내에서 인스턴스 변수 사용 불가.
    4. 유효범위: 선언된 위치부터 끝날때 까지.
     */








}

public class Methods {
    public static void main(String args[]) {
        MyMath result = new MyMath();
        long result1 = result.add(5L,3L); //add 매서드 호출
        double result2= result.add(5L,3L);

        System.out.println(result1);
        System.out.println(result2);
    }
}
