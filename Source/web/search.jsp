<%-- 
    Document   : search
    Created on : Nov 27, 2010, 2:33:20 AM
    Author     : tannguyen
--%>

<%--
    Document   : index
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
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "search");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
            Object obj1 = request.getAttribute("manufacturer");
            if (obj1 == null) {
                String url = "/GetManufacturerAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "search");
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
    	<style type="text/css">
		.auto-style1 {
			text-align: center;
			font-size: large;
		}
		.auto-style2 {
	margin-left: 40px;
	font-size: medium;
}
		.auto-style7 {
			margin-left: 240px;
	font-size: medium;
}
		.auto-style8 {
			border-left-style: none;
			border-left-width: medium;
			border-top-style: none;
			border-top-width: medium;
			border-bottom-style: none;
			border-bottom-width: medium;
		}
		.auto-style9 {
			margin-left: 240px;
			border-right-style: none;
			border-right-width: medium;
	font-size: medium;
}
		.auto-style10 {
			border-right-style: none;
			border-right-width: medium;
			border-top-style: none;
			border-top-width: medium;
			border-bottom-style: none;
			border-bottom-width: medium;
	font-size: medium;
}
		.auto-style11 {
			border-right-width: 0px;
		}
		.auto-style12 {
			border-top-style: none;
			border-top-width: medium;
		}
		.auto-style13 {
			border-bottom-style: none;
			border-bottom-width: medium;
		}
		.auto-style14 {
	font-size: medium;
}
.auto-style15 {
	border-top-style: none;
	border-top-width: medium;
	font-size: medium;
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
                        <li> <span><a href="viewProduct.jsp?ctId=<%= ct.getCommodityTypeId() %>"><%=ct%></a></span>
                            <ul>
                                <%
                                                                        for (ManufacturerPOJO m : mList) {
                                %>
                                <li> <span><a href="viewProduct.jsp?ctId=<%= ct.getCommodityTypeId() %> &mId=<%= m.getManufacturerId() %>"><%=m%></a></span></li>
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
                	<table cellpadding="10" style="width: 100%" class="auto-style11">
						<tr>
							<td style="width: 190px">&nbsp;</td>
							<td style="width: 208px">&nbsp;</td>
							<td>&nbsp;</td>
						</tr>
						<tr bgcolor="#808080">
							<td style="width: 190px">&nbsp;</td>
							<td class="auto-style1" style="width: 208px">
							<strong>Tìm kiếm sản phẩm</strong></td>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14">&nbsp;</td>
							<td style="width: 208px" class="auto-style14">&nbsp;</td>
							<td class="auto-style14">&nbsp;</td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14"><strong>Tùy chọn</strong></td>
							<td style="width: 208px" class="auto-style14">&nbsp;</td>
							<td class="auto-style14">&nbsp;</td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14">
							<p class="auto-style2">Tìm theo kết quả</p>
							</td>
							<td style="width: 208px" class="auto-style13">
							<select name="Select1" style="width: 188px" class="auto-style14">
							<option>Có ít nhất các từ</option>
							<option>Tất cả các từ</option>
							<option>Cụm từ chính xác</option>
							</select></td>
							<td class="auto-style13">
							<input name="Text1" type="text" class="auto-style14"></td>
						</tr>
						<tr>
							<td class="auto-style9" style="width: 190px">
							<p class="auto-style2">Tìm theo</p>
							</td>
							<td style="width: 208px" class="auto-style8">
							<input name="Checkbox1" type="checkbox" class="auto-style14"><span class="auto-style14">Tên sản phẩm
							</span>
							<input name="Checkbox2" type="checkbox" class="auto-style14"><span class="auto-style14">Mô tả</span></td>
							<td class="auto-style10">&nbsp;</td>
						</tr>
						<tr>
							<td class="auto-style7" style="width: 190px">
							<p class="auto-style2">Danh mục hàng hóa</p>
							</td>
							<td style="width: 208px" class="auto-style12">
							<select name="Select2" style="width: 183px" class="auto-style14">
							<option>Tất cả các danh mục</option>
							<option>Máy ép trái cay</option>
							<option>Máy say sinh tố</option>
							<option>Máy hút bụi</option>
							
							</select></td>
							<td class="auto-style15">&nbsp;</td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14"><strong>
							<span class="auto-style14">Tùy chọn tìm kiếm 
							nâng ca</span></strong><span class="auto-style14">o</span></td>
							<td style="width: 208px" class="auto-style14">&nbsp;</td>
							<td class="auto-style14">&nbsp;</td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14">
							<p class="auto-style2">Mã sản phẩm</p>
							</td>
							<td style="width: 208px">
							<input class="auto-style14" name="Text2" type="text"></td>
							<td class="auto-style14">&nbsp;</td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14">
							<p class="auto-style2">Giá từ</p>
							</td>
							<td style="width: 208px">
							<input class="auto-style14" name="Text4" type="text"></td>
							<td>
							<input class="auto-style14" name="Text5" type="text"></td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14">
							<p class="auto-style2">Trọng lượng từ</p>
							</td>
							<td style="width: 208px">
							<input class="auto-style14" name="Text3" type="text"></td>
							<td>
							<input class="auto-style14" name="Text6" type="text"></td>
						</tr>
						<tr>
							<td style="width: 190px" class="auto-style14">&nbsp;</td>
							<td style="width: 208px">
							<img alt="" src="" class="auto-style14"></td>
							<td class="auto-style14">&nbsp;</td>
						</tr>
					</table>
                </div>

            </div> <!-- End content -->

            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->

            <div id="footer"> <!-- phần footer -->
                <%@include file = "pages/footer.jsp" %>
            </div>
        </div>
    </body>
</html>
