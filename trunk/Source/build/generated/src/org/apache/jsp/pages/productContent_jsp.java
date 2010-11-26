package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import Models.POJOs.CommodityPOJO;
import java.util.ArrayList;
import Contollers.Modes.ActionMode;

public final class productContent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");

            Object obj3 = request.getAttribute("Commodity");
            if (obj3 == null) {
                String url = "/GetCommodityController";
                request.setAttribute("actionMode", ActionMode.Get);
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("    <tr bgcolor=\"#FFCC00\">\n");
      out.write("        <td>\n");
      out.write("            <center><strong>\n");
      out.write("                    <font color=\"#0000FF\">\n");
      out.write("                        DANH SÁCH SẢN PHẨM\n");
      out.write("                    </font>\n");
      out.write("                </strong></center>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    ");

                obj3 = request.getAttribute("Commodity");
                ArrayList<CommodityPOJO> ds = (ArrayList<CommodityPOJO>) obj3;
                Random generator = new Random();
                int r = generator.nextInt(10);

                for (CommodityPOJO p : ds) {
    
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"25%\" rowspan=\"5\" valign=\"top\">\n");
      out.write("                        <a href=\"viewProductDetail.jsp?id=");
      out.print( p.getCommodityId());
      out.write("\"\n");
      out.write("                           <img alt=\"\"  src=\"");
      out.print( p.getImgUrl());
      out.write("\" width=\"100%\" height=\"150\" border=\"0\">\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("                    <td height=\"28\"><a href=\"viewProductDetail.jsp?id=");
      out.print(p.getCommodityId());
      out.write('"');
      out.write('>');
      out.print(p.getCommodityName());
      out.write("</a></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"28\">Nhà sản xuất: <font color=\"#0000FF\"><strong>");
      out.print(p.getManufacturer().getManufacturerName());
      out.write("</strong></font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"28\">Giá bán: <strong><font color=\"#FF0000\">");
      out.print(p.getUnitPrice());
      out.write("</font></strong></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td height=\"28\" valign=\"bottom\">Số lần xem: <strong><font color=\"#0000FF\">");
      out.print(r);
      out.write("</font></strong></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>                        \n");
      out.write("                        <a href=\"viewProductDetail.jsp?id=");
      out.print(p.getCommodityId() );
      out.write("\">Xem chi tiết</a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><hr></td>\n");
      out.write("    </tr>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("</table>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
