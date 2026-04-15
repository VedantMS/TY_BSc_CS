<html>
    <body>
        <%  int num = Integer.parseInt(request.getParameter("number"));

            int sum = 0;

            for(int i = 1; i < num; i++) {
                if(num % i == 0) {
                    sum += i;
                }
            }

            if(sum == num)  out.println("Perfect Number. ");

            else  out.println("Not a Perfect Number. ");
        %>

    </body>
</html>