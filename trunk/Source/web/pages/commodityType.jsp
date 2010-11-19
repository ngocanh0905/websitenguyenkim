<%-- 
    Document   : commodityType
    Created on : Nov 19, 2010, 9:13:06 PM
    Author     : tannguyen
--%>

<%@page import="Models.POJOs.CommodityTypePOJO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Contollers.Modes.ActionMode"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<%
            Object obj = request.getAttribute("commodityType");
            if (obj == null) {
                request.setAttribute("actionMode", ActionMode.Get);
                String url = "GetCommodityTypeAll";
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
%>
<ul>
    <%
                obj = request.getAttribute("commodityType");
                ArrayList<CommodityTypePOJO> list = new ArrayList<CommodityTypePOJO>();
                for (CommodityTypePOJO ct : list) {
    %>
    <li>
        <a href="#"><%= ct.toString() %></a>
    </li>
    <%            }
    %>
</ul>