<%-- 
    Document   : productDetail
    Created on : Nov 26, 2010, 11:55:51 AM
    Author     : tannguyen
--%>

<%@page import="Models.POJOs.CommodityPOJO"%>
<%@page import="Models.DAOs.CommodityDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%
            String sId = request.getParameter("id");
            int id = Integer.parseInt(sId);
            CommodityPOJO p = CommodityDAO.getProductById(id);
%>

<br>
<br>
<table border="0" width="100%" cellpadding="2" cellspacing="0">
    <tr bgcolor="#FFCC00">
        <td>
            <center><strong>
                    <font color="#0000FF">
                        THÔNG TIN CHI TIẾT SẢN PHẨM
                    </font>
                </strong></center>
        </td>
    </tr>

    <tr>
        <td>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="25%" rowspan="5" valign="middle">
                        <a href="viewProductDetail.jsp?id=<%= p.getCommodityId()%>"
                           <img alt=""  src="<%= p.getImgUrl()%>" width="100%" height="150" border="0" style="padding-left: 20px; padding-right: 20px">
                        </a>
                    </td>
                    <td height="28"><a href="viewProductDetail.jsp?id=<%=p.getCommodityId()%>"><%=p.getCommodityName()%></a></td>
                </tr>
                <tr>
                    <td height="28" width="25%">Nhà sản xuất</td>
                    <td height="28"><font color="#0000FF"><strong><%=p.getManufacturer().getManufacturerName()%></strong></font></td>
                </tr>
                <tr>
                    <td height="28" width="25%">Giá bán</td>
                    <td height="28"><strong><font color="#FF0000"><%=p.getUnitPrice()%></font></strong></td>
                </tr>
                <tr>
                    <td height="28" valign="bottom" width="25%">Miêu tả</td>
                    <td height="28" valign="bottom"><%=p.getDescription()%></td>
                </tr>
                <tr>
                    <td height="28" valign="bottom" width="25%">Tính năng</td>
                    <td height="28" valign="bottom"> <%=p.getFeature()%></td>
                </tr>
                <tr>
                    <td>&nbsp;</td>
                    <td width="25%">
                        <a href="addCart?id=<%=p.getCommodityId()%>">
                            <form action="addCart" method="get">
                                <input type="hidden" name="id" value="<%=p.getCommodityId() %>"
                                <input type="image" src="images/buy.jpg" alt="Add to cart"/>
                            </form>
                        </a>
                    </td>
                </tr>
            </table></td>
    </tr>
    <tr>
        <td><br><hr><br></td>
    </tr>

</table>