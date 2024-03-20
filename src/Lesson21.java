//******* *Multi Threads **************

class Hi extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++)
            System.out.println("Hi class");
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++)
            System.out.println("Hello class");

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }
}

class Bye extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++)
            System.out.println("Bye class");
    }
}

public class Lesson21 {

    public static void main(String[] args) {

        Hi aa = new Hi();
        Hello ab = new Hello();
        Bye bb = new Bye();

        // System.out.println("Get priority " + ab.getPriority());

        // ab.setPriority(Thread.MAX_PRIORITY);

        aa.start();
        ab.start();
        bb.start();
    }

}
