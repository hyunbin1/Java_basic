
public class Operators {

	public static void main(String[] args) {
		/* 연산자의 종류 
		 산술 연산자: +, -, *, /, %
		 대입연산자: =
		 논리연산자: &&(And), ||(Or), !(Not)
		 비교연산자: >, <, >=, <=, ==, !=
		 */
		
//		문자열 비교는 == 대신 equals()를 사용해야된다. 
		String str1 = new String("abc");
		String str2 = new String("abc");
		System.out.println(str1==str2); // false
		System.out.println(str1.equals(str2)); //true
		
		/* 조건 연산자 ?:
		 * 형태: 조건식 ? 식1(True일때 출력) : 식2(false일때 출력) 
		 */
//		int result = (5>3) ? 5 : 3;
//		System.out.println(result);
		
		
	}

}
