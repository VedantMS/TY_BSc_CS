import java.util.*;

class slip7 extends Thread {
    static int num;
    String type;

    slip7(String s) {
        type = s;
    }

    public void run() {
        Random r = new Random();

        try {
            while(true) {
                if(type.equals("Generate")) {
                    num = r.nextInt(100);
                    System.out.println("\nGenerated Number: " + num);
                }

                else if(type.equals("Square")) {
                    if(num % 2 == 0) {
                        System.out.println("Square Number: " + num * num);
                    }
                }

                else if(type.equals("Cube")) {
                    if(num % 2 != 0) {
                        System.out.println("Cube Number: " + num * num * num);
                    }
                }

                Thread.sleep(4000);
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        slip7 t1 = new slip7("Generate");
        slip7 t2 = new slip7("Square");
        slip7 t3 = new slip7("Cube");

        t1.start();
        t2.start();
        t3.start();
    }
}