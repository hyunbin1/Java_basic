import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
//		�迭 ������ 1,2
		int[] score; // 1 - ���������� ���������.
//		int sco[]; // 2
		
//		�迭 �������:
		score = new int[5]; // int Ÿ���� �� 5���� ������ �� �ִ� �迭 ����
		
//		=> int[] score = new int[5]�� ����
	
//****** �迭�� ���� ******
//		�迭�� ���̴� �ѹ� �����ϸ� �����ϴ� ���� �� ���̸� �ٲ� �� ����.
//		=> �迭�� ���̴� ����̴�.
		int[] arr = new int[5];
		int tmp = arr.length;
		
//		===�迭�� �ʱ�ȭ===
		
//		int[] score = { 50, 60, 70, 80, 90 };
//		������ int[] score; score = {} �� ��>�� ������ ������ ����.
		
		
//		�迭�� ��� ��Ҹ� ����ϱ�:
		System.out.println(Arrays.toString(score));
//		OR
	for(int i =0;i<score.length;i++) {
		System.out.println(score[i]);
		
	}
		
	}
	

}
