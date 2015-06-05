make sure Java is on the path (1.6 is best because Tomcat 6 uses)




ANT if needed:

https://ant.apache.org/bindownload.cgi
good idea to set ANT_HOME, edit in .profile

then can

    ant build

which puts everything into place within Tomcat.


TOMCAT:

after build, jsps will be at path like

http://localhost:30080/index.jsp

servlets in the servlet class will be at path like

http://localhost:30080/servlet/org.shifra.core.servlets.SimpleServlet

Tomcat installation info: http://tomcat.apache.org/tomcat-6.0-doc/index.html
I stayed with v6 because of the Invoker servlet in conf/web.xml which allows hot reload of servlets

 JAVA_HOME should be set, see .profile in this dir
Running:
http://tomcat.apache.org/tomcat-6.0-doc/RUNNING.txt
Set CATALINA_HOME (required) =
root directory of the "binary" distribution of Tomcat (this dir/apache-tomcat dir) -- edit in .profile

set CATALINA_BASE (optional) = root
directory of the "active configuration" of Tomcat. It is optional. It
defaults to be equal to CATALINA_HOME.

To start Tomcat:
  On *nix:

      $CATALINA_HOME/bin/startup.sh

After starting up the default port set in conf/server.xml

      http://localhost:30080/ will point to webapps/ROOT/index.html

To stop:
    shutdown.sh

JSP:
to include:
<jsp:include page="/servlet/org.shifra.core.servlets.JsonSnippetServlet" flush="true" />

More about servlet/jsp interaction at
http://docs.oracle.com/cd/A87860_01/doc/java.817/a83726/basics4.htm#1013818
