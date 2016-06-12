package com.company.SRP;

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
            if(chamada instanceof Celular){
                Celular cel = ((Celular) chamada);

                if( cel.getSaldo()-cel.getTaxa() > 0.00) {
                    System.out.println("Ligando para o telefone " + cel.getTelefone());
                    cel.setSaldo(cel.getSaldo() - cel.getTaxa());
                }else{
                    System.out.println("Você não tem saldo para efetuar a ligação");
                }

            }else if (chamada instanceof Orelhao){
                Orelhao orelhao = ((Orelhao) chamada);

                if( orelhao.getCredito()-1 > 0.00) {
                    System.out.println("Ligando para o telefone " + orelhao.getTelefone());
                    orelhao.setCredito(orelhao.getCredito()-1);
                }else{
                    System.out.println("Você não tem saldo para efetuar a ligação");
                }

            }
        }
    }

    public void discar(){
        System.out.println("Efetuando ligações ...");
        ligar();

    }

}
