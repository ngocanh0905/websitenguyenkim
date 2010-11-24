<%--
    Document   : customerCare
    Created on : Nov 18, 2010, 10:10:16 AM
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
                request.setAttribute("source", "customer");
                request.setAttribute("actionMode", ActionMode.Get);
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
            Object obj1 = request.getAttribute("manufacturer");
            if (obj1 == null) {
                String url = "/GetManufacturerAllController";
                request.setAttribute("source", "customer");
                request.setAttribute("actionMode", ActionMode.Get);
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


                    THÔNG TIN CHĂM SÓC KHÁCH HÀNG TẠI NGUYỄN KIM

                    Quý khách hàng cần thông tin về các vấn đề mua hàng trên mạng, thông tin sản phẩm, hình ảnh yêu cầu báo giá vui lòng liên hệ bộ phận:

                    Chăm Sóc Khách hàng - Trung tâm Thương Mại Điện Tử

                    cham soc khach hang nguyen kim(848) 38 211 211 Bấm số nội bộ : 3005 - 3006

                    .......................................................................................................................................

                    Khách hàng mua hàng trực tiếp tại trung tâm Mua Sắm Sài Gòn Nguyễn Kim Q1 vui lòng liên hệ bộ phận:

                    Chăm sóc khách hàng - Trung tâm Mua Sắm Sài Gòn Nguyễn Kim Quận 1

                    cham soc khach hang nguyen kim(848) 38 211 211 Bấm số nội bộ 1120-1172-1173

                    ............................................................................................................................................

                    Khách hàng mua hàng trực tiếp tại trung tâm Mua Sắm Nguyễn Kim Tân Bình vui lòng liên hệ bộ phận:

                    Chăm sóc khách hàng - Trung Tâm Mua Sắm Nguyễn Kim- Tân Bình

                    cham soc khach hang nguyen kim(848) 38 669 999 Bấm số nội bộ 1853- 1854- 1855

                    ............................................................................................................................................

                    Khách hàng mua hàng trực tiếp tại trung tâm Mua Sắm Nguyễn Kim Tràng Thi vui lòng liên hệ bộ phận:

                    Chăm sóc khách hàng - Trung tâm Mua Sắm Nguyễn Kim Tràng Thi Hà Nội

                    cham soc khach hang nguyen kim(844) 39 287 777 Bấm số nội bộ 2033-2032


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
