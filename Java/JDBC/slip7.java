import java.util.*;
import java.sql.*;

class slip7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Connection conn;
        Statement st;
        PreparedStatement ps;

        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "spellbound");
            st = conn.createStatement();

            System.out.println("1.\tAdd Data \n2.\tDisplay \n3.\tExit \n\n");

            while(true){
                System.out.print("\nEnter Choice: ");
                int choice = sc.nextInt();

                switch(choice){
                    case 1:     System.out.print("Enter Product ID: ");
                                String pid = sc.next();
                                System.out.print("Enter Product Name: ");
                                String pname = sc.next();
                                System.out.print("Enter Product Price: ");
                                String price = sc.next();
                                ps = conn.prepareStatement("Insert into product values(?, ?, ?);");
                                ps.setString(1, pid);
                                ps.setString(2, pname);
                                ps.setString(3, price);
                                ps.executeUpdate();
                                break;

                    case 2:     ResultSet rs = st.executeQuery("Select * from product;");
                                System.out.println("PID\tName\tPrice \n");
                                while(rs.next()) {
                                    String a = rs.getString("pid");
                                    String b = rs.getString("pname");
                                    String c = rs.getString("price");
                                    System.out.println(a+"\t"+b+"\t"+c);
                                }
                                break;

                    case 3:     System.exit(0);

                    default:    System.out.println("Invalid choice");
                }
            }
        }

        catch (Exception e1) {
            System.out.println(e1);
        }
    }
}