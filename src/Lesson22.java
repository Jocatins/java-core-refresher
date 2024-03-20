// ********** Multi threading with Runnable*************

// class Heaven implements Runnable {
//     public void run() {
//         for (int i = 1; i < 5; i++)
//             System.out.println("Hi class");
//     }
// }

// class Hell implements Runnable {
//     public void run() {
//         for (int i = 1; i < 5; i++)
//             System.out.println("Hello class");

//         try {
//             Thread.sleep(20);
//         } catch (InterruptedException e) {

//             e.printStackTrace();
//         }
//     }
// }

//  ********** THE LAMBDA EXPRESSION

public class Lesson22 {

    public static void main(String[] args) {

        Runnable obj1 = () -> {
            for (int i = 1; i < 5; i++)
                System.out.println("Hi class");

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 1; i < 5; i++)
                System.out.println("Hello class");

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}
