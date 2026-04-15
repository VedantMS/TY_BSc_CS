<html>
    <body>
        <%  String name = request.getParameter("name");
            int age = Integer.parseInt(request.getParameter("age"));

            if(age > 18) {
                out.println(name + " is eligible to vote. ");
            }

            else {
                out.println(name + " is not eligible to vote. ");
            }
        %>

    </body>
</html>