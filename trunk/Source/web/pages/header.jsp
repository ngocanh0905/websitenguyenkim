<%-- 
    Document   : header
    Created on : Nov 20, 2010, 10:51:37 AM
    Author     : tannguyen
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div id="header_helper_container"> <!-- Chứa logo, banner, navigation-->
    <img src="images/header_bg.jpg" alt="Hinh banner"/>
</div>

<div id="navigation"><!-- Navigation bar -->
    <ul>
        <li>
            <span>
                <a href="index.jsp">Trang chủ</a>
            </span>
        </li>
        <li>
            <span>
                <a href="index.jsp">Thông tin</a>
            </span>
        </li>
        <li>
            <span>
                <a href="index.jsp">Điều khoản</a>
            </span>
        </li>
        <li>
            <span>
                <a href="index.jsp">Trợ giúp</a>
            </span>
        </li>
        <li>
            <span style="border: 0px">
                <a href="index.jsp">Liên hệ</a>
            </span>
        </li>
    </ul>
</div>

<div id="top_tools_container"><!-- chứa search tool và phần authentiacation -->
    <div id ="search">
        <form action="" method="Get">
            Từ khóa
            <select name="commodityType">
                <option>Máy ép trái cây</option>
                <option>TV LCD</option>
                <option>Máy hút bụi</option>
                <option>Bàn ủi</option>
            </select>
            <input type ="text" name="txtKeyword" id="key"/>
            <input type="image" src="images/tim.gif" alt="Submit" id="btnSearch" />
            <a href="">Tìm kiếm nâng cao</a>
        </form>
    </div>
    <div id="sign_io">
        <%
                    Object isLogin = session.getAttribute("isLogin");
                    if (isLogin == null) {
        %>
        <a href ="pages/login.jsp?ac=in">Đăng nhập</a> hoặc <a href="pages/register.jsp">Đăng ký</a>

        <%                    } else {
                        String username = String.valueOf(session.getAttribute("username"));
                        out.print(username + "[<a href ='pages/login.jsp?ac=out'>Thoát</a>]");
                    }

        %>

    </div>
</div>

<div id="content_tools"> <!-- chứa shopping cart và checkout -->
    <table width="100%" border ="0px">
        <tr>
            <td width ="60%">
        <marquee behavior="alternate"> <h2> 0842132-0842109 -- Đồ án Chuyên đề Java </h2> </marquee>
        </td>
        <td>
            <img src="images/cart.gif"/>
        </td>
        </tr>
    </table>
</div>
