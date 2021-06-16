
//	화면입력을 위한 스케너는 import 문을 추가해야된다.
import java.util.*;

public class Scanf {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num= scanner.nextInt(); // 화면에 입력받은 정수를 num에 저장
		System.out.println(num);
//		String input = scanner.nextLine(); // 화면에 입력받은 한 행의 내용을 input에 저장
//		int num = Integer.parseInt(input); // 문자열(input)을 숫자(num)으로 변환
	}

}
