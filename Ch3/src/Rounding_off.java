
public class Rounding_off {

	public static void main(String[] args) {
		//반올림 - Math.round() = 소수점 첫 째자리에서 반올림한다.
		double pi = 3.141592;
		double shortPi = Math.round(pi *1000)/1000.0;
		System.out.println(shortPi); //3.142
		
	}

}
