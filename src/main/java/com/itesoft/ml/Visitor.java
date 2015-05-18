package com.itesoft.ml;

/**
 * Created by jfi on 18/05/2015.
 */
public interface Visitor {

    void visit(InvoiceFileImporter fileImporter) throws ApplicationException;

    void visit(BatchFileImporter fileImporter) throws ApplicationException;


}
