import java.util.*;

class random_square_cube extends Thread {
    static int num;
    String type;

    random_square_cube(String s) {
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
        random_square_cube t1 = new random_square_cube("Generate");
        random_square_cube t2 = new random_square_cube("Square");
        random_square_cube t3 = new random_square_cube("Cube");

        t1.start();
        t2.start();
        t3.start();
    }
}