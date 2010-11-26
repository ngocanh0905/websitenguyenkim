<%-- 
    Document   : cartDetail
    Created on : Nov 26, 2010, 3:54:58 PM
    Author     : tannguyen
--%>

<%@page import="Models.POJOs.OrderDetailPOJO"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<table border="0" width="100%" cellpadding="2" cellspacing="0">
    <tr bgcolor="#FFCC00">
        <td>
            <center><strong>
                    <font color="#0000FF">
                        DANH SÁCH SẢN PHẨM HIỆN CÓ TRONG GIỎ HÀNG
                    </font>
                </strong></center>
        </td>
    </tr>
    <%
                //obj3 = request.getAttribute("Commodity");
                //ArrayList<CommodityPOJO> ds = (ArrayList<CommodityPOJO>) obj3;
                ArrayList<OrderDetailPOJO> cart = (ArrayList<OrderDetailPOJO>) session.getAttribute("cart");
                float sum = 0;

                for (OrderDetailPOJO p : cart) {
                    sum += p.getAmount() * p.getPrice();
    %>
    <form action="updCart" method="get">
        <tr>
            <td>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="25%" rowspan="5" valign="top">
                            <a href="viewProductDetail.jsp?id=<%=p.getCommodity().getCommodityName()%>"
                               <img alt=""  src="<%= p.getCommodity().getImgUrl()%>" width="100%" height="150" border="0" style="padding-left: 20px; padding-right: 20px">
                            </a>
                        </td>
                        <td height="28"><a href="viewProductDetail.jsp?id=<%=p.getCommodity().getCommodityId()%>"><%=p.getCommodity().getCommodityName()%></a></td>
                    </tr>
                    <tr>
                        <td height="28">Nhà sản xuất: <font color="#0000FF"><strong><%=p.getCommodity().getManufacturer().getManufacturerName()%></strong></font></td>
                    </tr>
                    <tr>
                        <td height="28">Giá bán: <strong><font color="#FF0000"><%=p.getCommodity().getUnitPrice()%></font></strong></td>
                    </tr>
                    <tr>
                        <td height="28" valign="bottom">Số lượng: <input type="text" name="sl" value="<%=p.getAmount()%>"/></td>
                    </tr>
                    <tr>
                        <td>
                            <input type="hidden" name="id" value="<%=p.getCommodity().getCommodityId()%>"
                                   <input type="image" src="images/update.gif" alt="Add to cart"/>
                        </td>
                    </tr>
                </table>
            </td>
        </tr>
        <tr>
        <td align="right"><br><br><hr>
        </td>
    </tr>

    </form>
    <%
                }
    %>
    <tr>
        <td align="right"><br><br>
            Tổng thành tiền: <strong><font color="#FF0000"><%=sum%></font></strong><br>
            <a href="checkout.jsp"><img src="images/checkout.gif" alt="Thanh toán"/></a>

        </td>
    </tr>
</table>