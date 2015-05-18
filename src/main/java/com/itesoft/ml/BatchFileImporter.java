package com.itesoft.ml;

/**
 * Created by jfi on 18/05/2015.
 */
public class BatchFileImporter extends FileImporter {

    @Override
    public void accept(Visitor visitor) throws ApplicationException {
        visitor.visit(this);
    }
}
