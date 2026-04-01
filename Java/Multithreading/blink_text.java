import javax.swing.*;

class blink_text extends JFrame implements Runnable {
    JLabel blink;

    blink_text() {
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
        Thread t = new Thread(new blink_text());
        t.start();
    }
}