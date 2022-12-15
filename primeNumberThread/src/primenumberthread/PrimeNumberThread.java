package primenumberthread;

class Printer {

    synchronized void printPrime(int num1, int num2) {
        //void printPrime(int num1, int num2){
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                /*try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }*/
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2 || n == 3 || n == 5) {
            return true;
        }
        if (n <= 1 || (n & 1) == 0) {
            return false;
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

class Thread1 extends Thread {

    Printer pRef;

    Thread1(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printPrime(1, 100);

    }
}

class Thread2 extends Thread {

    Printer pRef;

    Thread2(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {

        pRef.printPrime(101, 200);

    }
}

class Thread3 extends Thread {

    Printer pRef;

    Thread3(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printPrime(201, 300);
    }
}

class Thread4 extends Thread {

    Printer pRef;

    Thread4(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printPrime(301, 400);
    }
}

class Thread5 extends Thread {

    Printer pRef;

    Thread5(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printPrime(401, 500);
    }
}

public class PrimeNumberThread {

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        Thread1 th1 = new Thread1(printer);
        Thread2 th2 = new Thread2(printer);
        Thread3 th3 = new Thread3(printer);
        Thread4 th4 = new Thread4(printer);
        Thread5 th5 = new Thread5(printer);

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}
