<html>
    <body>
        <%  String str = request.getParameter("str");

            int n = str.length();

            for(int i = n - 1; i >= 0; i--) {
                out.println(str.charAt(i));
            }
        %>

    </body>
</html>