import java.util.*;

class slip6 {
    public static void main(String [] a) {
        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> ts = new TreeSet<>();
        System.out.print("Enter Total: ");
        int n = sc.nextInt();

        System.out.print("Enter Elements: ");
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ts.add(num);
        }

        System.out.print("Enter element to find: ");
        int num = sc.nextInt();

        System.out.println("Element Exists: " +  ts.contains(num));
    }
}