<%@ page import="java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
  <head>
    <link rel="stylesheet" type="text/css" href="/style.css" />
  </head>
<body>
<h1>hola, thanks.</h1>

More about servlet/jsp interaction at<br>
http://docs.oracle.com/cd/A87860_01/doc/java.817/a83726/basics4.htm#1013818<br />

<h2>here is a table with alternating colored rows that is now filled in:</h2>

<% Map stuff = (Map) request.getAttribute("reqStuff"); %>
<% Map sesStuff = (Map) session.getAttribute("sesStuff"); %>
<%= stuff.get("passedBackInStuffOne") %><br>
<%= sesStuff.get("passedBackInStuffTwo") %><br>

<%= session.getAttribute("arbitraryPassedThing") %>

Static table:
  <table class="colorTable">
    <tr>
      <td>
      First row: <%= request.getAttribute("passedBackOne") %>
      </td>
    </tr>
      <td>
       Second row: <%= request.getAttribute("passedBackTwo") %>
      </td>
    <tr>
    </tr>
  </table>

Table with rows from the servlet:
  <table class="colorTable">
    <tr>
      <td> this one byhand
</td>
  </tr>

  <!-- session scope, do this -->
  <c:set var="stuffMap" value="${sessionScope.sesStuff}"/>
  <c:forEach items="${stuffMap}" var="entry">
    <tr>
      <td>
      Row: ${entry.key} = ${entry.value}
      </td>
    </tr>
  </c:forEach>

  <!-- this is busted, request scope no good, only session scope in JSTL -->
  <!-- request scope no good in JSTL -->
  <c:set var="reqMap" value="${requestScope.stuff}"/>
  <c:forEach items="${reqMap}" var="entry">
    <tr>
      <td>
      Req scope Row: ${entry.key} = ${entry.value}
      </td>
    </tr>
  </c:forEach>
  </table>

Want to <a href="/index.jsp">do it again?</a>
</body>
</html>