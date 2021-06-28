import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

        String[] operators = {"+" , "-", "*", "/"};

        Scanner input = new Scanner(System.in);
        System.out.println("1. add, 2. minus, 3. multiply, 4. divide");
        System.out.println("원하는 번호를 선택하세요.");
        int operate = input.nextInt() - 1 ;

        boolean isValid = operators[operate] == "+" || operators[operate] == "-" || operators[operate] == "*" || operators[operate] == "/";

        if (!isValid) {
            System.out.println("1~4이내의 값을 입력해주세요.");
        } else {
            System.out.println("첫 번째 번호를 입력하세요");
            double firstValue = input.nextDouble();

            System.out.println("두 번째 번호를 입력하세요");
            double secondValue = input.nextDouble();
            if (secondValue <= 0) {
                System.out.println("0 이상의 값을 입력해주세요");
            }
            double result = calculate ( operators[operate], firstValue, secondValue);
            System.out.println(firstValue + operators[operate] + secondValue + "=" + result);
            input.close();
        }
    }

    static double calculate(String operate, double firstValue, double secondValue) {
        //결과값 선언
        double result;

        switch (operate) {
            case "+" -> {
                result = firstValue + secondValue;
            }
            case "-" -> {
                result = firstValue - secondValue;
            }
            case "*" -> {
                result = firstValue * secondValue;
            }
            case "/" -> {
                result = firstValue / secondValue;
            }
            default -> {result = 0;}
        }
        return result;
    }


}
