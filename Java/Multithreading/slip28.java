class slip28 extends Thread {
    public void run() {
        System.out.println("Thread is running: " + getName());
    }

    public static void main(String[] args) {
        slip28 t1 = new slip28();
        slip28 t2 = new slip28();

        t1.start();
        t2.start();
    }
}
