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

    public static void main(String[] args) {
        CalculatorInputParam obj = new CalculatorInputParam();
        int sum = obj.addition(20,10);
        System.out.println("Addition of a and b is : =" + sum);
        sum = obj.addition(230,230);
        System.out.println("Addition of a and b is : =" + sum);

    }
}
