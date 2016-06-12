package com.company.SRP;

/**
 * Created by Dauster on 08/06/16.
 */
public class Orelhao {
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
}
