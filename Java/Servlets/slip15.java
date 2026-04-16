import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class slip15 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        Cookie[] cookies = req.getCookies();

        int count = 0;
        
        if(cookies != null) {
            for(Cookie c : cookies) {
                if(c.getName().equals("visitCount")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        count++;

        if(count == 1) {
            pw.println("Welcome User. ");
        }

        else {
            pw.println("Visit Count: " + count);
        }

        Cookie c = new Cookie("visitCount", String.valueOf(count));
        res.addCookie(c);
    }
}