/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-06 11:54:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   <link rel=\"icon shortcut bookmark\" type=\"image/png\" href=\"/favicon.ico\">\r\n");
      out.write("   <title>订单成功页面 - 京淘商城</title>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/jquery-1.2.6.min.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/base-2011.js\" charset=\"utf-8\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/jquery.cookie.js\" charset=\"utf-8\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/jt.js\" charset=\"utf-8\"></script>\r\n");
      out.write("   <!-- 为支付添加 -->\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/lib/base.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/lib/avalon.min.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/lib/lodash.min.js\"></script>\r\n");
      out.write("   <script type=\"text/javascript\" src=\"/js/lib/common.js\"></script>\r\n");
      out.write("</head> <body id=\"mainframe\">\r\n");
      out.write("<!--shortcut start-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../commons/shortcut.jsp", out, false);
      out.write("<!--shortcut end-->\r\n");
      out.write("<div class=\"w\" id=\"headers\">\r\n");
      out.write("\t\t<div id=\"logo\"><a href=\"www.jt.com/index.html\"><img alt=\"京淘商城\" src=\"/images/jt-logo.png\"></a></div>\r\n");
      out.write("\t\t<ul class=\"step\" id=\"step3\">\r\n");
      out.write("\t\t\t<li class=\"fore1\">1.我的购物车<b></b></li>\r\n");
      out.write("\t\t\t<li class=\"fore2\">2.填写核对订单信息<b></b></li>\r\n");
      out.write("\t\t\t<li class=\"fore3\">3.成功提交订单</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<div class=\"clr\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"w\" id=\"safeinfo\"></div><!--父订单的ID-->\r\n");
      out.write("<div class=\"w main\">\r\n");
      out.write("\t<div class=\"m m3 msop\">\r\n");
      out.write("        <div class=\"mt\" id=\"success_tittle\"><s class=\"icon-succ02\"></s><h3 class=\"ftx-02\">感谢您，订单提交成功！</h3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"mc\" id=\"success_detail\">\t\r\n");
      out.write("\t\t    <ul class=\"list-order\">\r\n");
      out.write("\t\t\t    <li class=\"li-st\">\r\n");
      out.write("\t\t\t\t\t<div class=\"fore1\">订单号：<a href=\"javascript:void(0)\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</a></div>\r\n");
      out.write("\t\t\t\t\t<!-- 货到付款 -->\r\n");
      out.write("\t\t\t\t\t<div class=\"fore2\">应付款：<strong class=\"ftx-01\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.payment}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("元</strong></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"fore3\">\r\n");
      out.write("\t\t\t\t\t   \t京淘快递 &nbsp; 送货所需时间: 预计次日达&nbsp;\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t<!-- 在线支付按钮  -->\r\n");
      out.write("\t\t\t\t<div id=\"bookDiv\"></div>\r\n");
      out.write(" \t\t\t\t\t<p class=\"i-tips01\">\r\n");
      out.write("\t\t\t\t            \t您的订单已经在处理中，请及时支付订单，如有疑问欢迎咨询\r\n");
      out.write("             \t\t</p>\r\n");
      out.write("\t\t </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"payment payment-new mt25\" id=\"payMallPlatVm\">\r\n");
      out.write("\t\t    <div class=\"payment-change\">\r\n");
      out.write("\t\t        <div class=\"pc-wrap clearfix\" :effect=\"{is:'animate', action:'enter'}\">\r\n");
      out.write("\t\t            <div class=\"pc-w-left\" ms-for=\"($index, el) in @agencyChannelList\">\r\n");
      out.write("\t\t                <div class=\"pay-wrap\">\r\n");
      out.write("\t\t\t                <a href=\"http://www.jt.com/order/pay-zfb/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(".html\" ms-if=\"@el.channelId =='weixin' && @el.canUse\" :click=\"@weixinConfirm($index)\" style=\"cursor:pointer\" psa=\"PCashier_wxzf\">\r\n");
      out.write("\t\t\t                    <i class=\"wechat-pay icon\"><img src=\"/images/PAY-ZFB.png\" ></i> 支付宝支付\r\n");
      out.write("\t\t\t                </a>\r\n");
      out.write("\t\t\t                <span ms-if=\"$index !== 0\">|</span>\r\n");
      out.write("\t\t\t                <a href=\"http://www.jt.com/order/pay-union/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${order.orderId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(".html\" ms-if=\"@el.channelId =='unionpay' && @el.canUse\" :click=\"@platConfirm($index)\" style=\"cursor:pointer\" psa=\"PCashier_zgyl\">\r\n");
      out.write("\t\t\t                    <i class=\"visa-pay icon\"><img src=\"/images/PAY-UNION.png\"></i>\r\n");
      out.write("\t\t\t                   \t 银联支付\r\n");
      out.write("\t\t\t                    <i class=\"item-tips-content\" ms-if=\"@el.marketingInfo\" ms-text=\"{{@el.marketingInfo}}\"></i>\r\n");
      out.write("\t\t\t                </a>\r\n");
      out.write("\t\t            \t</div>\r\n");
      out.write("\t\t            </div>\r\n");
      out.write("\t\t        </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
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
