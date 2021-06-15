
public class EX2_2 {
	/* 총 8개의 타입:
	 * 문자 - char
	 * 정수 - byte, short, int, long
	 * 실수 - float, double
	 * 논리 = boolean
	 */
	
	/* 변수, 상수, 리터럴
	 * 상수 - final int Max = 100;
	 * 리터럴 - 그 자체로 값을 의미하는 것 = 100, 200, "a", "abc" 등 값들을 지칭함.
	 * */
		
	// 리터럴의 접미사: long에는 마지막에 100L처럼 L을 적어준다.
	// 리터럴의 접미사: 실수 flora 1.4f처럼 f를 적어준다.
	
	/*
	 * int i = 100; // 10진수
	 * int cot = 0100; // 8진수
	 * int hex = 0x100; // 16진수
	 * int blue = 0b0101; // 2진수
	 * byte b // -128~127
	 * 
	 * */
	
	public static void main(String[] args) {
		// 변수
		int x = 4, y = 2; // 정수 타입
		char a1 = 'h'; // 한글자 문자 타입 - 작은 따음표
		String a2 = "Hello"; //여러글자 문자 - 큰 따음표
		double pi = 3.14; // 실수타입
		// final == 상수
		final int Max = 100; // 상수
		
		System.out.println(a2);
	}
	
}
