
public class Printf {

	public static void main(String[] args) {
		// println - ������� �����Ұ�
			// 1. �Ǽ��� �ڸ��� ���� x, 2. 10�����θ� ��µ�.
		System.out.println(10.0/3);
		
		//printf()�� ������� �������� - with ������
		System.out.printf("%d%n", 0x1A); // 26, 10����
		System.out.printf("%x%n", 0x1A); // 1A, 16����
		System.out.printf("age:%d year:%d%n", 14, 2017);
		
		/* Formatter - ������
		  %b:�Ҹ���(boolean)
		  %d:10����(decimal)
		  %o:8����(octal)
		  %x:16����(hexa)
		  %f:�ε��Ҽ���(floating-point)
		  %e:����(exponent)
		  %c:����(character)
		  %s:���ڿ�(String) 
		 */
		
	}

}
