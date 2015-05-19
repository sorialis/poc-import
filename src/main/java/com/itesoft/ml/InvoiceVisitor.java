package com.itesoft.ml;

/**
 * @author jfi
 */
public class InvoiceVisitor implements Visitor {


    @Override
    public void visit(FileImporter invoiceFileImporter) throws ApplicationException {



    }

    @Override
    public void doParse(FileImporter fileImporter) throws ParseFileException {

    }

    @Override
    public void doValidate(FileImporter fileImporter) throws ValidationException {

    }

    @Override
    public void doCorrect(FileImporter fileImporter) throws CorrectionException {

    }

    @Override
    public void doImport(FileImporter fileImporter) throws ImportException {

    }
}
