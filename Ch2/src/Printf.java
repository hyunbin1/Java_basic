
public class Printf {

	public static void main(String[] args) {
		// println - 출력형식 지정불가
			// 1. 실수의 자리수 조절 x, 2. 10진수로만 출력됨.
		System.out.println(10.0/3);
		
		//printf()로 출력형식 지정가능 - with 지시자
		System.out.printf("%d%n", 0x1A); // 26, 10진수
		System.out.printf("%x%n", 0x1A); // 1A, 16진수
		System.out.printf("age:%d year:%d%n", 14, 2017);
		
		/* Formatter - 지시자
		  %b:불리언(boolean)
		  %d:10진수(decimal)
		  %o:8진수(octal)
		  %x:16진수(hexa)
		  %f:부동소수점(floating-point)
		  %e:지수(exponent)
		  %c:문자(character)
		  %s:문자열(String) 
		 */
		
	}

}
