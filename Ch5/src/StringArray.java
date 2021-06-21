import java.util.*;

public class StringArray {

	public static void main(String[] args) {
		String[] name = {"가위", "바위", "보"}; // 3개의 문자열을 담을 수 있는 배열을 생성한다.
	System.out.println(Arrays.toString(name));
		
	for(int i=0;i<10;i++) {
		int num = (int)(Math.random()*3);
		System.out.println(name[num]);
	}
	
		
	}

}
