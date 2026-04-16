import java.util.*;

class slip18 extends Thread {
    String s;

    slip18(String str) {
        s = str;
    }

    public void run() {
        try {
            int n = s.length();

            for(int i = 0; i < n; i++) {
                char ch = Character.toLowerCase(s.charAt(i));
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    Thread.sleep(3000);
                    System.out.println(s.charAt(i));
                }
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        slip18 t = new slip18(str);
        t.start();
    }
}
