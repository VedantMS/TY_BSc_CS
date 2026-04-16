class slip15 extends Thread {

    public void run() {
        try {
            System.out.println("Thread Name: " + getName());
            System.out.println("Thread Priority: " + getPriority());
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        slip15 t = new slip15();

        t.setName("Hello");
        t.setPriority(8);
        
        t.start();
    }
}
