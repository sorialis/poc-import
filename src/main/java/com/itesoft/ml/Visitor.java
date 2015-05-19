package com.itesoft.ml;

/**
 * @author jfi
 */
public interface Visitor extends Importer {

    public void visit(FileImporter fileImporter) throws ApplicationException;

    //public void visit(BatchFileImporter fileImporter) throws ApplicationException;





}
