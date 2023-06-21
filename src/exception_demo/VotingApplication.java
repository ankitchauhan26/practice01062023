package exception_demo;

import java.util.Scanner;

public class VotingApplication {

    public void doVote(int age) throws AgeNotEligbleException {

        if(age<18){
            throw new AgeNotEligbleException("Voter age is less than 18 so he is not eligible");
        }

        else {
            System.out.println("Welcome to voting app");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to voting app please enter your age");
        int age = scanner.nextInt();


        VotingApplication obj = new VotingApplication();
        try {
            obj.doVote(age);
        } catch (AgeNotEligbleException e) {
            throw new RuntimeException(e);
        }

    }
}
