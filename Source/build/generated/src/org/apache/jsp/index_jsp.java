package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>0842132_0842109</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("        <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\n");
      out.write("            <div id=\"header\">\n");
      out.write("                <div id=\"header_helper_container\"> <!-- Chứa logo, banner, navigation-->\n");
      out.write("                    <img src=\"images/header_bg.jpg\" alt=\"Hinh banner\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"top_tools_container\"><!-- chứa search tool và phần authentiacation -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"content_tools\"><!-- chứa shopping cart và checkout -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div><!-- End Header -->\n");
      out.write("\n");
      out.write("         <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\n");
      out.write("\n");
      out.write("            <div id=\"content\"> <!-- Phần nội dung của trang web -->\n");
      out.write("                    <div id=\"content_header\"><!-- chứa flash quảng cáo -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"left_content\"><!-- hiển thị catelory và quảng cáo -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"central_column\"><!-- hiển thị danh mục các sản phẩm -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div> <!-- End content -->\n");
      out.write("\n");
      out.write("         <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\n");
      out.write("\n");
      out.write("         <div id=\"footer\"> <!-- phần footer -->\n");
      out.write("             ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pages/footer.jsp", out, false);
      out.write("\n");
      out.write("         </div>\n");
      out.write("    </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
