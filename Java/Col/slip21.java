import java.util.*;

class slip21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Elements: ");
        int n = sc.nextInt();

        LinkedList<Integer> ll = new LinkedList<>();

        System.out.println("Enter Elements: ");
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            ll.add(num);
        }

        System.out.println("Elements: ");
        
        Iterator it = ll.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
    }
}
