package circleareawithexception;

import java.lang.Exception;
import java.util.Scanner;

class InvalidRadiusException extends Exception {

    private double r;

    public InvalidRadiusException(double radius) {
        r = radius;
    }

    public void printError() {
        System.out.println("Radius [" + r + "] is not valid!");
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

public class CircleAreaWithException {

    public static void main(String[] args) {
        try {
            Scanner stdin = new Scanner(System.in);
            System.out.print("Enter the centreX: ");
            double centreX = stdin.nextDouble();
            System.out.print("Enter the centreY: ");
            double centreY = stdin.nextDouble();
            System.out.print("Enter the radius: ");
            double radius = stdin.nextDouble();
            Circle c1 = new Circle(centreX, centreY, radius);
            //Circle c1 = new Circle(10, 10, -1);
            System.out.println("Circle created.");
        } catch (InvalidRadiusException e) {
            e.printError();
        }
    }

}
