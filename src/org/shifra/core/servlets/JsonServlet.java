package org.shifra.core.servlets;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author spridera
 */
public class JsonServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {

        ObjectMapper mapper = new ObjectMapper()
                //this is actually useful to have turned on, otherwise we get null
//                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                .configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true).
                //may not want this either
                configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        Glossary g = mapper.readValue("{\n" +
//                "    \"glossary\": {\n" +
                "        \"title\": \"example glossary\"\n" +
//                "    }\n" +
                "}", Glossary.class);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String docType =
                "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 " +
                        "Transitional//EN\">\n";
        out.println(docType +
                "<HTML>\n" +
                "<HEAD><TITLE>Hello</TITLE></HEAD>\n" +
                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
                "<H1>" + g.getTitle() +
                "</H1>\n" +
                "</BODY></HTML>");
    }
}

class Glossary {
    private String title;

    public Glossary() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

