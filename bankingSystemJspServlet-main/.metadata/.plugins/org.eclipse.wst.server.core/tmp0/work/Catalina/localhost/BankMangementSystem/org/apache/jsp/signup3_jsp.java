/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-04-11 07:01:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup3_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Account Details</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/signup3.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>Account Details</h1>\r\n");
      out.write("    <form action=\"Signup3Servlet\" method=\"post\">\r\n");
      out.write("        <label for=\"accountType\">Account Type:</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"radio\" id=\"savingAccount\" name=\"accountType\" value=\"Saving Account\">\r\n");
      out.write("        <label for=\"savingAccount\">Saving Account</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"radio\" id=\"fixedDepositAccount\" name=\"accountType\" value=\"Fixed Deposit Account\">\r\n");
      out.write("        <label for=\"fixedDepositAccount\">Fixed Deposit Account</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"radio\" id=\"currentAccount\" name=\"accountType\" value=\"Current Account\">\r\n");
      out.write("        <label for=\"currentAccount\">Current Account</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"radio\" id=\"recurringDepositAccount\" name=\"accountType\" value=\"Recurring Deposit Account\">\r\n");
      out.write("        <label for=\"recurringDepositAccount\">Recurring Deposit Account</label>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        \r\n");
      out.write("        <label for=\"cardNumber\">Card Number : <span class='span'>(It would appear on atm card/cheque Book and Statements)</span></label>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <label>1409-96XX-XXXX-XXXX</label>\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"pin\">PIN : <span class='span'>(4-digit Password)</span></label>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <label>XXXX</label>\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <label for=\"servicesRequired\">Services Required:</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"checkbox\" id=\"atmCard\" name=\"atmCard\" value=\"ATM CARD\">\r\n");
      out.write("        <label for=\"atmCard\">ATM CARD</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"checkbox\" id=\"internetBanking\" name=\"internetBanking\" value=\"Internet Banking\">\r\n");
      out.write("        <label for=\"internetBanking\">Internet Banking</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"checkbox\" id=\"mobileBanking\" name=\"mobileBanking\" value=\"Mobile Banking\">\r\n");
      out.write("        <label for=\"mobileBanking\">Mobile Banking</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"checkbox\" id=\"emailAlerts\" name=\"emailAlerts\" value=\"EMAIL Alerts\">\r\n");
      out.write("        <label for=\"emailAlerts\">EMAIL Alerts</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"checkbox\" id=\"chequeBook\" name=\"chequeBook\" value=\"Cheque Book\">\r\n");
      out.write("        <label for=\"chequeBook\">Cheque Book</label>\r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"checkbox\" id=\"eStatement\" name=\"eStatement\" value=\"E-Statement\">\r\n");
      out.write("        <label for=\"eStatement\">E-Statement</label>\r\n");
      out.write("        <br><br>\r\n");
      out.write("        <input type=\"checkbox\" id=\"declaration\" name=\"declaration\" checked>\r\n");
      out.write("<label for=\"declaration\">I hereby declare that the above entered details are correct to the best of my knowledge.</label>\r\n");
      out.write("<br><br>\r\n");
      out.write("        <input type=\"submit\" value=\"Submit\">\r\n");
      out.write("        <input type=\"reset\" value=\"Cancel\">\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}