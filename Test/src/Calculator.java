import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        //결과값 선언
        double result;

        Scanner input = new Scanner(System.in);
        System.out.println("1. add, 2. minus, 3. multiply, 4. divide");
        System.out.println("원하는 번호를 선택하세요.");
        int start = input.nextInt();
        if(!(start <= 1 && start <= 4)){
            System.out.println("1~4이내의 값을 입력해주세요.");
        }else {

            System.out.println("첫 번째 번호를 입력하세요");
            Double firstValue = input.nextDouble();

            System.out.println("두 번째 번호를 입력하세요");
            Double secondValue = input.nextDouble();
            if (secondValue <= 0 || !(start <= 1 && start <= 4)) {
                System.out.println("0 이상의 값을 입력해주세요");
            }

            switch (start) {
                case 1 -> {
                    result = firstValue + secondValue;
                    System.out.println(firstValue + "+" + secondValue + "=" + result);
                }
                case 2 -> {
                    result = firstValue - secondValue;
                    System.out.println(firstValue + "-" + secondValue + "=" + result);
                }
                case 3 -> {
                    result = firstValue * secondValue;
                    System.out.println(firstValue + "*" + secondValue + "=" + result);
                }
                case 4 -> {
                    result = firstValue / secondValue;
                    System.out.println(firstValue + "/" + secondValue + "=" + result);
                }
                default -> System.out.println("1~4이내의 값을 입력해주세요.");
            }
            input.close();
        }
    }
}

