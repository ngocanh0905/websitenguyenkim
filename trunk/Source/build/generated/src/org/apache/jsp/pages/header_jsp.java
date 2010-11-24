package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div id=\"header_helper_container\"> <!-- Chứa logo, banner, navigation-->\n");
      out.write("    <img src=\"images/header_bg.jpg\" alt=\"Hinh banner\"/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"navigation\"><!-- Navigation bar -->\n");
      out.write("    <ul>\n");
      out.write("        <li>\n");
      out.write("            <span>\n");
      out.write("                <a href=\"index.jsp\">Trang chủ</a>\n");
      out.write("            </span>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <span>\n");
      out.write("                <a href=\"index.jsp\">Thông tin</a>\n");
      out.write("            </span>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <span>\n");
      out.write("                <a href=\"index.jsp\">Điều khoản</a>\n");
      out.write("            </span>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <span>\n");
      out.write("                <a href=\"index.jsp\">Trợ giúp</a>\n");
      out.write("            </span>\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <span style=\"border: 0px\">\n");
      out.write("                <a href=\"index.jsp\">Liên hệ</a>\n");
      out.write("            </span>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"top_tools_container\"><!-- chứa search tool và phần authentiacation -->\n");
      out.write("    <div id =\"search\">\n");
      out.write("        <form action=\"\" method=\"Get\">\n");
      out.write("            Từ khóa\n");
      out.write("            <select name=\"commodityType\">\n");
      out.write("                <option>Máy ép trái cây</option>\n");
      out.write("                <option>TV LCD</option>\n");
      out.write("                <option>Máy hút bụi</option>\n");
      out.write("                <option>Bàn ủi</option>\n");
      out.write("            </select>\n");
      out.write("            <input type =\"text\" name=\"txtKeyword\" id=\"key\"/>\n");
      out.write("            <input type=\"image\" src=\"images/tim.gif\" alt=\"Submit\" id=\"btnSearch\" />\n");
      out.write("            <a href=\"\">Tìm kiếm nâng cao</a>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"sign_io\">\n");
      out.write("        ");

        String strLogin = String.valueOf(session.getAttribute("íLogin"));
        out.println("<h1>"+strLogin+"n</h1>");

        
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div id=\"content_tools\"> <!-- chứa shopping cart và checkout -->\n");
      out.write("\n");
      out.write("</div>\n");
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
