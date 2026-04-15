import java.util.*;

class slip16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Elements: ");
        int n = sc.nextInt();

        TreeSet<String> ts = new TreeSet<>();

        System.out.println("Enter Colors: ");
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            ts.add(s);
        }

        System.out.println(ts);
    }
}
