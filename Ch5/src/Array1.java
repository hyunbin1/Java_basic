import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
//		배열 선언방법 1,2
		int[] score; // 1 - 참조변수가 만들어진다.
//		int sco[]; // 2
		
//		배열 생성방법:
		score = new int[5]; // int 타입의 값 5개를 저장할 수 있는 배열 생성
		
//		=> int[] score = new int[5]랑 동일
	
//****** 배열의 길이 ******
//		배열의 길이는 한번 생성하면 실행하는 동안 그 길이를 바꿀 수 없다.
//		=> 배열의 길이는 상수이다.
		int[] arr = new int[5];
		int tmp = arr.length;
		
//		===배열의 초기화===
		
//		int[] score = { 50, 60, 70, 80, 90 };
//		하지만 int[] score; score = {} 두 줄>로 나누면 에러가 난다.
		
		
//		배열의 모든 요소를 출력하기:
		System.out.println(Arrays.toString(score));
//		OR
	for(int i =0;i<score.length;i++) {
		System.out.println(score[i]);
		
	}
		
	}
	

}
