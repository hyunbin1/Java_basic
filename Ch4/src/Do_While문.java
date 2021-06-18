import java.util.*;
public class Do_While문 {
	public static void main(String[] args) {
//		Do+While문 - 블럭 내용을 먼저 실행한 후 조건식을 확인한다.
//		조건식의 연산결과가 참일때 수행될 문장을 적는다. => 한번은 무조건 실행
//		사용자 입력을 받을때 유용하다.
//		while문과 비교했을 때 코드 중복이 일어나면 do를 사용해본다
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~100사이의 임의의 수
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100 사이의 정수를 입력하시오: ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("더 작은 수 입니다.");
			} else if(input < answer) {
				System.out.println("더 큰 수 입니다.");
			}
		}while(input!= answer);
		
		System.out.println("정답!!");
		
		
	}
}
