<html>
    <body>
        <%  int num = Integer.parseInt(request.getParameter("number"));

            if(num <= 1) out.println("Not a Prime Number. ");

            else if(num == 2) out.println("Prime Number. ");

            else {
                boolean flag = true;

                for(int i = 2; i < num; i++) {
                    if(num % i == 0) {
                        flag = false;
                        break;
                    }
                }

                if(flag)    out.println("<p style='color: red'> Prime Number. </p> ");

                else        out.println("<p style='color: red'> Not a Prime Number. </p> ");
            }
        %>
    <body>
<html>