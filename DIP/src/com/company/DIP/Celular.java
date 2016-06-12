package com.company.DIP;

/**
 * Created by Dauster on 08/06/16.
 */
public class Celular implements Telefonar,Tarifar {
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

    @Override
    public void ligar() {
        if(cobrar()) {
            System.out.println("Ligando para o telefone " + this.telefone );
        }
    }

    @Override
    public boolean cobrar() {

        if(this.saldo-this.taxa > 0.0) {
            this.saldo -= this.taxa;
            return true;
        }
        System.out.println("Você não tem saldo para efetuar a ligação");
        return false;

    }
}
