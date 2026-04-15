<html>
    <body>
        <%  String name = request.getParameter("name");
            String password = request.getParameter("password");

            if(name.equals(password)) {
                response.sendRedirect("Login.html");
            }

            else {
                response.sendRedirect("Error.html");
            }
        %>

    </body>
</html>