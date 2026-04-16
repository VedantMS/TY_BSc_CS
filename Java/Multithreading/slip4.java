import javax.swing.*;

class slip4 extends JFrame implements Runnable {
    JLabel blink;

    slip4() {
        setVisible(true);
        setLayout(null);
        setTitle("Blink Text");
        setSize(300, 400);

        blink = new JLabel("Hello World. ");
        blink.setBounds(100, 100, 80, 140);

        add(blink);
    }
    public void run() {
        try {
            while(true) {
                blink.setVisible(true);
                Thread.sleep(4000);

                blink.setVisible(false);
                Thread.sleep(4000);
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new slip4());
        t.start();
    }
}