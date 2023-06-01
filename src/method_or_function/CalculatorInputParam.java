package method_or_function;

public class CalculatorInputParam {
    public int addition(int a, int b){

        int add = a+b;
        return add;
    }

    public int Subtraction(int a, int b){

        int sub = a-b;
        return sub;
    }

    public int multiplication(int a, int b){

        int mul = a*b;
        return mul;
    }
    public int division(int a, int b){

        int div = a/b;
        return div;
    }

    public static void main(String[] args) {
        CalculatorInputParam obj = new CalculatorInputParam();
        int sum = obj.addition(20,10);
        System.out.println("Addition of a and b is : =" + sum);
        sum = obj.addition(230,230);
        System.out.println("Addition of a and b is : =" + sum);
        int result = obj.division(20,10);
        System.out.println("Division of a and b is : =" + result);
        result = obj.Subtraction(30,20);
        System.out.println("Subtraction of a and b is : =" + result);
        result = obj.multiplication(3,2);
        System.out.println("Multiplication of a and b is : =" + result);
    }
}
