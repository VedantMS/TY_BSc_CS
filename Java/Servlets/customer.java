import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class customer extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException   {
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        String num = req.getParameter("number");

        try {
            Class.forName("org.postgresql.Driver");

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "spellbound");

            PreparedStatement ps = conn.prepareStatement("Select * from customer where id = ?;");
            ps.setString(1, num);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                pw.print("Number: " + rs.getString("id") + "<br>");
                pw.print("Name: " + rs.getString("name") + "<br>");
                pw.print("Age: " + rs.getString("age"));
            }
        }

        catch(Exception e) {
            pw.print(e);
        }
    }
}