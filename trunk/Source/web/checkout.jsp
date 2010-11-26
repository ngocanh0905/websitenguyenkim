<%-- 
    Document   : checkout
    Created on : Nov 26, 2010, 5:17:08 PM
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
                request.setAttribute("source", "checkout");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
            Object obj1 = request.getAttribute("manufacturer");
            if (obj1 == null) {
                String url = "/GetManufacturerAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "checkout");
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
            .auto-style1 {
                text-align: center;
            }
            .auto-style2 {
                text-align: right;
            }
        .auto-style3 {
	text-align: left;
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
                        <li> <span><a href="viewProduct.jsp?ctId=<%= ct.getCommodityTypeId()%>"><%=ct%></a></span>
                            <ul>
                                <%
                                                                        for (ManufacturerPOJO m : mList) {
                                %>
                                <li> <span><a href="viewProduct.jsp?ctId=<%= ct.getCommodityTypeId()%> &mId=<%= m.getManufacturerId()%>"><%=m%></a></span></li>
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



                    <!-- Phần kết thúc code -->

                    <form action ="pages/rsCheckout.jsp" method="get">
                        <table style="width: 100%">
                            <tr>
                                <td><br><br></td>
                            </tr>
                            <tr>
                                <td bgcolor="#FFFF00" class="auto-style1"><strong>HỆ
							THỐNG THANH TOÁN ONLINE</strong></td>
                            </tr>
                            <tr>
                                <td>
                                <br><hr>
                                <strong>Địa chỉ giao hàng</strong>
                                <hr><br>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <table style="width: 100%" cellpadding="10">
                                        <tr>
                                            <td class="auto-style2" style="width: 278px">
									Họ tên người nhận </td>
                                            <td><input name="Text1" type="text" onfocus="fnFocus(this.id,'')" onblur="fnLostFocus(this.id,'')"></td>
                                        </tr>
                                        <tr>
                                            <td class="auto-style2" style="width: 278px">
									Điện thoại liên hệ</td>
                                            <td><input name="Text2" type="text" onfocus="fnFocus(this.id,'')" onblur="fnLostFocus(this.id,'')"></td>
                                        </tr>
                                        <tr>
                                            <td class="auto-style2" style="width: 278px">
									Địa chỉ thanh toán</td>
                                            <td><input name="Text3" type="text" onfocus="fnFocus(this.id,'')" onblur="fnLostFocus(this.id,'')"></td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td class="auto-style3">
                                <br><hr>
                                <strong>Hình thức vận chuyển</strong>
                                <hr>
								<div class="auto-style3">
									<br>
                                </div>
                                </td>
                            </tr>
                            <tr>
                                <td class="auto-style1">
                                    <table style="width: 100%" cellpadding="10">
                                        <tr>
                                            <td style="width: 278px">
											&nbsp;</td>
                                            <td>
                                                &nbsp;<table style="width: 100%">
                                                    <tr>
                                                        <td class="auto-style3">
                                                            <input checked="true" name="trans" type="radio" id="tu" value="V1">
                                                            <label for="tu">Đến công ty nhận</label></td>
                                                    </tr>
                                                    <tr>
                                                        <td class="auto-style3">
                                                            <input name="trans" type="radio" id="ship" value="V1"/>
                                                            <label for="ship">Giao hàng tận nhà</label>
                                                        </td>
                                                    </tr>
                                                </table>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                <br><hr>
                                <strong>Hình thức thanh toán</strong>
                                <hr><br>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <table style="width: 100%">
                                        <tr>
                                            <td width="287">&nbsp;</td>
                                            <td>
                                                <table style="width: 100%" cellpadding="10">
                                                    <tr>
                                                        <td>
                                                            <input checked="true" name="pay" type="radio" id="tien" value="V1">
                                                            <label for="tien">Tiền mặt</label></td>
                                                    </tr>
                                                    <tr>
                                                        <td>
                                                            <input name="pay" type="radio" id="atm" value="V1">
                                                            <label for="atm">Chuyển khoản qua ngân hàng</label></td>
                                                    </tr>
                                                    <tr>
                                                        <td>
                                                            <input name="pay" type="radio" id="paypal" value="V1">
                                                            <label for="paypal">Thanh toán qua hệ thống Paypal</label></td>
                                                    </tr>


                                                </table>
                                            </td>
                                        </tr>
                                    </table>
                                </td>
                            </tr>
                            <tr>
                                <td><hr></td>
                            </tr>
                            <tr>
                                <td align="right">
                                    <input type="hidden" name="isCheckout" value="1"/>
                                    <input type="image" src="images/checkout.gif"/>
                                </td>
                              
                            </tr>
                        </table>
                    </form>
                </div>

            </div> <!-- End content -->

            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->

            <div id="footer"> <!-- phần footer -->
                <%@include file = "pages/footer.jsp" %>
            </div>
        </div>
    </body>
</html>
