import java.util.*;
import java.sql.*;
import javax.sql.*;

class slip16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "godspell");
            PreparedStatement ps = conn.prepareStatement("insert into teacher values(?, ?, ?, ?);");

            for(int i = 0; i < 5; i++) {
                System.out.print("\nEnter Number: ");
                String tno = sc.next();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Qualifications: ");
                String qua = sc.next();
                System.out.print("Enter Salary: ");
                String sal = sc.next();
                
                ps.setString(1, tno);
                ps.setString(2, name);
                ps.setString(3, qua);
                ps.setString(4, sal);

                ps.executeUpdate();
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}