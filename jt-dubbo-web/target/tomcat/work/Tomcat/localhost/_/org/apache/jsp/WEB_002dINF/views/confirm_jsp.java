/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-06 11:54:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class confirm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("  <head>\r\n");
      out.write("   <meta http-equiv=\"pragma\" content=\"no-cache\" />\r\n");
      out.write("   <meta http-equiv=\"cache-control\" content=\"no-cache\" />\r\n");
      out.write("   <meta http-equiv=\"expires\" content=\"0\" /> \r\n");
      out.write("   <meta name=\"format-detection\" content=\"telephone=no\" />  \r\n");
      out.write("   <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\" /> \r\n");
      out.write("   <meta name=\"format-detection\" content=\"telephone=no\" />\r\n");
      out.write("   <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\r\n");
      out.write("   <link type=\"text/css\" rel=\"stylesheet\" href=\"/css/base.css\" />\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/purchase.base.2012.css\" />\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/purchase.sop.css\" />\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/main.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/bankList.css\">\r\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"/css/confirm.css\">\r\n");
      out.write("   <link rel=\"icon shortcut bookmark\" type=\"image/png\" href=\"/favicon.ico\">\r\n");
      out.write("   <title>银联支付确认页面 - 京淘商城</title>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/jquery-1.2.6.min.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/base-2011.js\" charset=\"utf-8\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/jquery.cookie.js\" charset=\"utf-8\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/jt.js\" charset=\"utf-8\"></script>\r\n");
      out.write("   <!-- 为支付添加 -->\r\n");
      out.write("  \r\n");
      out.write("</head> <body id=\"mainframe\">\r\n");
      out.write("<!--shortcut start-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../commons/shortcut.jsp", out, false);
      out.write("<!--shortcut end-->\r\n");
      out.write("<div class=\"w\" id=\"headers\">\r\n");
      out.write("\t\t<div id=\"logo\"><a href=\"www.jt.com/index.html\"><img alt=\"京淘商城\" src=\"/images/jt-logo.png\"></a></div>\r\n");
      out.write("\t\t<div class=\"clr\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("\t<div id=\"warp\" class=\"w main\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<h3>\r\n");
      out.write("\t\t\t订单号：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p2_Order}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("<br>\r\n");
      out.write("\t\t\t付款金额 ：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p3_Amt }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\r\n");
      out.write("\t\t<form action=\"https://www.yeepay.com/app-merchant-proxy/node\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"pd_FrpId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pd_FrpId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p0_Cmd\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p0_Cmd }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p1_MerId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p1_MerId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p2_Order\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p2_Order }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p3_Amt\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p3_Amt }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p4_Cur\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p4_Cur }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p5_Pid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p5_Pid }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p6_Pcat\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p6_Pcat }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p7_Pdesc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p7_Pdesc }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p8_Url\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p8_Url }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"p9_SAF\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p9_SAF }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"pa_MP\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pa_MP }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"pr_NeedResponse\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pr_NeedResponse }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"hmac\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hmac }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<input type=\"submit\" value=\"确认支付\" />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
      out.write("  <div class=\"w\">\r\n");
      out.write("\t<!-- links start -->\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../commons/footer-links.jsp", out, false);
      out.write("<!-- links end -->\r\n");
      out.write("</div><!-- footer end -->\r\n");
      out.write("     </body> \r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
