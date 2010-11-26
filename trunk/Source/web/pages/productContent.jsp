<%-- 
    Document   : productContent
    Created on : Nov 26, 2010, 9:01:50 AM
    Author     : tannguyen
--%>

<%@page import="Models.DAOs.CommodityDAO"%>
<%@page import="Models.DAOs.CommodityDAO"%>
<%@page import="java.util.Random"%>
<%@page import="Models.POJOs.CommodityPOJO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Contollers.Modes.ActionMode"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%
            /*Object obj3 = request.getAttribute("Commodity");
            if (obj3 == null) {
            String url = "/GetCommodityController";
            request.setAttribute("actionMode", ActionMode.Get);
            RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
            rd.forward(request, response);
            }*/

            String ctid = request.getParameter("ctId");
            int ctId = 1, mId = 0;
            if (ctid != null) {
                ctId = Integer.parseInt(ctid);
            }
            String mid = request.getParameter("mId");
            if (mid != null) {
                mId = Integer.parseInt(mid);
            }
            ArrayList<CommodityPOJO> ds = new ArrayList<CommodityPOJO>();
            if (mId == 0) {
                ds = CommodityDAO.getProductByCt(ctId);
            } else {
                ds = CommodityDAO.getProductByCM(ctId, mId);
            }
%>

<br>

<table border="0" width="100%" cellpadding="2" cellspacing="0">
    <tr bgcolor="#FFCC00">
        <td>
            <center><strong>
                    <font color="#0000FF">
                        DANH SÁCH SẢN PHẨM
                    </font>
                </strong></center>
        </td>
    </tr>
    <%
                //obj3 = request.getAttribute("Commodity");
                //ArrayList<CommodityPOJO> ds = (ArrayList<CommodityPOJO>) obj3;
                Random generator = new Random();


                for (CommodityPOJO p : ds) {
                    int r = generator.nextInt(10);
    %>
    <form action="addCart" method="get">
        <tr>
            <td>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <tr>
                        <td width="25%" rowspan="5" valign="top">
                            <a href="viewProductDetail.jsp?id=<%= p.getCommodityId()%>"
                               <img alt=""  src="<%= p.getImgUrl()%>" width="100%" height="150" border="0" style="padding-left: 20px; padding-right: 20px">
                            </a>
                        </td>
                        <td height="28"><a href="viewProductDetail.jsp?id=<%=p.getCommodityId()%>"><%=p.getCommodityName()%></a></td>
                    </tr>
                    <tr>
                        <td height="28">Nhà sản xuất: <font color="#0000FF"><strong><%=p.getManufacturer().getManufacturerName()%></strong></font></td>
                    </tr>
                    <tr>
                        <td height="28">Giá bán: <strong><font color="#FF0000"><%=p.getUnitPrice()%></font></strong></td>
                    </tr>
                    <tr>
                        <td height="28" valign="bottom">Số lần xem: <strong><font color="#0000FF"><%=r%></font></strong></td>
                    </tr>
                    <tr>
                        <td height="28" valign="bottom">Số lượng: <input type="text" name="sl"value="1"/></td>
                    </tr>
                    <tr>
                        <td height="28" valign="bottom">&nbsp;</td>
                        <td>
                            <a href="viewProductDetail.jsp?id=<%=p.getCommodityId()%>">Xem chi tiết</a>
                            <input type="hidden" name="id" value="<%=p.getCommodityId()%>"
                            <input type="image" src="images/buy.jpg" alt="Add to cart"/>
                        </td>
                    </tr>
                </table></td>
        </tr>
        <tr>
            <td><br><hr><br></td>
        </tr>
    </form>
    <%}%>
</table>