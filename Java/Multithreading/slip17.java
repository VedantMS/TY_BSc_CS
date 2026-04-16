import java.awt.event.*;
import javax.swing.*;

class slip17 extends JFrame implements Runnable, ActionListener{
    JTextField text;
    JButton bt; 
    slip17() {
        setVisible(true);
        setLayout(null);
        setTitle("Slip 17");
        setSize(400, 400);

        text = new JTextField();
        bt = new JButton("Click");

        text.setBounds(40, 40, 100, 40);
        bt.setBounds(40, 80, 80, 40);

        add(text);
        add(bt);

        bt.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Thread t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            for(int i = 1; i <= 100; i++) {
                text.setText("" + i);

                Thread.sleep(100);
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new slip17();
    }
}
