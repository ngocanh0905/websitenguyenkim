<%-- 
    Document   : login
    Created on : Nov 24, 2010, 3:36:58 PM
    Author     : tannguyen
--%>


<%@page import="Models.POJOs.RolePOJO"%>
<%@page import="Models.POJOs.UserPOJO"%>
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
                request.setAttribute("source", "register");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
            Object obj1 = request.getAttribute("manufacturer");
            if (obj1 == null) {
                String url = "/GetManufacturerAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "register");
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
        <style type="text/css">
            .style1 {
                color: #FF0000;
            }
        </style>
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

                    <form action="acRegister.jsp" method="post" onsubmit="return checkForm()">
                        <table width="100%" border ="0px">
                            <tr>
                                <td><br><br>
                                    <div id="message"></div>
                                </td>
                            </tr>

                            <tr>
                                <td><center><h2>Đăng ký tài khoản</h2></center></td>
                            </tr>
                            <tr>
                                <td></td>
                            </tr>
                            <tr>
                                <td><h5>Thông tin đăng nhập</h5></td>
                            </tr>
                            <tr>
                                <td><hr></td>
                            </tr>
                            <tr>
                                <td>
                                    <!-- Thông tin dùng để đăng nhập -->
                                    <table border="0px" width="100%">
                                        <tr>
                                            <td class="field">
                                                <input type="hidden" name="userId" value="1"/>
                                                Tên đăng nhập
                                            </td>
                                            <td>
                                                <input type="text" name="username" id="username" onfocus="fnFocus(this.id,'u')" onblur="fnLostFocus(this.id,'u')"/>
                                        	(<span class="style1">*</span>)
                                                <span id="u"/>
                                            </td>

                                        </tr><!-- username -->
                                        <tr>
                                            <td class="field">
                                                Mật khẩu
                                            </td>
                                            <td>
                                                <input type="password" name="password" id="password" onfocus="fnFocus(this.id,'p')" onblur="fnLostFocus(this.id,'p')"/>
                                        	(<span class="style1">*</span>)
                                                <span id="p"/>
                                            </td>
                                        </tr> <!-- password -->

                                        <tr>

                                            <td class="field">
                                                Nhập lại mật khẩu
                                            </td>
                                            <td>
                                                <input type="password" name="repass" id="repass" onfocus="fnFocus(this.id,'rp')" onblur="fnLostFocus(this.id,'rp'); "/>
                                        	(<span class="style1">*</span>)
                                                <span id="rp"/>
                                            </td>
                                        </tr> <!-- Reenter password -->

                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                            </tr>
                            <tr>
                                <td><h5>Xác nhận tuổi</h5></td>
                            </tr>
                            <tr>
                                <td><hr></td>
                            </tr>
                            <tr>
                                <td>
                                    <!--Xác nhận tuổi-->
                                    <table border="0px" width="100%">

                                        <tr>
                                            <td class="field">
                                                Ngày sinh
                                            </td>
                                            <td>
                                                <script type="text/javascript" src="js/datetimepicker.js"></script>
                                                <input id="demo1" type="text" name="birth" onfocus="fnFocus(this.id,'')" onblur="fnLostFocus(this.id,'')">
                                                <a href="javascript:NewCal('demo1','ddmmyyyy')">
                                                    <img src="images/cal.gif" width="16" height="16" border="0" alt="Pick a date">
                                                </a>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>

                            <tr>
                                <td></td>
                            </tr>
                            <tr>
                                <td><h5>Thông tin cá nhân</h5></td>
                            </tr>
                            <tr>
                                <td><hr></td>
                            </tr>
                            <tr>
                                <td>
                                    <!--Thông tin các nhân-->

                                    <table border="0px" width="100%">
                                        <tr>

                                            <td class="field">
                                                Họ tên đầy đủ
                                            </td>
                                            <td>
                                                <input type="text" name="fullname" id="fullname" onfocus="fnFocus(this.id,'fn')" onblur="fnLostFocus(this.id,'fn'); "/>
                                        	(<span class="style1">*</span>)
                                                <span id="fn"/>
                                            </td>

                                        </tr><!-- fullname -->
                                        <tr>

                                            <td class="field">
                                                Địa chỉ
                                            </td>
                                            <td>
                                                <input type="text" name="address" id="address" onfocus="fnFocus(this.id,'')" onblur="fnLostFocus(this.id,''); "/>
                                            </td>
                                        </tr> <!-- address -->

                                        <tr>

                                            <td class="field">
                                                Điện thoại
                                            </td>
                                            <td>
                                                <input type="text" name="cellphone" id="cellphone" onfocus="fnFocus(this.id,'')" onblur="fnLostFocus(this.id,''); "/>
                                            </td>
                                        </tr> <!-- Cellphone -->

                                        <tr>

                                            <td class="field">
                                                Giới tính
                                            </td>
                                            <td>
                                                <input type="radio" name="gender" id="lady" value="0" checked="checked"/>
                                                <label for="lady">Nữ</label>
                                                <input type="radio" name="gender" id="gentement" value="1"/>
                                                <label for="gentement">Nam</label>
                                            </td>
                                        </tr> <!-- gender -->

                                        <tr>

                                            <td class="field">
                                                Email
                                            </td>
                                            <td>
                                                <input type="text" name="email" id="email" onfocus="fnFocus(this.id,'email')" onblur="fnLostFocus(this.id,'email') "/>
                                        	(<span class="style1">*</span>)
                                                <span id="email"></span>
                                            </td>
                                        </tr> <!-- email -->

                                        <tr>

                                            <td class="field">                                              

                                            </td>
                                            <td>
                                                <br>
                                                <input type="submit" value="Đăng ký"/>
                                                <input type="reset" value="Reset"/>
                                            </td>
                                        </tr> <!-- button -->

                                    </table>

                                </td>
                            </tr>

                        </table>
                    </form>
                    


                    <!-- Phần kết thúc code -->
                </div>

            </div> <!-- End content -->

            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->

            <div id="footer"> <!-- phần footer -->
                <%@include file = "pages/footer.jsp" %>
            </div>
        </div>
    </body>
</html>

<!-- Xử lý đăng ký -->
