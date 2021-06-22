
 class Example {
     public static void main(String[] args) {
         class Tv {
             String color;
             boolean power;
             int channel;

             void power() {
                 power = !power;
             }

             void channelUp() {
                 ++channel;
             }

             void channelDown() {
                 --channel;
             }
         }

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
     }
}