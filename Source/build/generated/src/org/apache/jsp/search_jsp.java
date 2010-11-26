package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Models.POJOs.ManufacturerPOJO;
import Contollers.Modes.ActionMode;
import Models.POJOs.CommodityTypePOJO;
import java.util.ArrayList;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("\r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"CSS/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"CSS/headerStyle.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"CSS/footerStyle.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        <title>0842132_0842109</title>\r\n");
      out.write("    \t<style type=\"text/css\">\r\n");
      out.write("\t\t.auto-style1 {\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t\tfont-size: large;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style2 {\r\n");
      out.write("\t\t\tmargin-left: 40px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style7 {\r\n");
      out.write("\t\t\tmargin-left: 240px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style8 {\r\n");
      out.write("\t\t\tborder-left-style: none;\r\n");
      out.write("\t\t\tborder-left-width: medium;\r\n");
      out.write("\t\t\tborder-top-style: none;\r\n");
      out.write("\t\t\tborder-top-width: medium;\r\n");
      out.write("\t\t\tborder-bottom-style: none;\r\n");
      out.write("\t\t\tborder-bottom-width: medium;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style9 {\r\n");
      out.write("\t\t\tmargin-left: 240px;\r\n");
      out.write("\t\t\tborder-right-style: none;\r\n");
      out.write("\t\t\tborder-right-width: medium;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style10 {\r\n");
      out.write("\t\t\tborder-right-style: none;\r\n");
      out.write("\t\t\tborder-right-width: medium;\r\n");
      out.write("\t\t\tborder-top-style: none;\r\n");
      out.write("\t\t\tborder-top-width: medium;\r\n");
      out.write("\t\t\tborder-bottom-style: none;\r\n");
      out.write("\t\t\tborder-bottom-width: medium;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style11 {\r\n");
      out.write("\t\t\tborder-right-width: 0px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style12 {\r\n");
      out.write("\t\t\tborder-top-style: none;\r\n");
      out.write("\t\t\tborder-top-width: medium;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.auto-style13 {\r\n");
      out.write("\t\t\tborder-bottom-style: none;\r\n");
      out.write("\t\t\tborder-bottom-width: medium;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\r\n");
      out.write("            <div id=\"header\">\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "pages/header.jsp", out, false);
      out.write("\r\n");
      out.write("            </div><!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\r\n");
      out.write("\r\n");
      out.write("            <div id=\"content\"> <!-- Phần nội dung của trang web -->\r\n");
      out.write("                <div id=\"content_header\"><!-- chứa flash quảng cáo -->\r\n");
      out.write("                    <img src=\"images/nganluongtop.gif\" alt=\"He thong thanh toan moi\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"mainNav\"><!-- hiển thị catelory và quảng cáo -->\r\n");
      out.write("                    <h3 class=\"sub_title\">DANH MỤC</h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><span><a href=\"index.jsp\">Trang chủ</a></span></li>\r\n");
      out.write("                        ");

                                    obj = request.getAttribute("commodityType");
                                    ArrayList<CommodityTypePOJO> list = (ArrayList<CommodityTypePOJO>) obj;
                                    obj1 = request.getAttribute("manufacturer");
                                    ArrayList<ManufacturerPOJO> mList = (ArrayList<ManufacturerPOJO>) obj1;
                                    for (CommodityTypePOJO ct : list) {
                        
      out.write("\r\n");
      out.write("                        <li> <span><a href=\"viewProduct.jsp?ctId=");
      out.print( ct.getCommodityTypeId() );
      out.write('"');
      out.write('>');
      out.print(ct);
      out.write("</a></span>\r\n");
      out.write("                            <ul>\r\n");
      out.write("                                ");

                                                                        for (ManufacturerPOJO m : mList) {
                                
      out.write("\r\n");
      out.write("                                <li> <span><a href=\"viewProduct.jsp?ctId=");
      out.print( ct.getCommodityTypeId() );
      out.write(" &mId=");
      out.print( m.getManufacturerId() );
      out.write('"');
      out.write('>');
      out.print(m);
      out.write("</a></span></li>\r\n");
      out.write("                                ");

                                                                        }

                                
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        ");

                                    }
                        
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                    <img src=\"images/banner_20-11_dai.jpg\" alt=\"Advisting\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div id=\"mainContent\"><!-- đặt code trong tag này -->\r\n");
      out.write("                    <!-- Code trong phần này -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!-- Phần kết thúc code -->\r\n");
      out.write("                \t<table cellpadding=\"10\" style=\"width: 100%\" class=\"auto-style11\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr bgcolor=\"#808080\">\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"auto-style1\" style=\"width: 208px\">\r\n");
      out.write("\t\t\t\t\t\t\t<strong>Tìm kiếm sản phẩm</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\"><strong>Tùy chọn</strong></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"auto-style2\">Tìm theo kết quả</p>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\" class=\"auto-style13\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"Select1\" style=\"width: 188px\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>Có ít nhất các từ</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Tất cả các từ</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Cụm từ chính xác</option>\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"auto-style13\"><input name=\"Text1\" type=\"text\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"auto-style9\" style=\"width: 190px\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"auto-style2\">Tìm theo</p>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\" class=\"auto-style8\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"Checkbox1\" type=\"checkbox\">Tên sản phẩm\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"Checkbox2\" type=\"checkbox\">Mô tả</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"auto-style10\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"auto-style7\" style=\"width: 190px\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"auto-style2\">Danh mục hàng hóa</p>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\" class=\"auto-style12\">\r\n");
      out.write("\t\t\t\t\t\t\t<select name=\"Select2\" style=\"width: 183px\">\r\n");
      out.write("\t\t\t\t\t\t\t<option>Tất cả các danh mục</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Máy ép trái cay</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Máy say sinh tố</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option>Máy hút bụi</option>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td class=\"auto-style12\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\"><strong>Tùy chọn tìm kiếm \r\n");
      out.write("\t\t\t\t\t\t\tnâng ca</strong>o</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"auto-style2\">Mã sản phẩm</p>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"Text2\" type=\"text\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"auto-style2\">Giá từ</p>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"Text4\" type=\"text\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"Text5\" type=\"text\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"auto-style2\">Trọng lượng từ</p>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">\r\n");
      out.write("\t\t\t\t\t\t\t<input name=\"Text3\" type=\"text\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input name=\"Text6\" type=\"text\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 190px\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td style=\"width: 208px\">\r\n");
      out.write("                                                            <a href=\"#\"><img alt=\"\" src=\"images/tim.gif\"></a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div> <!-- End content -->\r\n");
      out.write("\r\n");
      out.write("            <!--/////////////////////////////////////////////////////////////////////////////////////////////-->\r\n");
      out.write("\r\n");
      out.write("            <div id=\"footer\"> <!-- phần footer -->\r\n");
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
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
