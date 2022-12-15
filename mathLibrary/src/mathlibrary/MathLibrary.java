package mathlibrary;

public class MathLibrary {

    public static void main(String[] args) {
        double a = 56.34, b = 6.58334, c = -34.4265;

        System.out.print("A = " + a);
        System.out.print(", B = " + b);
        System.out.println(", C = " + c);
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of e: " + Math.E);
        System.out.println("A random number: " + Math.random());
        System.out.println("Absolute value of C: " + Math.abs(c));
        System.out.println("Square root of A: " + Math.sqrt(a));
        System.out.println("Maximum value between A & B: " + Math.max(a, b));
        System.out.println("Value of A^B: " + Math.pow(a, b));
        System.out.println("Round value of A: " + Math.round(a));
        System.out.println("Value of SQRT(A^2 + B^2): " + Math.sqrt(a * a + b * b));
        System.out.println("Floor value of B: " + Math.floor(b));
        System.out.println("Ceiling value of B: " + Math.ceil(b));
        System.out.println("Round value of B: " + Math.round(b));
        System.out.println("Floor value of C: " + Math.floor(c));
        System.out.println("Ceiling value of C: " + Math.ceil(c));
        System.out.println("Round value of C: " + Math.round(c));
        System.out.println("Radiun value of A: " + Math.toRadians(a));

        double radians = Math.toRadians(a);
        System.out.println("Value of sin(A) [where A is primarily given in degree]: " + Math.asin(radians));
    }

}
