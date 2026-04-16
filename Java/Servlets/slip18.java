import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class slip18 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");

        PrintWriter pw = res.getWriter();

        String sno = req.getParameter("sno");
        String name = req.getParameter("name");
        String cls = req.getParameter("class");
        float marks = Float.parseFloat(req.getParameter("marks"));
        float total = Float.parseFloat(req.getParameter("total"));

        double percentage = marks / total * 100;
        String grade;

        if(percentage > 90)                             grade = "O";
        else if(percentage <= 90 && percentage > 80)    grade = "A+";
        else if(percentage <= 80 && percentage > 70)    grade = "A";
        else if(percentage <= 70 && percentage > 60)    grade = "B";
        else if(percentage <= 60 && percentage > 50)    grade = "C";
        else if(percentage <= 50 && percentage > 40)    grade = "P";
        else                                            grade = "NP";

        pw.println("Roll Number: " + sno + "<br>");
        pw.println("Name: " + name + "<br>");
        pw.println("Class: " + cls + "<br>");
        pw.println("Marks: " + marks + "<br>");
        pw.println("Percentage: " + percentage + "%" + "<br>");
        pw.println("Grade: " + grade);
    }
}