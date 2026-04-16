import java.util.*;

class slip13 extends Thread {
    slip13(String s) {
        super(s);
        System.out.println("Thread Created: " + this.getName());
    }

    public void run() {
        Random r = new Random();

        try {
            int sleepTime = r.nextInt(5000);
            System.out.println("Sleep Time: " + sleepTime);

            Thread.sleep(sleepTime);
        }

        catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Thread Treminated. ");
    }
    
    public static void main(String[] args) {
        slip13 t = new slip13("THREAD");

        t.start();
    }
}
