<html>
  <head>
    <link rel="stylesheet" type="text/css" href="/style.css" />
  </head>
<body>
<h1>hola</h1>

This is a snippet of something raw included from a servlet:
<jsp:include page="/servlet/org.shifra.core.servlets.JsonSnippetServlet" flush="true" />

More about servlet/jsp interaction at<br>
http://docs.oracle.com/cd/A87860_01/doc/java.817/a83726/basics4.htm#1013818<br />

    <h2>Fill in two fields and submit:</h4>
    <FORM action = "/servlet/org.shifra.core.servlets.FormServlet" method = "POST">
        first field: <INPUT type="TEXT" name="lineOne"/>
        <BR/>
        second field: <INPUT type="TEXT" name="lineTwo"/>
        <BR/>
        <INPUT type="submit" value="send!"/>
    </FORM>
<%
String somethingToPass = "Arbitrary Passed thing";
session.setAttribute("arbitraryPassedThing", somethingToPass);
%>
<h2>here is a table with alternating colored rows that is not filled in yet</h2>

  <table class="colorTable">
    <tr>
      <td>
      First row: <% session.getAttribute("passedBackOne"); %>
      </td>
    </tr>
      <td>
       Second row: <% session.getAttribute("passedBackTwo"); %>
      </td>
    <tr>
    </tr>
  </table>
</body>
</html>