package org.shifra.core.servlets;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * same as JsonServlet but just the output without html head etc
 * @author spridera
 */
public class FormServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String lineOne = request.getParameter("lineOne");
        String lineTwo = request.getParameter("lineTwo");
        String valueFromSession = (String) request.getSession(false).getAttribute("arbitraryPassedThing");
        request.getSession().setAttribute("passedBackOne", lineOne + valueFromSession);
        request.getSession().setAttribute("passedBackTwo", lineTwo + valueFromSession);
        response.setContentType("text/html");
                PrintWriter out = response.getWriter();
        out.println("I found stuff: " + lineOne + lineTwo);
        out.println("<br>I see session: " + valueFromSession);
        this.getServletContext().getRequestDispatcher("/post.jsp").
                include(request, response);
//                forward(request, response);
    }
}

