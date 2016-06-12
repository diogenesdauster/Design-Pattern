package com.company.FrontController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Dauster on 09/06/16.
 */
public class KerberosFrontController {
    private KerberosMediador mediador;
    private String ticket;
    private String requisicao;

    public KerberosFrontController(){
        this.mediador = new KerberosMediador();
    }

    public String getTicket() {
        return ticket;
    }

    private boolean validaTicket(String ticketValid, String requisicao){
        return ticketValid == this.ticket && requisicao == this.requisicao ;
    }

    private void gerarTicket(){
        DateFormat df = new SimpleDateFormat("HHmmss");
        Date today = Calendar.getInstance().getTime();
        this.ticket = df.format(today);

    }

    public void solicitarTicket(String requisicao){
        System.out.println("Solicitando Ticket para : " + requisicao);
        gerarTicket();
        this.requisicao = requisicao;
    }


    public void processaTicket(String ticket){

        if(validaTicket(ticket,requisicao)){
            mediador.processar(requisicao);
        }else{
            System.out.println("Ticket Invalido !!");
        }
    }


}
