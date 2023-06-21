package exception_demo.assignment;

import java.util.Scanner;

public class AccountCheck {

    public void checkMoney(double amount) throws AccountCheckExeception {

        if(amount < 1000){
           throw new AccountCheckExeception("Please Deposit more then 1000 rs");

        }
        else {
            System.out.println("Your Account will be created ");
        }


    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please Enter Amount to open account : ");
        double amount = scanner.nextDouble();
        AccountCheck obj =new AccountCheck();
        try {
            obj.checkMoney(amount);
        } catch (AccountCheckExeception e) {
            throw new RuntimeException(e);
        }


    }
}
