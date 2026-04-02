import java.util.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class employee extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField eno, ename, designation, salary;
    JButton submit, clear;

    employee() {
        setSize(1000, 1000);
        setVisible(true);
        setLayout(null);
        setTitle("Employee with JDBC and Swing");

        l1 = new JLabel("Number: ");
        l2 = new JLabel("Name: ");
        l3 = new JLabel("Designation: ");
        l4 = new JLabel("Salary: ");

        eno = new JTextField(20);
        ename = new JTextField(20);
        designation = new JTextField(20);
        salary = new JTextField(20);

        submit = new JButton("Submit");
        clear = new JButton("Clear");

        l1.setBounds(40, 40, 100, 30);
        l2.setBounds(40, 80, 100, 30);
        l3.setBounds(40, 120, 100, 30);
        l4.setBounds(40, 160, 100, 30);

        eno.setBounds(200, 40, 200, 30);
        ename.setBounds(200, 80, 200, 30);
        designation.setBounds(200, 120, 200, 30);
        salary.setBounds(200, 160, 200, 30);

        submit.setBounds(200, 200, 100, 30);
        clear.setBounds(300, 200, 100, 30);

        add(l1);
        add(l2);
        add(l3);
        add(l4);

        add(eno);
        add(ename);
        add(designation);
        add(salary);

        add(submit);
        add(clear);

        submit.addActionListener(this);
        clear.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            String num = eno.getText();
            String name = ename.getText();
            String des = designation.getText();
            String sal = salary.getText();

            try {
                Class.forName("org.postgresql.Driver");

                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "spellbound");

                PreparedStatement ps = conn.prepareStatement("insert into employee values(?, ?, ?, ?);");

                ps.setString(1, num);
                ps.setString(2, name);
                ps.setString(3, des);
                ps.setString(4, sal);

                ps.executeUpdate();
            }

            catch (Exception exception) {
                System.out.println(exception);
            }
        }

        else if(e.getSource() == clear) {
            eno.setText("");
            ename.setText("");
            designation.setText("");
            salary.setText("");
        }
    }

    public static void main(String[] args) {
        new employee();
    }
}