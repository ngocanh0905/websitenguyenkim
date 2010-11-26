<%-- 
    Document   : acRegister
    Created on : Nov 25, 2010, 10:15:20 AM
    Author     : tannguyen
--%>


<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Contollers.Modes.ActionMode"%>
<%@page import="Models.POJOs.UserPOJO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id = "user"
                     class = "Models.POJOs.UserPOJO"
                     scope = "request"/>
        <jsp:setProperty name = "user"
                         property = "*"/>


        <%

                    String str[] = String.valueOf(request.getParameter("birth")).split("-");
                    int year = Integer.parseInt(str[2]);
                    int month =Integer.parseInt(str[1]);
                    int date =Integer.parseInt(str[0]);
                    
                    Calendar cal = Calendar.getInstance();
                    cal.clear();

                    cal.set(Calendar.YEAR, year);
                    cal.set(Calendar.MONTH, month);
                    cal.set(Calendar.DATE, date);

                    java.sql.Date sqlDate = new java.sql.Date(cal.getTimeInMillis());
                    
                    user.setDateOfBirth(sqlDate);

                     if (!user.getUsername().isEmpty()) {
                    String url = "/AddUserController";
                    request.setAttribute("actionMode", ActionMode.Add);
                    RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                    rd.forward(request, response);
                    }

        %>
    </body>
</html>
