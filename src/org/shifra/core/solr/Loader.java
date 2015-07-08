package org.shifra.core.solr;

import java.io.File;

/**
 * @author spridera
 */
public class Loader {

    public Loader() {
    }


    public int load() {
                //not getting this passed successfully from ant
//        String localhostDir = System.getProperty("tomcat.conf.localhost.dir");
        String localhostDir = "conf/Catalina/localhost";
        return new File(localhostDir).list().length;
    }
}
