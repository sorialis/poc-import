package com.itesoft.ml;

/**
 * Created by sphinx on 18/05/15.
 */
public interface Importer {

     void doParse(FileImporter fileImporter) throws ParseFileException;

    void doValidate(FileImporter fileImporter) throws ValidationException;

    void doCorrect(FileImporter fileImporter) throws CorrectionException;

    void doImport(FileImporter fileImporter) throws ImportException;
}
