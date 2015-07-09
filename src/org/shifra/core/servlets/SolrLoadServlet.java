package org.shifra.core.servlets;

import org.apache.solr.client.solrj.SolrServerException;
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

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int numLoaded = 0;
        try {
            numLoaded = new Loader().load();
        } catch (Exception e) {
            out.print("Exception during load: " + e);
        }
                out.println(
                        "<H1>Loaded:" +
                        "</H1>\n"
                        + numLoaded);
    }
}
