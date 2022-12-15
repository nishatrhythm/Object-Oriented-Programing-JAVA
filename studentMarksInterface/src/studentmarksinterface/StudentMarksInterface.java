package studentmarksinterface;

import java.util.Scanner;

class Student {

// student no and access methods
    protected String name;
    protected int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayStudent() {
        System.out.println("Student name : " + name);
        System.out.println("Student id : " + id);
    }
}

interface Sport {

// sports grace marks (say 5 marks) and abstract methods
    final static int graceMarks = 5;

    public void graceMarks();
}

class Exam extends Student {

// example marks (test1 and test 2 marks) and access method
    protected int test1;
    protected int test2;

    public Exam(String name, int id) {
        super(name, id);
    }

    void setMarks(int test1, int test2) {
        this.test1 = test1;
        this.test2 = test2;
    }

    int getMarks() {
        return test1 + test2;
    }
}

class Results extends Exam implements Sport {

    boolean sportsman = false;

    public Results(String name, int id) {
        super(name, id);
    }

// implementation of abstract methods of Sport interface
    @Override
    public void graceMarks() {
        Scanner sc = new Scanner(System.in);
        String check;
        System.out.print("Is " + name + " a sportsman? (yes/no) : ");
        check = sc.nextLine();

        if (check.equals("yes") || check.equals("YES")) {
            sportsman = true;
        }

    }
    private int total;
// other methods to compute total marks = test1+test2+sports_grace_marks;

    public void ComputeTotalMarks() {

        if (sportsman) {
            total = test1 + test2 + graceMarks;
        } else {
            total = test1 + test2;
        }
    }
// other display or final results access methods

    public void displayTotal() {
        System.out.println("Total number : " + total);
    }
}

public class StudentMarksInterface {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String name;
            int id, marks1, marks2;
            sc.nextLine();
            System.out.println("\nEnter information of student " + i + " : ");
            System.out.print("Enter student name : ");
            name = sc.nextLine();
            System.out.print("Enter student id : ");
            id = sc.nextInt();
            System.out.print("Enter test1 marks : ");
            marks1 = sc.nextInt();
            System.out.print("Enter test2 marks : ");
            marks2 = sc.nextInt();
            Results r = new Results(name, id);
            r.setMarks(marks1, marks2);
            r.graceMarks();
            r.ComputeTotalMarks();

            System.out.println("\nStudent " + i + " information:");
            r.displayStudent();
            r.displayTotal();
        }
    }
}
