import java.util.*;

public class StringArray {

	public static void main(String[] args) {
		String[] name = {"����", "����", "��"}; // 3���� ���ڿ��� ���� �� �ִ� �迭�� �����Ѵ�.
	System.out.println(Arrays.toString(name));
		
	for(int i=0;i<10;i++) {
		int num = (int)(Math.random()*3);
		System.out.println(name[num]);
	}
	
		
	}

}
