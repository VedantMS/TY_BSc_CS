import java.sql.*;
import javax.sql.*;

class slip11 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "godspell");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("Select * from donar;");
            ResultSetMetaData rsmd = rs.getMetaData();
            int col = rsmd.getColumnCount();
            for(int i = 1; i <= col; i++) {
                System.out.print(rsmd.getColumnName(i));
                System.out.print("\t" + rsmd.getColumnTypeName(i));
                System.out.println("\t" + rsmd.getColumnDisplaySize(i));
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
