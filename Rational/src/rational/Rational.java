package rational;

import java.util.Scanner;

public class Rational {

    private int numerator = 0;
    private int denominator = 1;

    //default constructor
    public Rational() {

    }

    //specific constructor
    public Rational(int num, int denom) {
        setNumerator(num);
        setDenominator(denom);
    }

    //main() method
    public static void main(String[] args) {
        /*Rational r = new Rational(1, 2);
        System.out.println(r);*/

        Scanner stdin = new Scanner(System.in);
        System.out.println();

        // extract values for rationals r and s
        //first object, takes input the first rational number
        Rational r = new Rational();

        System.out.print("Enter numerator of first rational number: ");
        int a = stdin.nextInt();

        System.out.print("Enter denominator of first rational number: ");
        int b = stdin.nextInt();

        r.setNumerator(a);
        r.setDenominator(b);

        //second object, takes input the second rational number
        Rational s = new Rational();

        System.out.print("Enter numerator of second rational number: ");
        int c = stdin.nextInt();

        System.out.print("Enter denominator of second rational number: ");
        int d = stdin.nextInt();

        s.setNumerator(c);
        s.setDenominator(d);

        // operate on r and s
        Rational sum = r.add(s);
        Rational difference = r.subtract(s);
        Rational product = r.multiply(s);
        Rational quotient = r.divide(s);

        // display operation results
        System.out.println("For r = " + r.toString() + " and s = " + s.toString());
        System.out.println("    r + s = " + sum.toString());
        System.out.println("    r - s = " + difference.toString());
        System.out.println("    r * s = " + product.toString());
        System.out.println("    r / s = " + quotient.toString());
        System.out.println();

    }

    //accessor methods (auto generated from JAVA)
    public int getNumerator() {

        return numerator;
    }

    //mutator methods (auto generated from JAVA)
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //Rational Addtion Method, add() method
    public Rational add(Rational other) {
        int a = this.getNumerator();
        int b = this.getDenominator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new Rational(a * d + b * c, b * d);
    }

    //Rational Subtraction Method, subtract() method
    public Rational subtract(Rational other) {
        int a = this.getNumerator();
        int b = this.getDenominator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        int num = a * d - b * c;
        int denom = b * d;
        return new Rational(num, denom);
    }

    //Rational Multiplication Method, multiply() method
    public Rational multiply(Rational other) {
        int a = this.getNumerator();
        int b = this.getDenominator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        int num = a * c;
        int denom = b * d;
        Rational obj = new Rational();
        obj.setNumerator(num);
        obj.setDenominator(denom);
        return obj;
    }

    //Rational Division Method, divide() method
    public Rational divide(Rational other) {
        int a = this.getNumerator();
        int b = this.getDenominator();
        int c = other.getNumerator();
        int d = other.getDenominator();
        return new Rational(a * d, b * c);
    }

    //toString() method to convert the object to a String
    public String toString() {
        return getNumerator() + "/" + getDenominator();
    }

}
