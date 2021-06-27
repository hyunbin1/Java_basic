public class Calculator {


    public static void main(String[] args){

        divide(3, 0);

    }

    static int add(int a, int b){
       return a+b;
    };

    static int multiply(int a, int b){
        return a*b;
    }
    static void divide(int a, double b) {
        if (b == 0) {
            System.out.println("0이 아닐세");
        } else {
            System.out.println(a/b);
        }
    }


}



