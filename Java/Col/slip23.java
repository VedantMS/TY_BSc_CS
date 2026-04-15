import java.util.*;

class slip23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = args.length;

        LinkedList<String> ll = new LinkedList<>();

        for(int i = 0; i < n; i++) {
            ll.add(args[i]);
        }

        System.out.println("Iterator Elements: ");
        
        Iterator it = ll.iterator();

        while(it.hasNext()) {
            System.out.print(it.next() + "\t");
        }

         System.out.println("\nListIterator Elements: ");
        
        ListIterator li = ll.listIterator();

        while(li.hasNext()) {
            System.out.print(li.next() + "\t");
        }
    }
}
