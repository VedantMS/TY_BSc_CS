class slip1 extends Thread {
    
    public void run() {
        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);

            try {
                Thread.sleep(2000);
            }

            catch(Exception e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        slip1 t = new slip1();
        t.start();
    }
}