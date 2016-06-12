package com.company;

import com.company.BusinessDelegate.Loja;
import com.company.BusinessDelegate.PDVBusinessDelegate;

public class Main {

    public static void main(String[] args) {
        PDVBusinessDelegate businessDelegate = new PDVBusinessDelegate();
        businessDelegate.setTipoNF("DANFE");

        Loja loja = new Loja(businessDelegate);
        loja.emitirNF();

        businessDelegate.setTipoNF("CTE");
        loja.emitirNF();
    }
}
