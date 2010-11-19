<%-- 
    Document   : index
    Created on : Nov 18, 2010, 10:10:16 AM
    Author     : tannguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/style.css" rel="stylesheet" type="text/css"/>
        <title>0842132_0842109</title>
    </head>
    <body>
        <div id="wrapper">
        <!--/////////////////////////////////////////////////////////////////////////////////////////////-->
            <div id="header">
                <jsp:include page="pages/header.jsp"/>
            </div><!-- End Header -->

         <!--/////////////////////////////////////////////////////////////////////////////////////////////-->

            <div id="content"> <!-- Phần nội dung của trang web -->
                    <div id="content_header"><!-- chứa flash quảng cáo -->
                </div>

                <div id="left_content"><!-- hiển thị catelory và quảng cáo -->
                </div>

                <div id="central_column"><!-- đặt code trong tag này -->
<!-- Code trong phần này -->

<jsp:include page="pages/commodityType.jsp"/>



<!-- Phần kết thúc code -->
                </div>

            </div> <!-- End content -->

         <!--/////////////////////////////////////////////////////////////////////////////////////////////-->

         <div id="footer"> <!-- phần footer -->
             <jsp:include page = "pages/footer.jsp"/>
         </div>
    </div>
    </body>
</html>
