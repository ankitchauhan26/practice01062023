import java.util.Scanner;

public class CalculatorApp {


    public int add(int a ,int b){
        return a+b;
    }

    public int sub(int a ,int b){
        return a-b;
    }

    public double div(int a ,int b){
        return (double) a/b;
    }

    public int mul(int a ,int b){
        return a*b;
    }


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        CalculatorApp obj = new CalculatorApp();

        int result = 0;
        int count = 1;


        while (count ==  1){
            System.out.println("Welcome to Calculator App : ");
            System.out.println("Please Enter your choice   1 : Addition , 2: Subtraction , 3: Divide , 4: Multiplication  ");
            int choice = scanner.nextInt();
            System.out.println("Please enter value of a :");
            int a = scanner.nextInt();

            System.out.println("Please enter value of b :");
            int b = scanner.nextInt();
            if (choice == 1) {
                result = obj.add(a, b);
                System.out.println("Addition of a and b is : " + result);
            } else if (choice == 2) {
                result = obj.sub(a, b);
                System.out.println("Subtraction of a and b is : " + result);
            } else if (choice == 3) {
                double output = obj.div(a, b);
                System.out.println("Division of a and b is : " + output);
            } else if (choice == 4) {
                result = obj.mul(a, b);
                System.out.println("Multiplication of a and b is : " + result);
            } else {
                System.out.println("Please Enter Valid Choice");
            }
            System.out.println("If you want to continue please press 1 :   , If you want to exit press any other key ");
            count = scanner.nextInt();

        }



    }
}
