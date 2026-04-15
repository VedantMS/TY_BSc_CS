<html>
    <body>
        <%  String str = request.getParameter("number");
            
            int n = str.length();

            for(int i = 0; i < n; i++) {
                char ch = str.charAt(i);

                switch(ch) {
                    case '0':   out.println("Zero\t");
                                break;

                    case '1':   out.println("One\t");
                                break;

                    case '2':   out.println("Two\t");
                                break;

                    case '3':   out.println("Three\t");
                                break;

                    case '4':   out.println("Four\t");
                                break;

                    case '5':   out.println("Five\t");
                                break;

                    case '6':   out.println("Six\t");
                                break;

                    case '7':   out.println("Seven\t");
                                break;

                    case '8':   out.println("Eight\t");
                                break;

                    case '9':   out.println("Nine\t");
                                break;
                                
                    default:    out.println("Enter Number. ");
                }
            }
        %>

    </body>
</html>