package ScannerClass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x = 0;
        while (x != 404) {
            System.out.print("Enter 404 to terminate the program or avoid this to run the program: ");
            x = input.nextInt();
            System.out.print("Enter a floating point number: ");
            if (input.hasNextByte() == true) {
                byte value = input.nextByte();
                System.out.println("Byte: " + value);
            } else if (input.hasNextShort() == true) {
                short value = input.nextShort();
                System.out.println("Short: " + value);
            } else if (input.hasNextInt() == true) {
                int value = input.nextInt();
                System.out.println("Int: " + value);
            } else if (input.hasNextFloat() == true) {
                Float value = input.nextFloat();
                System.out.println("Float: " + value);
            } else if (input.hasNextDouble() == true) {
                Double value = input.nextDouble();
                System.out.println("Double: " + value);
            } else if (input.hasNextBoolean() == true) {
                boolean value = input.nextBoolean();
                System.out.println("Boolean: " + value);
            } else {
                String value = input.nextLine();
                System.out.println("String: " + value);
            }
        }
    }
}
