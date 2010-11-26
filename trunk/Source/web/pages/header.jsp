<%-- 
    Document   : header
    Created on : Nov 20, 2010, 10:51:37 AM
    Author     : tannguyen
--%>
<%@page import="Models.POJOs.UserPOJO"%>
<%@page import="java.lang.String"%>
<%@page import="Models.POJOs.OrderDetailPOJO"%>
<%@page import="Models.POJOs.CommodityPOJO"%>
<%@page import="Models.POJOs.CommodityTypePOJO"%>
<%@page import="java.util.ArrayList"%>
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

                <option value="0">[Tất cả]</option>
                <%
                            Object obj = request.getAttribute("commodityType");
                            ArrayList<CommodityTypePOJO> list = (ArrayList<CommodityTypePOJO>) obj;
                            for (CommodityTypePOJO ct : list) {
                %>

                <option value =<%=ct.getCommodityTypeId()%>><%=ct%></option>
                <%
                            }

                %>

            </select>
            <input type ="text" name="txtKeyword" id="key"/>
            <input type="image" src="images/tim.gif" alt="Submit" id="btnSearch" />
            <a href="">Tìm kiếm nâng cao</a>
        </form>
    </div>
    <div id="sign_io">
        <%
                    String s = String.valueOf(session.getAttribute("isLogin"));
                    boolean isLogin = Boolean.parseBoolean(s);

                    if (!isLogin) {
        %>
        <a href ="login.jsp?ac=in">Đăng nhập</a> hoặc <a href="register.jsp">Đăng ký</a>

        <%                    } else {
                        UserPOJO user = (UserPOJO)session.getAttribute("user");
                        out.print(user.getFullname() + "[<a href ='GetUserByUserPass?ac=out'>Thoát</a>]");
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
        <td align ="right">
            <a href="cart.jsp"><img src="images/cart.gif"/></a>
                <%
                            float sm = 0;
                            int amount = 0;
                            Object objCart = session.getAttribute("cart");
                            if (objCart != null) {
                                ArrayList<OrderDetailPOJO> cart = (ArrayList<OrderDetailPOJO>) objCart;

                                for (OrderDetailPOJO item : cart) {
                                    sm += item.getPrice();
                                    amount += item.getAmount();
                                }
                            }
                %>
            Có &nbsp; <%=amount%> sản phẩm, tổng giá trị: <%=sm%>&nbsp;&nbsp;|&nbsp;&nbsp
            <a href="checkout.jsp">Thanh toán >></a>

        </td>
        </tr>
    </table>
</div>
