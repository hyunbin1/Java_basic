
class Objects {
    
    // 1. 클래스 작성 -> 2. 객체생성(리모컨) -> 3. 객체 사용(리모컨)
    public static void main(String[] args) {
        // 클래스 만들기 - 객체 = 속성(변수) + 기능(메서드)
        // 클래스 = 제품의 설계도, 객체 = 하나의 제품
        // 객체를 사용하는 것 = 객체가 가진 속성과 기능을 사용한다는 것.
        class Tv {

            // 속성
            String color; // 색상
            boolean power; //전원상태
            int channel; // 채널

            //기능
            void power(){ power = !power; }
            void channelUp(){ channel++; }
            void channelDown(){ channel--; }
            
        }

        Tv remote;
        remote = new Tv();
        remote.channel = 7;
        remote.channelDown();
        System.out.println("현재 채널은 "+ remote.channel + " 입니다.");


        // 객체 생성과 사용
        /* 1. 객체의 생성
            클래서명 변수명; // 클래스 객체를 참조하기 위한 참조변수 선언
            변수명 = new 클래스명(); // 클래스 객체 생성 후, 객체의 주소를 참조 변수에 저장

            ex]
                TV remote; // tv 클래스 타입의 참조변수 리모컨 선언
                remote = new TV(); // 리모컨
        */

        /* 2. 객체의 사용
        remote.channel = 7; // Tv인스턴스의 멤버변수 channel의 값을 7로 한다.
        remote.channelDown(); // Tv인스턴스의 메서드 channelDown()을 호출한다.

        
        */

    }
}