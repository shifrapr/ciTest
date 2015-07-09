package org.shifra.core.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author spridera
 */
public class Loader {

    public Loader() {
    }


    public int load() throws IOException, SolrServerException {

        String solrUrl = "http://localhost:30080/solr_example";
        String core = "core0";
        SolrServer server = new HttpSolrServer(solrUrl + "/" + core);

        SolrInputDocument doc1 = new SolrInputDocument();
            doc1.addField( "id", "id1", 1.0f );
            doc1.addField( "name", "doc1", 1.0f );
            doc1.addField( "foob", "blahbar" );
        Collection<SolrInputDocument> docs = new ArrayList<SolrInputDocument>();
         docs.add(doc1);
server.add(docs);
        server.commit();

        SolrQuery query = new SolrQuery();
            query.setQuery( "*:*" );
            query.addSortField( "name", SolrQuery.ORDER.asc );
        QueryResponse rsp = server.query( query );
        SolrDocumentList returnDocs = rsp.getResults();
        return returnDocs.size();
    }
}
