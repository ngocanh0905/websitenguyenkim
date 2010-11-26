<%-- 
    Document   : message
    Created on : Nov 25, 2010, 9:29:13 AM
    Author     : tannguyen
--%>

<%@page import="Models.POJOs.UserPOJO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="refresh" content="5; URL=index.jsp">
        <title>0842132-0842109--Message</title>
    </head>
    <body>
        <center>
            <h1>Message from our system</h1><br>
            <%
                        String source = String.valueOf(request.getAttribute("source"));
                        request.removeAttribute("source");

                        if (source.equals("adduser")) {
                            boolean rs = Boolean.parseBoolean(String.valueOf(request.getAttribute("rs")));
                            UserPOJO usr = (UserPOJO) request.getAttribute("user");
                            if (rs) {
                                out.print("Chúc mừng <b>" + usr.getFullname() + "</b> đã tạo tài khoản thành công vui lòng đợi một tí.....<br >");
                            } else {
                                out.print("Không tạo được tài khoản, vui lòng thử lại<br >");
                            }
                        } else if (source.equals("login")) {
                            boolean isLogin = Boolean.parseBoolean(String.valueOf(session.getAttribute("isLogin")));
                            UserPOJO user = (UserPOJO) session.getAttribute("user");
                            if (isLogin) {
                                out.print("Xin chào <b>" + user.getFullname() + "</b> vui lòng đợi một tí.....<br >");
                            } else {
                                out.print("Tên đăng nhập hoặc mật khẩu không đúng, hãy thử lại lần nửa");
                                response.sendRedirect("login.jsp?ac=in");
                            }
                        } else if (source.equals("out")) {
                            out.print("Đang thoat khỏi hệ thống.........");
                            response.sendRedirect("index.jsp");
                        }
                        
            %>
            <br>Đang chuyển sang trang chủ......<br><br>
            <img src="images/loading.gif"/>

        </center>

    </body>
</html>
