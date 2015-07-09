make sure Java is on the path (1.6 is best because Tomcat 6 uses)




ANT if needed:

https://ant.apache.org/bindownload.cgi
good idea to set ANT_HOME, edit in .profile

then can

    ant dist

which puts everything into place within Tomcat.
(just ant build doesn't put classes in place)

bounce tomcat when adding new classes.

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

JSTL: http://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm
http://docs.oracle.com/javaee/5/tutorial/doc/bnakh.html



solr:

~/Documents/code/solr/solr-4.7.2/, using core0 so far
can add more instances /Users/spridera/Documents/code/travisCiFromGithub/ciTest/apache-tomcat.6.0.44/conf/Catalina/localhost/
copy solr_example.

solrconfig.xml is located within the core directory, e.g. core0, core1, in conf/

when you start up can go to admin at

http://localhost:30080/solr_example
(or whatever the name of the solr instance is)

schema is in /Users/spridera/Documents/code/solr/solr-4.7.2/example/multicore/core0/conf/schema.xml
https://wiki.apache.org/solr/SchemaXml
dynamic:
For example the following dynamic field declaration tells Solr that whenever it sees a field name ending in "_i" which is not an explicitly defined field, then it should dynamically create an integer field with that name...
    <dynamicField name="*_i"  type="integer"  indexed="true"  stored="true"/>

can query the core (in example there are two of them) with http://localhost:30080/solr_example/core0/select?

Query syntax: http://wiki.apache.org/solr/SolrQuerySyntax

Curl:
query what was loaded:

curl http://localhost:30080/solr_example/core0/select?q=name:doc1

curl http://localhost:30080/solr_example/core0/select?q=name:doc1&id=id1

http://www.alphadevx.com/a/374-Running-Solr-queries-and-updates-via-curl
could post CSV using curl http://wiki.apache.org/solr/UpdateCSV

SolrJ to read the data:
http://wiki.apache.org/solr/Solrj#Reading_Data_from_Solr

Tomcat Solr info at http://wiki.apache.org/solr/SolrTomcat
JSON info at https://wiki.apache.org/solr/UpdateJSON
