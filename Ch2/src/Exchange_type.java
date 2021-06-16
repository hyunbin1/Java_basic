
public class Exchange_type {

	public static void main(String[] args) {
		String str = "3";
		// 문자열 3을 문자열 3으로 바꾸기 - charAt(0)에서 문자열 "0" 빼기
		System.out.println(str.charAt(0) - '0'); //3
		// 문자열에서 숫자로 만들기 = 문자열 "0"을 빼기		
		System.out.println('3' - '0' + 1); //4
		//만약 문자열 0을 안빼면 52가 나온다. - 문자의 번호로 나오기 때문이다.
		System.out.println('3' + 1); //52
		// 숫자 + 문자열0을 더하면 문자열이 된다.
		System.out.println((3 +'0')); //51
		// 형변환(char)을 사용하면 실제 문자열 그대로의 숫자를 얻을 수 있다. 
		System.out.println((char)(3 +'0')); //3
	
		
	}

}
