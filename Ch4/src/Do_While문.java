import java.util.*;
public class Do_While�� {
	public static void main(String[] args) {
//		Do+While�� - �� ������ ���� ������ �� ���ǽ��� Ȯ���Ѵ�.
//		���ǽ��� �������� ���϶� ����� ������ ���´�. => �ѹ��� ������ ����
//		����� �Է��� ������ �����ϴ�.
//		while���� ������ �� �ڵ� �ߺ��� �Ͼ�� do�� ����غ���
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1; // 1~100������ ������ ��
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100 ������ ������ �Է��Ͻÿ�: ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� �� �Դϴ�.");
			} else if(input < answer) {
				System.out.println("�� ū �� �Դϴ�.");
			}
		}while(input!= answer);
		
		System.out.println("����!!");
		
		
	}
}
