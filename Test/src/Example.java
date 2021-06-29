
 class Example {
     public static void main(String[] args) {
         Tv t;
         t = new Tv();
         t.channel = 7;
         t.channelDown();
         System.out.println("현재 채널은" + t.channel + " 입니다.");

         // 객체 배열 == 참조변수 배열
         Tv pc1, pc2, pc3; //가 있을때 객체 배열은
         Tv[] tvArr = new Tv[3];
         tvArr[0] = new Tv();
         tvArr[1] = new Tv();
         tvArr[2] = new Tv();

         // 클래스 == 데이터 + 함수
         /*
         변수 -> 배열 -> 구조체로 발전 - 구조체 == 서로 다른 타입도 하나로 묶기 가능 -> 클래스: 변수 데이터 + 함수 => 서로 관련 없는
         데이터들을 하나로 묶기 가능
         */

        /* 선언위치에 따른 변수의 종류
        영역: 1. 클래스 영역(instance variable), 2. 매서드 영역(지역변수)
        cv = static+ iv - 클래스영역에 포함
        ex] 클래스에는 선언만 가능하다
        class Variables
        {
        int iv;
        static int cv;
        void method()
        {
            int lv = 0;
        }
        }

        */

         // 객체 속성 중 공통적인 것은 CV, 개별적인 속성들은 IV로 한다.

        System.out.println("Card.width = " + Card.width);

         Card c1 = new Card();
         c1.kind = "HEART";
         c1.number = 5;
         // 클래스 변수는 인스턴스 변수와 구별하기 위해 앞에 클래스 명을 사용한다.
         // Card.height = 300;

     }
}
// class Tv {
//     String color;
//     boolean power;
//     int channel;
//
//     void power() {
//         power = !power;
//     }
//
//     void channelUp() {
//         ++channel;
//     }
//
//     void channelDown() {
//         --channel;
//     }
// }
//
 class Card{
     String kind; // 무늬
     int number; // 숫자
     static int width = 100; // 폭
     static int height = 250; // 넓이
 }