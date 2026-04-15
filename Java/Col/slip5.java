import java.util.*;

class slip5 {
    public static void main(String [] a) {
        Scanner sc = new Scanner(System.in);

        Hashtable<String, String> ht = new Hashtable<>();
        System.out.print("Enter Total: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.print("Enter Name: ");
            String name = sc.next();
            System.out.print("Enter Number: ");
            String num = sc.next();
            
            ht.put(name, num);
        }

        System.out.println("Keys\tValues");
        
        Enumeration<String> en = ht.keys();

        while(en.hasMoreElements()) {
            String key = en.nextElement();
            System.out.print(key + "\t" + ht.get(key) + "\n");
        }
    }
}