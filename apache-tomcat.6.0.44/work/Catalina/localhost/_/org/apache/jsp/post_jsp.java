package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class post_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<h1>hola, thanks.</h1>\n");
      out.write("\n");
      out.write("More about servlet/jsp interaction at<br>\n");
      out.write("http://docs.oracle.com/cd/A87860_01/doc/java.817/a83726/basics4.htm#1013818<br />\n");
      out.write("\n");
      out.write("<h2>here is a table with alternating colored rows that is now filled in:</h2>\n");
      out.write("\n");
      out.write("  <table class=\"colorTable\">\n");
      out.write("    <tr>\n");
      out.write("      <td>\n");
      out.write("      First row: ");
 session.getAttribute("passedBackOne"); 
      out.write(' ');
 request.getSession().getAttribute("arbitraryPassedThing"); 
      out.write("\n");
      out.write("      </td>\n");
      out.write("    </tr>\n");
      out.write("      <td>\n");
      out.write("       Second row: ");
 session.getAttribute("passedBackTwo"); 
      out.write("\n");
      out.write("      </td>\n");
      out.write("    <tr>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("Want to <a href=\"/index.jsp\">do it again?</a>\n");
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
