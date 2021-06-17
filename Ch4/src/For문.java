
public class For문 {

	public static void main(String[] args) {
		for(int i=1; i <=10; i += 2) {
			System.out.println(i);
		}
//		거꾸로 출력
		for(int i=10; i >= 1; i-- ) {
			System.out.println(i);
		}
//		변수 두개 가능
		for(int i=1, j = 10; i <=10; i++, j--) {
			System.out.println("i="+i+"j="+j);
		}
		
		
		
		
	}

}
