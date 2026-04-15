<html>
    <body>
        <%      int hr = new java.util.Date().getHours();

                String name = request.getParameter("name");
        %>

        Hello, <%   out.println(name); %>

        <br>

        <%
                if(hr < 12 && hr > 4)           out.println("Good Morning. ");

                else if(hr < 16 && hr >= 12)    out.println("Good Afternoon. ");

                else if(hr < 20 && hr >= 16)    out.println("Good Evening. ");

                else    out.println("Good Night. ");
        %>
        
    </body>
</html>