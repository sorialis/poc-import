package com.itesoft.ml;

/**
 * @author jfi
 */
public class InvoiceFileImporter extends FileImporter{


    @Override
    public void accept(Visitor visitor) throws ApplicationException {
        visitor.visit(this);
    }
}
