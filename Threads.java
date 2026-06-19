class My extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(
                Thread.currentThread().getName() +
                " Time: " + System.currentTimeMillis()
            );

            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
}

class My2 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(
                Thread.currentThread().getName() +
                " Time: " + System.currentTimeMillis()
            );

            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
}

public class Threads {
    public static void main(String[] args) {

        My t1 = new My();
        My2 t2 = new My2();

        t1.setName("T1");
        t2.setName("T2");

        t1.start();
        t2.start();
    }
}