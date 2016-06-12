package com.company.BusinessDelegate;

/**
 * Created by Dauster on 09/06/16.
 */
public class DANFE implements PDVBusinessService {
    @Override
    public void faturar() {
        System.out.println("Faturando Documento Auxiliar da Nota Fiscal Eletrônica (DANFE)");
    }
}
