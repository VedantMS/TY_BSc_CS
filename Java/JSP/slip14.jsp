<html>
    <body>
        <%  int num = Integer.parseInt(request.getParameter("number"));
            
            int ans;
            
            if(num < 10) {
                ans = num;
            }

            else {
                int sum = 0;

                sum += num % 10;

                while(num > 10) {
                    num /= 10;
                }

                sum += num;

                ans = sum;
            }

            out.println("<p style = 'color: blueviolet; font-size: 18px'>" + ans + "</p>");
        %>

    </body>
</html>