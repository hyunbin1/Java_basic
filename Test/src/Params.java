
// 기본형 매개변수: 변수의 값을 읽기만 할 수 있다. (8개)
// 참조형 매개변수: 번수의 값을 읽고 변경할 수 있다.

import java.lang.ref.Reference;
import java.util.concurrent.SubmissionPublisher;

//참조형 변수 클래스
class ReferenceParam { int referenceParamValue; }
//참조형 반환 클래스
class ReferenceReturn { int referenceReturnValue; }


// 메인 파라미터 출력
class Params {
    // change 매서드 생성하기
    static void changeMethod(ReferenceParam result1){ // 참조형 매개변수
        result1.referenceParamValue = 1000;
        System.out.println("changeMethod() : referenceParamValue = " + result1.referenceParamValue);
    }

    // copy 매서드 생성
    static ReferenceReturn copyMethod(ReferenceReturn data){
        ReferenceReturn tmp = new ReferenceReturn();
        tmp.referenceReturnValue = data.referenceReturnValue;
        return tmp;
    }




    public static void main(String[] args){
    //참조형 변수 클래스
    ReferenceParam result1 = new ReferenceParam();
    result1.referenceParamValue = 10;
    System.out.println("main(): referenceParamValue = " + result1.referenceParamValue);

    changeMethod(result1); //매서드 사용
    System.out.println("After changeMethod result1 " + "main() : referenceParamValue = " + result1.referenceParamValue);



    //참조형 반환 클래스
    ReferenceReturn data = new ReferenceReturn();
    data.referenceReturnValue = 40;

    ReferenceReturn result = copyMethod(data);
    System.out.println("data.referenceReturnValue = "+ data.referenceReturnValue);
    System.out.println("data.result = "+ result.referenceReturnValue);







    }


}



