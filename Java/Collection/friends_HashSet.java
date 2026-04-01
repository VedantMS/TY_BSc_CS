import java.util.*;

class friends_HashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Friends: ");
        int n = sc.nextInt();

        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter Friend Name: ");
            String name = sc.next();

            hs.add(name);
        }

        System.out.println(hs);
    }
}