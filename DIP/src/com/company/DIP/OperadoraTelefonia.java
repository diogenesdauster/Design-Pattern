package com.company.DIP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dauster on 09/06/16.
 */
public abstract class OperadoraTelefonia {
    protected List<Object> chamadas = new ArrayList<Object>();

    public OperadoraTelefonia(List<Object> chamadas) {
        this.chamadas = chamadas;
    }

    public abstract void discar();
    protected abstract void ligar();
}
