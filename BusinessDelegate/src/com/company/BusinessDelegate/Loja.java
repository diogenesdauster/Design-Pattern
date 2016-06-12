package com.company.BusinessDelegate;

/**
 * Created by Dauster on 09/06/16.
 */
public class Loja {
    private PDVBusinessDelegate delegate;

    public Loja(PDVBusinessDelegate delegate) {
        this.delegate = delegate;
    }

    public void emitirNF(){
        delegate.emitirNF();
    }

}
