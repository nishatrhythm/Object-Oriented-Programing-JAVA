package areaofshape;

interface Shape {
    void PrintArea(double X, double Y);
}

class Circle implements Shape {

    double PI = 3.14, area = 0;
    
    @Override
    public void PrintArea(double X, double Y) {
        area = PI * X * X;
        System.out.println("Area of circle: " + area);
    }
}

class Rectangle extends Circle {

    double area;

    @Override
    public void PrintArea(double X, double Y) {
        super.PrintArea(10, 8);
        area = X * Y;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Rectangle {

    double area;

    @Override
    public void PrintArea(double X, double Y) {
        super.PrintArea(10, 5);
        area = 0.5 * X * Y;
        System.out.println("Area of Triangle: " + area);
    }
}

public class AreaOfShape {

    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.PrintArea(10, 8);
    }
}
