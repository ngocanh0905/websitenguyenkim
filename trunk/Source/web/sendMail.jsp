<%-- 
    Document   : sendMail
    Created on : Nov 26, 2010, 7:30:00 PM
    Author     : tannguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="sun.net.smtp.SmtpClient,java.io.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<HTML>
    <BODY>      
        <%
                    String from = "tan.nguyenbao@gmail.com";
                    String to = "mr.tannguyen@live.com";
                    try {
                        SmtpClient client = new SmtpClient("smtp.gmail.com");
                        client.from(from);
                        client.to(to);
                        PrintStream message = client.startMessage();
                        message.println("To: " + to);
                        message.println("Subject: Sending email from JSP!");
                        message.println("This was sent from a JSP page!");
                        message.println();
                        message.println("Cool beans! :-)");
                        message.println();
                        message.println();
                        client.closeServer();
                    } catch (IOException e) {
                        System.out.println("ERROR SENDING EMAIL:" + e);
                    }
        %>
    </BODY>
</HTML>

