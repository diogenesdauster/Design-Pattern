package com.company.ISP;

/**
 * Created by Dauster on 08/06/16.
 */
public class Orelhao implements Telefonar,Tarifar {
    private String telefone;
    private double credito;

    public Orelhao(String telefone, double credito) {
        this.telefone = telefone;
        this.credito = credito;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getCredito() {
        return credito;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public void ligar() {
        if(cobrar()){
            System.out.println("Ligando para o telefone " + this.telefone );
        }
    }

    @Override
    public boolean cobrar() {

        if(this.credito-1 > 0.0){
            this.credito-=1;
            return true;
        }
        System.out.println("Você não tem saldo para efetuar a ligações");
        return false;
    }
}
