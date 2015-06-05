<html>
  <head>
    <link rel="stylesheet" type="text/css" href="/style.css" />
  </head>
<body>
<h1>hola, thanks.</h1>

More about servlet/jsp interaction at<br>
http://docs.oracle.com/cd/A87860_01/doc/java.817/a83726/basics4.htm#1013818<br />

<h2>here is a table with alternating colored rows that is now filled in:</h2>

  <table class="colorTable">
    <tr>
      <td>
      First row: <% session.getAttribute("passedBackOne"); %> <% request.getSession().getAttribute("arbitraryPassedThing"); %>
      </td>
    </tr>
      <td>
       Second row: <% session.getAttribute("passedBackTwo"); %>
      </td>
    <tr>
    </tr>
  </table>

Want to <a href="/index.jsp">do it again?</a>
</body>
</html>