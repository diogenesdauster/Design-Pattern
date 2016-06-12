package com.company.DIP;

import java.util.List;

/**
 * Created by Dauster on 08/06/16.
 */
public class OperadoraTim extends OperadoraTelefonia {


    public OperadoraTim(List<Object> chamadas) {
        super(chamadas);
    }

    @Override
    public void discar() {
        System.out.println("Ligue de Tim para Tim sem pagar nada"); // propaganda
        System.out.println("Efetuando ligações ...");
        ligar();
    }

    @Override
    protected void ligar() {
        for (Object chamada: chamadas ) {

            Telefonar telefone = ((Telefonar) chamada);
            telefone.ligar();

        }
    }



}
