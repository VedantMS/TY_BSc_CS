import java.util.*;

public class slip29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> ll = new LinkedList<>();

        while(true) {
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:     System.out.print("Enter Element: ");
                            int num = sc.nextInt();
                            ll.addFirst(num);
                            break;

                case 2:     ll.removeLast();
                            break;

                case 3:     System.out.println("Size: " + ll.size());
                            break;

                default:    System.out.println("Enter Valid Choice. ");
            }
        }
    }
}
