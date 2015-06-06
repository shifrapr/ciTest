package org.shifra.core.servlets;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        HttpSession session = request.getSession(false);

        //wouldn't really need to pass a map like this, but this is how to send arbitrary beans and stuff
        Map stuffInSession = new HashMap<String, String>();
        String valueFromSession = (String) session.getAttribute("arbitraryPassedThing");
        stuffInSession.put("passedBackInStuffOne", lineOne + valueFromSession);
        stuffInSession.put("passedBackInStuffTwo", lineTwo + valueFromSession);

        request.setAttribute("passedBackOne", lineOne + valueFromSession);
        request.setAttribute("passedBackTwo", lineTwo + valueFromSession);

        //this makes avail to the page BUT doesn't seem to work in JSTL, only when output single thing
        request.setAttribute("reqStuff", stuffInSession);

        //use SESSION --
        //this makes avail to all subsequent pages AND JSTL
        session.setAttribute("sesStuff", stuffInSession);

        //if you wanted to print stuff out here before redirect, it's primitive but you could
        response.setContentType("text/html");
                PrintWriter out = response.getWriter();
//        out.println("I found stuff: " + lineOne + lineTwo);
//        out.println("<br>I see session: " + valueFromSession);

        this.getServletContext().getRequestDispatcher("/post.jsp").
                //returns control to the servlet
//                include(request, response);
//        control goes back to the jsp
                forward(request, response);
    }
}

