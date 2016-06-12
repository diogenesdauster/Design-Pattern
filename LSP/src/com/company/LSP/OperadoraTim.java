package com.company.LSP;

import java.util.List;

/**
 * Created by Dauster on 08/06/16.
 */
public class OperadoraTim extends Operadora {

    public OperadoraTim(List<Object> chamadas) {
        super(chamadas);
    }

    @Override
    public void discar() {
        System.out.println("Ligue de Tim para Tim sem pagar nada"); // propaganda
        super.discar();
    }
}
