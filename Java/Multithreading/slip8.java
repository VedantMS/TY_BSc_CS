class slip8 extends Thread {
    String text;
    int n;

    slip8(String a, int b) {
        text = a;
        n = b;
    }

    public void run() {
        for(int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static void main(String[] args) {
        slip8 t1 = new slip8("Covid19", 2);
        slip8 t2 = new slip8("Lockdown20", 4);
        slip8 t3 = new slip8("Vaccination21", 8);

        t1.start();
        t2.start();
        t3.start();
    }
}
