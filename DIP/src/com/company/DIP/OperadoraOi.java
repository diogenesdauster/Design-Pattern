package com.company.DIP;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dauster on 08/06/16.
 */
public class OperadoraOi extends OperadoraTelefonia {

    public OperadoraOi(List<Object> chamadas) {
        super(chamadas);
    }

    @Override
    public void discar() {
        System.out.println("Contrate o Oi controle e fale no WhastApp de graça"); // propaganda
        System.out.println("Efetuando ligações ...");
        ligar();
    }

    @Override
    public void ligar() {
        for (Object chamada: chamadas ) {

            Telefonar telefone = ((Telefonar) chamada);
            telefone.ligar();

        }
    }



}
