package exceptionhandling;

import java.lang.Exception;
import java.util.Scanner;

class InvalidRadiusException extends Exception {

    private double r;

    public InvalidRadiusException(double radius) {
        r = radius;
    }

    public void printError() {
        System.out.println("Radius [" + r + "] is not valid.");
    }
}

class Circle {

    double x, y, r;

    public Circle(double centreX, double centreY, double radius) throws InvalidRadiusException {
        if (radius <= 0) {
            throw new InvalidRadiusException(radius);
        } else {
            x = centreX;
            y = centreY;
            r = radius;
        }
    }
}



public class ExceptionHandling {

    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(10, 10, -1);
            /*Scanner c1 = new Scanner(System.in);
            double a = c1.nextDouble();
            Scanner c2 = new Scanner(System.in);
            double b = c2.nextDouble();
            Scanner c3 = new Scanner(System.in);
            double c = c3.nextDouble();*/
            System.out.println("Circle created");
        } catch (InvalidRadiusException e) {
            e.printError();
        }
    }
    
}
