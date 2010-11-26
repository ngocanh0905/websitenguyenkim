<%-- 
    Document   : rsCheckout
    Created on : Nov 26, 2010, 6:18:06 PM
    Author     : tannguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="refresh" content="2; URL=../index.jsp">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
            <h1>Message from our system</h1><br>
            <%
                        out.print("Đã thanh toán thành công vui long kiểm tra email để xác nhận lại");                        
            %>
            <br>Đang chuyển sang trang chủ......<br><br>
            <img src="../images/loading.gif"/>

        </center>

    </body>
</html>
