package org.shifra.core.servlets;

import org.shifra.core.solr.Loader;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author spridera
 */
public class SolrLoadServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        int numLoaded = new Loader().load();
        response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println(
                        "<H1>Loaded:" +
                        "</H1>\n"
                        + numLoaded);
    }
}
