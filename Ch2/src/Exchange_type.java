
public class Exchange_type {

	public static void main(String[] args) {
		String str = "3";
		// ���ڿ� 3�� ���ڿ� 3���� �ٲٱ� - charAt(0)���� ���ڿ� "0" ����
		System.out.println(str.charAt(0) - '0'); //3
		// ���ڿ����� ���ڷ� ����� = ���ڿ� "0"�� ����		
		System.out.println('3' - '0' + 1); //4
		//���� ���ڿ� 0�� �Ȼ��� 52�� ���´�. - ������ ��ȣ�� ������ �����̴�.
		System.out.println('3' + 1); //52
		// ���� + ���ڿ�0�� ���ϸ� ���ڿ��� �ȴ�.
		System.out.println((3 +'0')); //51
		// ����ȯ(char)�� ����ϸ� ���� ���ڿ� �״���� ���ڸ� ���� �� �ִ�. 
		System.out.println((char)(3 +'0')); //3
	
		
	}

}
