package method_or_function;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {


        //create object of Scanner class

        Scanner scanner = new Scanner(System.in);

        //Reading String Input

        System.out.println("Please Enter Ur Name");
        String name = scanner.nextLine(); // it reads string input
        System.out.println("You have entered name : " +name);

        // reading integer data
        System.out.println("Please Enter a Number");
        int num = scanner.nextInt() ;//it reads integer value
        System.out.println("You have entered a number as : " +num);

        //Reading Decimal Data

        System.out.println("Please Enter ur Salary");
        double salary  = scanner.nextDouble();
        System.out.println("You have entered ur salary is : " + salary);









    }
}
