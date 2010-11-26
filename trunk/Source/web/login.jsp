<%-- 
    Document   : login
    Created on : Nov 25, 2010, 9:44:24 PM
    Author     : tannguyen
--%>

<%@page import="Models.POJOs.ManufacturerPOJO"%>
<%@page import="Contollers.Modes.ActionMode"%>
<%@page import="Models.POJOs.CommodityTypePOJO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


<%
            Object obj = request.getAttribute("commodityType");
            if (obj == null) {
                String url = "/GetCommodityTypeAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "login");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
            Object obj1 = request.getAttribute("manufacturer");
            if (obj1 == null) {
                String url = "/GetManufacturerAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "login");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
%>

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/headerStyle.css" rel="stylesheet" type="text/css"/>
        <link href="CSS/footerStyle.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="js/script.js"></script>

        <title>0842132_0842109</title>
    </head>
    <body>
        <div id="wrapper">
            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->
            <div id="header">
                <jsp:include page="pages/header.jsp"/>
            </div><!-- End Header -->

            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->

            <div id="content"> <!-- Phần nội dung của trang web -->
                <div id="content_header"><!-- chứa flash quảng cáo -->
                    <img src="images/nganluongtop.gif" alt="He thong thanh toan moi"/>
                </div>

                <div id="mainNav"><!-- hiển thị catelory và quảng cáo -->
                    <h3 class="sub_title">DANH MỤC</h3>
                    <ul>
                        <li><span><a href="index.jsp">Trang chủ</a></span></li>
                        <%
                                    obj = request.getAttribute("commodityType");
                                    ArrayList<CommodityTypePOJO> list = (ArrayList<CommodityTypePOJO>) obj;
                                    obj1 = request.getAttribute("manufacturer");
                                    ArrayList<ManufacturerPOJO> mList = (ArrayList<ManufacturerPOJO>) obj1;
                                    for (CommodityTypePOJO ct : list) {
                        %>
                        <li> <span><a href="#"><%=ct%></a></span>
                            <ul>
                                <%
                                                                        for (ManufacturerPOJO m : mList) {
                                %>
                                <li> <span><a href="#"><%=m%></a></span></li>
                                <%
                                                                        }

                                %>

                            </ul>
                        </li>
                        <%
                                    }
                        %>
                    </ul>

                    <img src="images/banner_20-11_dai.jpg" alt="Advisting"/>
                </div>

                <div id="mainContent"><!-- đặt code trong tag này -->
                    <!-- Code trong phần này -->

                    <%
                                String ac = request.getParameter("ac").toString();
                                if (ac.equals("in")) {
                    %>

                    <form action="GetUserByUserPass" method="post">
                        <table style="width: 100%">
                            <tr>
                                <td><br><br>
                                    <center><h2>Đăng nhập</h2>
                                    </center>
                                    <hr>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <table style="width: 100%">
                                        <tr>
                                            <td style="width: 159px; height: 26px;"></td>
                                            <td style="width: 115px; height: 26px;">Tên đăng nhập</td>
                                            <td style="height: 26px"><input name="username" type="text" id="us" onfocus="fnFocus(this.id,'u')" onblur="fnLostFocus(this.id,'u')"/></td>
                                        </tr>
                                        <tr>
                                            <td style="width: 159px">&nbsp;</td>
                                            <td style="width: 115px">Mật khẩu</td>
                                            <td>
                                                <input name="password" type="password" id ="password" onfocus="fnFocus(this.id,'')" onblur="fnLostFocus(this.id,'')"/></td>
                                        </tr>
                                        <tr>
                                            <td style="width: 159px">&nbsp;</td>
                                            <td style="width: 115px">&nbsp;</td>
                                            <td>

                                                <input id ="ch" name="remember" type="checkbox">
                                                <label for="ch"> Remember me</label>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td style="width: 159px">&nbsp;</td>
                                            <td style="width: 115px">&nbsp;</td>
                                            <td>
                                                <input name="Submit1" type="submit" value="Đăng nhập"><input name="Reset1" type="reset" value="reset"></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td >
                                    <table style="width: 100%">
                                        <tr>
                                            <td style="width: 274px">
                                                &nbsp;</td>
                                            <td><a href="#">Lấy lại mật khẩu</a></td>
                                            <td>&nbsp;</td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                        </table>
                        <hr>
                    </form>

                    <%                                }
                               
                    %>
                </div>

            </div> <!-- End content -->

            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->

            <div id="footer"> <!-- phần footer -->
                <%@include file = "pages/footer.jsp" %>
            </div>
        </div>
    </body>
</html>
