package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.POJOs.ManufacturerPOJO;
import Contollers.Modes.ActionMode;
import Models.POJOs.CommodityTypePOJO;
import java.util.ArrayList;

public final class viewProductDetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(1);
    _jspx_dependants.add("/pages/footer.jsp");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");

            Object obj = request.getAttribute("commodityType");
            if (obj == null) {
                String url = "/GetCommodityTypeAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "viewDetail");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }
            Object obj1 = request.getAttribute("manufacturer");
            if (obj1 == null) {
                String url = "/GetManufacturerAllController";
                request.setAttribute("actionMode", ActionMode.Get);
                request.setAttribute("source", "viewDetail");
                RequestDispatcher rd = this.getServletContext().getRequestDispatcher(url);
                rd.forward(request, response);
            }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/headerStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/footerStyle.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <title>0842132_0842109</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\n");
      out.write("            <div id=\"header\">\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pages/header.jsp", out, false);
      out.write("\n");
      out.write("            </div><!-- End Header -->\n");
      out.write("\n");
      out.write("            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\n");
      out.write("\n");
      out.write("            <div id=\"content\"> <!-- Phần nội dung của trang web -->\n");
      out.write("                <div id=\"content_header\"><!-- chứa flash quảng cáo -->\n");
      out.write("                    <img src=\"images/nganluongtop.gif\" alt=\"He thong thanh toan moi\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"mainNav\"><!-- hiển thị catelory và quảng cáo -->\n");
      out.write("                    <h3 class=\"sub_title\">DANH MỤC</h3>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><span><a href=\"index.jsp\">Trang chủ</a></span></li>\n");
      out.write("                        ");

                                    obj = request.getAttribute("commodityType");
                                    ArrayList<CommodityTypePOJO> list = (ArrayList<CommodityTypePOJO>) obj;
                                    obj1 = request.getAttribute("manufacturer");
                                    ArrayList<ManufacturerPOJO> mList = (ArrayList<ManufacturerPOJO>) obj1;
                                    for (CommodityTypePOJO ct : list) {
                        
      out.write("\n");
      out.write("                        <li> <span><a href=\"viewProduct.jsp?ctId=");
      out.print( ct.getCommodityTypeId() );
      out.write('"');
      out.write('>');
      out.print(ct);
      out.write("</a></span>\n");
      out.write("                            <ul>\n");
      out.write("                                ");

                                                                        for (ManufacturerPOJO m : mList) {
                                
      out.write("\n");
      out.write("                                <li> <span><a href=\"viewProduct.jsp?ctId=");
      out.print( ct.getCommodityTypeId() );
      out.write(" &mId=");
      out.print( m.getManufacturerId() );
      out.write('"');
      out.write('>');
      out.print(m);
      out.write("</a></span></li>\n");
      out.write("                                ");

                                                                        }

                                
      out.write("\n");
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        ");

                                    }
                        
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                    <img src=\"images/banner_20-11_dai.jpg\" alt=\"Advisting\"/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"mainContent\"><!-- đặt code trong tag này -->\n");
      out.write("                    <!-- Code trong phần này -->\n");
      out.write("                    \n");
      out.write("                    <!-- Phần kết thúc code -->\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div> <!-- End content -->\n");
      out.write("\n");
      out.write("            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\n");
      out.write("\n");
      out.write("            <div id=\"footer\"> <!-- phần footer -->\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("    <tr>\n");
      out.write("        <td width=\"1251\">\n");
      out.write("            <table><tr><td>\n");
      out.write("                        <img src=\"images/hotline.jpg\" alt=\"hotline\" width=\"987\" height=\"32\" border=\"0\" usemap=\"#Map\">\n");
      out.write("                    </td></tr></table>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <table width=\"981\" border=\"0\" cellpadding=\"2\" cellspacing=\"0\" id=\"tbl\">\n");
      out.write("                <tr>\n");
      out.write("                    <td width=\"266\"><a href=\"index.jsp\"><img src=\"images/nguyenkim_logo.gif\" alt=\"nguyen kim\" width=\"140\" height=\"30\" border=\"0\"></a></td>\n");
      out.write("\n");
      out.write("                    <td width=\"179\" align=\"center\"><strong>CHÍNH SÁCH CÔNG TY</strong></td>\n");
      out.write("\n");
      out.write("                    <td width=\"174\" align=\"center\"><strong>QUY ĐỊNH KHÁCH HÀNG</strong></td>\n");
      out.write("\n");
      out.write("                    <td width=\"135\" align=\"center\"><strong>THÔNG TIN CÔNG TY</strong></td>\n");
      out.write("\n");
      out.write("                    <td width=\"174\" align=\"center\"><strong>THÔNG TIN WEBSITE</strong></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td valign=\"top\" >© Công ty Cổ phần Thương mại Nguyễn Kim.<br>\n");
      out.write("                        Địa chỉ: 63-65-67 Trần Hưng Đạo, Q1, TP.HCM.<br>\n");
      out.write("                        Điện thoại: (84-8) 38 211 211 - Fax: (84-8) 38 210 818.<br>\n");
      out.write("                        Email: <a href=\"mailto:info@trade.nguyenkim.com\">info@trade.nguyenkim.com</a><br>\n");
      out.write("                        Copyright © 2003-2010 Nguyễn Kim JSC. </td>\n");
      out.write("                    <!--td align=\"center\" valign=\"middle\"><img src=\"images/line.jpg\" width=\"2\" height=\"76\"></td-->\n");
      out.write("                    <td valign=\"top\" class =\"info\"><ul>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/chinh-sach-th-khach-hang.html\">Chính sách Thẻ Khách Hàng</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/chinh-sach-dung-th.html\">Chính sách dùng thử</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/iu-khon.html\">Điều khoản-Điều Kiện</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/chinh-sach-giao-nhn.html\">Chính sách giao nhận</a></li>\n");
      out.write("                        </ul></td>\n");
      out.write("                    <!--td valign=\"middle\"><img src=\"images/line.jpg\" width=\"1\" height=\"76\"></td-->\n");
      out.write("                    <td valign=\"top\" class =\"info\"><ul>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/bo-mt-thong-tin.html\">Quy định bảo mật</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/quy-nh-t-hang.html\">Quy định đặt hàng </a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/quy-nh-thanh-toan.html\">Quy định thanh toán</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/quy-nh-i-tr-sn-phm.html\">Quy định đổi, trả sản phẩm</a></li>\n");
      out.write("                        </ul></td>\n");
      out.write("                    <!--td valign=\"middle\"><img src=\"images/line.jpg\" width=\"1\" height=\"76\"></td-->\n");
      out.write("                    <td valign=\"top\" class =\"info\"><ul>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/h-thng-trung-tam.html\">Hệ thống trung tâm</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/gii-thiu-cong-ty.html\">Giới thiệu công ty</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/cam-kt-ca-nguyn-kim.html\">Tiêu chí bán hàng</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/tuyn-dng-vn.html\">Cơ hội việc làm</a></li>\n");
      out.write("                        </ul></td>\n");
      out.write("                    <!--td valign=\"middle\"><img src=\"images/line.jpg\" width=\"1\" height=\"76\"></td-->\n");
      out.write("                    <td valign=\"top\" class =\"info\"><ul>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/index.php?dispatch=sitemap.view\">Sơ đồ website</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/i-tac-chin-lc.html\">Đối tác chiến lược</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/hi-ap-t-vn.html\">Hỏi đáp, Tư vấn</a></li>\n");
      out.write("                            <li><a href=\"http://www.nguyenkim.com/lien-h-qung-cao.html\">Hợp tác, trao đổi </a></li>\n");
      out.write("                        </ul></td>\n");
      out.write("                </tr>\n");
      out.write("            </table></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><img src=\"images/partner.jpg\" width=\"987\" height=\"26\" border=\"0\" usemap=\"#Map2\"></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><img src=\"images/last-bottom.png\" width=\"989\" height=\"15\"></td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("\n");
      out.write("<map name=\"Map\">\n");
      out.write("    <area shape=\"rect\" coords=\"201,7,293,31\" href=\"customerCare.jsp\" target=\"_blank\" alt=\"customer care\">\n");
      out.write("    <area shape=\"rect\" coords=\"306,6,387,33\" href=\"warranty.html\" target=\"_blank\" alt=\"product care\">\n");
      out.write("    <area shape=\"rect\" coords=\"403,6,490,31\" href=\"#\" target=\"_blank\">\n");
      out.write("    <area shape=\"rect\" coords=\"506,9,590,35\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"598,6,665,34\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"674,7,755,34\" href=\"#\">\n");
      out.write("</map>\n");
      out.write("\n");
      out.write("<map name=\"Map2\">\n");
      out.write("    <area shape=\"rect\" coords=\"5,3,119,28\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"121,4,190,29\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"195,5,280,29\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"284,2,333,30\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"338,4,410,32\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"414,3,499,48\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"498,1,541,41\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"545,3,583,44\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"586,4,670,43\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"672,3,733,21\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"734,0,798,20\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"800,1,902,20\" href=\"#\">\n");
      out.write("    <area shape=\"rect\" coords=\"902,-1,975,21\" href=\"#\">\n");
      out.write("</map>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
