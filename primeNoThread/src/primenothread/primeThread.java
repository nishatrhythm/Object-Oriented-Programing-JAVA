package primenothread;

class thread1 extends Thread {
    public void run(){
        int num, i = 0;
        String s = "";

        for (i = 2; i <= 10000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 0 to 10000 : \n" + s);

        System.out.println();
    }
}

class thread2 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 10001; i <= 20000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 10001 to 20000 : \n" + s);

        System.out.println();
    }
}

class thread3 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 20001; i <= 30000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 20001 to 30000 : \n" + s);

        System.out.println();
    }
}

class thread4 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 30001; i <= 40000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 30001 to 40000 : \n" + s);

        System.out.println();
    }
}

class thread5 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 40001; i <= 50000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 40001 to 50000 : \n" + s);

        System.out.println();
    }
}

class thread6 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 50001; i <= 60000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 50001 to 60000 : \n" + s);

        System.out.println();
    }
}

class thread7 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 60001; i <= 70000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 60001 to 70000 : \n" + s);

        System.out.println();
    }
}

class thread8 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 70001; i <= 80000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 70001 to 80000 : \n" + s);

        System.out.println();
    }
}

class thread9 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 80001; i <= 90000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 80001 to 90000 : \n" + s);

        System.out.println();
    }
}

class thread10 extends Thread {
    public void run()
    {
        int num, i = 0;
        String s = "";

        for (i = 90001; i <= 100000; i++) {
            int count=0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    count++;
                }
            }
            if (count == 2) {
                s = s + i + " ";
            }
        }

        System.out.println("\nPrime numbers from 90001 to 100000 : \n" + s);

        System.out.println();
    }
}

public class primeThread {
    public static void main(String args[]){
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        thread4 t4 = new thread4();
        thread5 t5 = new thread5();
        thread6 t6 = new thread6();
        thread7 t7 = new thread7();
        thread8 t8 = new thread8();
        thread9 t9 = new thread9();
        thread10 t10 = new thread10();

        Thread m1 = new Thread(t1);
        Thread m2 = new Thread(t2);
        Thread m3 = new Thread(t3);
        Thread m4 = new Thread(t4);
        Thread m5 = new Thread(t5);
        Thread m6 = new Thread(t6);
        Thread m7 = new Thread(t7);
        Thread m8 = new Thread(t8);
        Thread m9 = new Thread(t9);
        Thread m10 = new Thread(t10);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
        m7.start();
        m8.start();
        m9.start();
        m10.start();

    }
}
