package com.itesoft.ml;

/**
 * Created by jfi on 18/05/2015.
 */
public interface Visitable {

    void accept(Visitor visitor) throws ApplicationException;
}
