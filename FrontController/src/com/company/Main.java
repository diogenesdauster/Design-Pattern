package com.company;

import com.company.FrontController.KerberosFrontController;

public class Main {

    public static void main(String[] args) {
        KerberosFrontController kerberosFrontController = new KerberosFrontController();

        kerberosFrontController.solicitarTicket("CLIENTE");
        kerberosFrontController.processaTicket(kerberosFrontController.getTicket());

        kerberosFrontController.solicitarTicket("STUDENT");
        kerberosFrontController.processaTicket(kerberosFrontController.getTicket());

    }
}
