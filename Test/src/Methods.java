


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
    long add(long a, long b){
        return a+b;
    }
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
