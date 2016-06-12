package com.company.SRP;

/**
 * Created by Dauster on 08/06/16.
 */
public class Celular {
    private String telefone;
    private double saldo;
    private double taxa;

    public Celular(String telefone, double saldo, double taxa) {
        this.telefone = telefone;
        this.saldo = saldo;
        this.taxa = taxa;
    }

    public String getTelefone() {
        return telefone;
    }


    public double getSaldo() {
        return saldo;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

}
