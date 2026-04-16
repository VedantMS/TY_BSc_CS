import java.sql.*;

class slip13 {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "godspell");
            Statement st = conn.createStatement();

            DatabaseMetaData dbmd = conn.getMetaData();

            System.out.println("Database Name: " + dbmd.getDatabaseProductName());
            System.out.println("Database Version: " + dbmd.getDatabaseProductVersion());
            System.out.println("Driver Name: " + dbmd.getDriverName());
            System.out.println("Driver Version: " + dbmd.getDriverVersion());

            String[] table = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, table);

            System.out.println("\nTables: ");

            while(rs.next()) {
                System.out.println(rs.getString(3));
            }
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}