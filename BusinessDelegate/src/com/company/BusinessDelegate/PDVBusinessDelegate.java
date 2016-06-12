package com.company.BusinessDelegate;

/**
 * Created by Dauster on 09/06/16.
 */
public class PDVBusinessDelegate {
    PDVBusinessFactory factory = new PDVBusinessFactory();
    PDVBusinessService service;
    String tipoNF;

    public void setTipoNF(String tipoNF) {
        this.tipoNF = tipoNF;
    }

    public void emitirNF(){
        service = factory.getTipoNF(this.tipoNF);
        service.faturar();
    }

}
