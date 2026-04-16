import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class slip2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();
        ServletContext sc = getServletContext();

        pw.println("<h1> Request Infromation </h1>");
        pw.println("IP Address: " + req.getRemoteAddr() + "<br>");
        pw.println("Browser: " + req.getRemoteUser());

        pw.println("<h1> Server Infromation </h1>");
        pw.println("Server Name: " + req.getServerName());
        pw.println("Operating System: " + System.getProperty("os.name") + "<br>");
        pw.println("Server Info: " + sc.getServerInfo());

        pw.println("<h1> Servlet Names </h1>");
        Enumeration<String> servlets = sc.getServletNames();

        while(servlets.hasMoreElements()) {
            pw.println(servlets.nextElement() + "<br>");
        }
    }
}