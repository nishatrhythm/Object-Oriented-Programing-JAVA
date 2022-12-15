package votereligibility;

import java.util.Scanner;

class underAgeException extends Exception {

    underAgeException() {
        super("Sorry. You are under 18! Not eligible to give a vote.");
    }
}

public class VoterEligibility {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new underAgeException();
            } else {
                System.out.println("Congratulations! You are eligible to give a vote.");
            }
        } catch (underAgeException e) {
            e.printStackTrace();
        }
    }
}
