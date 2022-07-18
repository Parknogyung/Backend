/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-15 05:55:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
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

      out.write('\n');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/views/common/header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("	div#board-write-container\n");
      out.write("	{\n");
      out.write("		width:600px;\n");
      out.write("		margin:0 auto;\n");
      out.write("		text-align:center;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	div#board-write-container h2\n");
      out.write("	{\n");
      out.write("		margin:10px 0;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	table#tbl-board\n");
      out.write("	{\n");
      out.write("		width:500px;\n");
      out.write("		margin:0 auto;\n");
      out.write("		border:1px solid black;\n");
      out.write("		border-collapse:collapse;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	table#tbl-board th\n");
      out.write("	{\n");
      out.write("		width:125px;\n");
      out.write("		border:1px solid;\n");
      out.write("		padding:5px 0;\n");
      out.write("		text-align:center;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	table#tbl-board td\n");
      out.write("	{\n");
      out.write("		border:1px solid;\n");
      out.write("		padding:5px 0 5px 10px;\n");
      out.write("		text-align:left;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("<section id=\"content\">\n");
      out.write("	<div id='board-write-container'>\n");
      out.write("		<h2>게시판 작성</h2>\n");
      out.write("		<form action=\"\" method=\"\" enctype=\"\">\n");
      out.write("			<table id='tbl-board'>\n");
      out.write("				<tr>\n");
      out.write("					<th>제목</th>\n");
      out.write("					<td><input type=\"text\" name=\"title\" id=\"title\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th>작성자</th>\n");
      out.write("					<td><input type=\"text\" name=\"writer\" value=\"\" readonly></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th>첨부파일</th>\n");
      out.write("					<td><input type=\"file\" name=\"upfile\"></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th>내용</th>\n");
      out.write("					<td><textarea name=\"content\" cols=\"50\" rows=\"15\" ></textarea></td>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<th colspan=\"2\">\n");
      out.write("						<input type=\"submit\" value=\"등록\">\n");
      out.write("						<input type=\"reset\" value=\"취소\">\n");
      out.write("					</th>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("</section>\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/views/common/footer.jsp", out, false);
      out.write(' ');
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
