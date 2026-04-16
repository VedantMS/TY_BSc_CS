import java.sql.*;
import javax.sql.*;
import java.awt.event.*;
import javax.swing.*;

class slip25 extends JFrame implements ActionListener {
    JLabel l;
    JTextField t;
    JButton b1, b2, b3;

    slip25() {
        setVisible(true);
        setLayout(null);
        setSize(400, 400);
        setTitle("Slip 25");

        l = new JLabel("Enter DDL Query: ");
        t = new JTextField();
        b1 = new JButton("Create Table");
        b2 = new JButton("Alter Table");
        b3 = new JButton("Drop Table");

        l.setBounds(40, 40, 180, 40);
        t.setBounds(280, 40, 180, 40);
        b1.setBounds(40, 120, 120, 40);
        b2.setBounds(180, 120, 120, 40);
        b3.setBounds(320, 120, 120, 40);

        add(l);
        add(t);
        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String s = t.getText();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "godspell");
            Statement st = conn.createStatement();
            st.executeQuery(s);
        }

        catch (Exception excep) {
            System.out.println(excep);
        }
    }

    public static void main(String[] args) {
        new slip25();
    }
}
