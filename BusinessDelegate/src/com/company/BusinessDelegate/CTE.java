package com.company.BusinessDelegate;

/**
 * Created by Dauster on 09/06/16.
 */
public class CTE implements PDVBusinessService {
    @Override
    public void faturar() {
       System.out.println("Faturando Conhecimento de Transporte Eletrônico (CT-E)");
    }
}
