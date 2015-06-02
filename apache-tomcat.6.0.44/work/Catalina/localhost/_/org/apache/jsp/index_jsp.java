package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy");
request.setAttribute("year", sdf.format(new java.util.Date()));
request.setAttribute("tomcatUrl", "http://tomcat.apache.org/");
request.setAttribute("tomcatDocUrl", "/docs/");
request.setAttribute("tomcatExamplesUrl", "/examples/");

      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>");
      out.print(request.getServletContext().getServerInfo() );
      out.write("</title>\n");
      out.write("        <link href=\"favicon.ico\" rel=\"icon\" type=\"image/x-icon\" />\n");
      out.write("        <link href=\"favicon.ico\" rel=\"shortcut icon\" type=\"image/x-icon\" />\n");
      out.write("        <link href=\"tomcat.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <div id=\"navigation\" class=\"curved container\">\n");
      out.write("                <span id=\"nav-home\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Home</a></span>\n");
      out.write("                <span id=\"nav-hosts\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Documentation</a></span>\n");
      out.write("                <span id=\"nav-config\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("config/\">Configuration</a></span>\n");
      out.write("                <span id=\"nav-examples\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatExamplesUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Examples</a></span>\n");
      out.write("                <span id=\"nav-wiki\"><a href=\"http://wiki.apache.org/tomcat/FrontPage\">Wiki</a></span>\n");
      out.write("                <span id=\"nav-lists\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("lists.html\">Mailing Lists</a></span>\n");
      out.write("                <span id=\"nav-help\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("findhelp.html\">Find Help</a></span>\n");
      out.write("                <br class=\"separator\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"asf-box\">\n");
      out.write("                <h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.serverInfo}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</h1>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"upper\" class=\"curved container\">\n");
      out.write("                <div id=\"congrats\" class=\"curved container\">\n");
      out.write("                    <h2>Shifra changed this again</h2>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"notice\">\n");
      out.write("                    <img src=\"tomcat.png\" alt=\"[tomcat logo]\" />\n");
      out.write("                    <div id=\"tasks\">\n");
      out.write("                        <h3>Recommended Reading:</h3>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("security-howto.html\">Security Considerations HOW-TO</a></h4>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("manager-howto.html\">Manager Application HOW-TO</a></h4>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("cluster-howto.html\">Clustering/Session Replication HOW-TO</a></h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"actions\">\n");
      out.write("                    <div class=\"button\">\n");
      out.write("                        <a class=\"container shadow\" href=\"/manager/status\"><span>Server Status</span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button\">\n");
      out.write("                        <a class=\"container shadow\" href=\"/manager/html\"><span>Manager App</span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"button\">\n");
      out.write("                        <a class=\"container shadow\" href=\"/host-manager/html\"><span>Host Manager</span></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!--\n");
      out.write("                <br class=\"separator\" />\n");
      out.write("                -->\n");
      out.write("                <br class=\"separator\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"middle\" class=\"curved container\">\n");
      out.write("                <h3>Developer Quick Start</h3>\n");
      out.write("                <div class=\"col25\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("setup.html\">Tomcat Setup</a></p>\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("appdev/\">First Web Application</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col25\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("realm-howto.html\">Realms &amp; AAA</a></p>\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("jndi-datasource-examples-howto.html\">JDBC DataSources</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col25\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <p><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatExamplesUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Examples</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col25\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <p><a href=\"http://wiki.apache.org/tomcat/Specifications\">Servlet Specifications</a></p>\n");
      out.write("                        <p><a href=\"http://wiki.apache.org/tomcat/TomcatVersions\">Tomcat Versions</a></p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"separator\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"lower\">\n");
      out.write("                <div id=\"low-manage\" class=\"\">\n");
      out.write("                    <div class=\"curved container\">\n");
      out.write("                        <h3>Managing Tomcat</h3>\n");
      out.write("                        <p>For security, access to the <a href=\"/manager/html\">manager webapp</a> is restricted.\n");
      out.write("                        Users are defined in:</p>\n");
      out.write("                        <pre>$CATALINA_HOME/conf/tomcat-users.xml</pre>\n");
      out.write("                        <p>In Tomcat 7.0 access to the manager application is split between\n");
      out.write("                           different users. &nbsp; <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("manager-howto.html\">Read more...</a></p>\n");
      out.write("                        <br />\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("RELEASE-NOTES.txt\">Release Notes</a></h4>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("changelog.html\">Changelog</a></h4>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("migration.html\">Migration Guide</a></h4>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("security.html\">Security Notices</a></h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"low-docs\" class=\"\">\n");
      out.write("                    <div class=\"curved container\">\n");
      out.write("                        <h3>Documentation</h3>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Tomcat 7.0 Documentation</a></h4>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("config/\">Tomcat 7.0 Configuration</a></h4>\n");
      out.write("                        <h4><a href=\"http://wiki.apache.org/tomcat/FrontPage\">Tomcat Wiki</a></h4>\n");
      out.write("                        <p>Find additional important configuration information in:</p>\n");
      out.write("                        <pre>$CATALINA_HOME/RUNNING.txt</pre>\n");
      out.write("                        <p>Developers may be interested in:</p>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"http://tomcat.apache.org/bugreport.html\">Tomcat 7.0 Bug Database</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("api/index.html\">Tomcat 7.0 JavaDocs</a></li>\n");
      out.write("                            <li><a href=\"http://svn.apache.org/repos/asf/tomcat/tc7.0.x/\">Tomcat 7.0 SVN Repository</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"low-help\" class=\"\">\n");
      out.write("                    <div class=\"curved container\">\n");
      out.write("                        <h3>Getting Help</h3>\n");
      out.write("                        <h4><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("faq/\">FAQ</a> and <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("lists.html\">Mailing Lists</a></h4>\n");
      out.write("                        <p>The following mailing lists are available:</p>\n");
      out.write("                        <ul>\n");
      out.write("                            <li id=\"list-announce\"><strong><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("lists.html#tomcat-announce\">tomcat-announce</a><br />\n");
      out.write("                                Important announcements, releases, security vulnerability notifications. (Low volume).</strong>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("lists.html#tomcat-users\">tomcat-users</a><br />\n");
      out.write("                                User support and discussion\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("lists.html#taglibs-user\">taglibs-user</a><br />\n");
      out.write("                                User support and discussion for <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("taglibs/\">Apache Taglibs</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("lists.html#tomcat-dev\">tomcat-dev</a><br />\n");
      out.write("                                Development mailing list, including commit messages\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"separator\" />\n");
      out.write("            </div>\n");
      out.write("            <div id=\"footer\" class=\"curved container\">\n");
      out.write("                <div class=\"col20\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h4>Other Downloads</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("download-connectors.cgi\">Tomcat Connectors</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("download-native.cgi\">Tomcat Native</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("taglibs/\">Taglibs</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("deployer-howto.html\">Deployer</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col20\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h4>Other Documentation</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("connectors-doc/\">Tomcat Connectors</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("connectors-doc/\">mod_jk Documentation</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("native-doc/\">Tomcat Native</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatDocUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("deployer-howto.html\">Deployer</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col20\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h4>Get Involved</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("getinvolved.html\">Overview</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("svn.html\">SVN Repositories</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("lists.html\">Mailing Lists</a></li>\n");
      out.write("                            <li><a href=\"http://wiki.apache.org/tomcat/FrontPage\">Wiki</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col20\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h4>Miscellaneous</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("contact.html\">Contact</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("legal.html\">Legal</a></li>\n");
      out.write("                            <li><a href=\"http://www.apache.org/foundation/sponsorship.html\">Sponsorship</a></li>\n");
      out.write("                            <li><a href=\"http://www.apache.org/foundation/thanks.html\">Thanks</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col20\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <h4>Apache Software Foundation</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("whoweare.html\">Who We Are</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("heritage.html\">Heritage</a></li>\n");
      out.write("                            <li><a href=\"http://www.apache.org\">Apache Home</a></li>\n");
      out.write("                            <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tomcatUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("resources.html\">Resources</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <br class=\"separator\" />\n");
      out.write("            </div>\n");
      out.write("            <p class=\"copyright\">Copyright &copy;1999-");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${year}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" Apache Software Foundation.  All Rights Reserved</p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
