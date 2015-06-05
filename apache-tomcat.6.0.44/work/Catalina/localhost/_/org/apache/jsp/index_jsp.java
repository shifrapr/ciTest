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
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/style.css\" />\n");
      out.write("  </head>\n");
      out.write("<body>\n");
      out.write("<h1>hola.</h1>\n");
      out.write("\n");
      out.write("This is a snippet of something raw included from a servlet:\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/servlet/org.shifra.core.servlets.JsonSnippetServlet", out, true);
      out.write("\n");
      out.write("\n");
      out.write("More about servlet/jsp interaction at<br>\n");
      out.write("http://docs.oracle.com/cd/A87860_01/doc/java.817/a83726/basics4.htm#1013818<br />\n");
      out.write("\n");
      out.write("<h2>here is a table with alternating colored rows</h2>\n");
      out.write("  <table class=\"colorTable\">\n");
      out.write("    <tr>\n");
      out.write("      <td>\n");
      out.write("      First row\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("      <td>\n");
      out.write("       Second row\n");
      out.write("      </td>\n");
      out.write("    <tr>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("</body>\n");
      out.write("</html>");
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
