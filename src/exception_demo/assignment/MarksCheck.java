package exception_demo.assignment;

import java.util.Scanner;

public class MarksCheck {

    public void firstDiv(int marks) throws MarksCheckException {
        if(marks< 60){
            throw new MarksCheckException("Sorry You are not eligible to submit form ");
        }
        else {
            System.out.println("YoYou are eligible to submit form u");
        }
    }

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please Enter Your Marks");
        int marks = scanner.nextInt();
        MarksCheck obj = new MarksCheck();
        try {
            obj.firstDiv(marks);
        } catch (MarksCheckException e) {
            throw new RuntimeException(e);
        }

    }
}
