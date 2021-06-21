import java.util.Arrays;

public class Objects {

	public static void main(String[] args) {
        // 클래스 만들기 - 객체 = 속성(변수) + 기능(메서드)
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


    }
}