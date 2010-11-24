package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.POJOs.CommodityTypePOJO;
import java.util.ArrayList;
import Contollers.Modes.ActionMode;

public final class commodityType_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");

            Object obj = request.getAttribute("commodityType");
            if (obj == null) {
                String url = "/GetCommodityTypeAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }

      out.write("\n");
      out.write("<div id=\"catalogue\">\n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"index.jsp\">Trang chủ</a></li>\n");
      out.write("        ");

                    ArrayList<CommodityTypePOJO> list = (ArrayList<CommodityTypePOJO>) obj;
                    for (CommodityTypePOJO ct : list) {
        
      out.write("\n");
      out.write("        <li> <a href=\"#\">");
      out.print( ct);
      out.write("</a></li>\n");
      out.write("        ");

                    }
        
      out.write("\n");
      out.write("    </ul>\n");
      out.write("</div>");
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
