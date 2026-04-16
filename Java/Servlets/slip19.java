import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.sql.*;

public class slip19 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        String name = req.getParameter("name");
        String password = req.getParameter("password");

        try {
            Class.forName("org.postgresql.Driver");
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/tybsccs", "postgres", "godspell");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from uname where username = '" + name + "' and password = '" + password + "';");
            
            if(!rs.next()) {
                pw.println("Invalid Username or Password. ");
            }

            else {
                pw.println("Login Successful. ");
            }
        }

        catch (Exception e) {
            pw.println(e);
        }
    }
}