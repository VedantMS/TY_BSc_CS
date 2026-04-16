import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class slip27 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        HttpSession session = req.getSession(true);
        
        int timeoutSeconds = 300; 
        session.setMaxInactiveInterval(timeoutSeconds);

        out.println("<p>Session ID: " + session.getId() + "</p>");
        out.println("<p>New Inactive Interval: " + session.getMaxInactiveInterval() + " seconds.</p>");  
    }
}
