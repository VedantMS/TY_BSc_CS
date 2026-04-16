import java.sql.*;
import javax.sql.*;
import javax.swing.*;
import java.awt.event.*;

class slip10 extends JFrame implements ActionListener {
    JTextField rno, name, per;
    JButton bt;

    slip10() {
        setVisible(true);
        setLayout(null);
        setTitle("Slip 10");
        setSize(400, 400);

        rno = new JTextField();
        name = new JTextField();
        per = new JTextField();

        bt = new JButton("Click");

        rno.setBounds(40, 40, 120, 40);
        name.setBounds(40, 80, 120, 40);
        per.setBounds(40, 120, 120, 40);

        bt.setBounds(40, 160, 80, 40);

        add(rno);
        add(name);
        add(per);

        add(bt);

        bt.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "godspell");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from student;");
            rs.next();
            rno.setText(rs.getString(1));
            name.setText(rs.getString(2));
            per.setText(rs.getString(3));
        }
        catch (Exception exce) {
            System.out.println(exce);
        }
    }
    
    public static void main(String[] args) {
        new slip10();
    } 
}
