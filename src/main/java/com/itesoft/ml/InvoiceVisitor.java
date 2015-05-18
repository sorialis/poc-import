package com.itesoft.ml;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by jfi on 18/05/2015.
 */
public class InvoiceVisitor implements Visitor {


    @Override
    public void visit(InvoiceFileImporter invoiceFileImporter) throws ApplicationException {

    }

    @Override
    public void visit(BatchFileImporter fileImporter) throws ApplicationException {
        throw new NotImplementedException();
    }
}
