package com.company.ISP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dauster on 08/06/16.
 */
public class Operadora {
    private List<Object> chamadas = new ArrayList<Object>();

    public Operadora(List<Object> chamadas) {
        this.chamadas = chamadas;
    }

    private void ligar(){
        for (Object chamada: chamadas ) {

            Telefonar telefone = ((Telefonar) chamada);
            telefone.ligar();

        }
    }

    public void discar(){
        System.out.println("Efetuando ligações ...");
        ligar();

    }

}
