package com.company;

import com.company.SRP.Celular;
import com.company.SRP.Operadora;
import com.company.SRP.Orelhao;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Celular cel1 = new Celular("+55 (81) 9 97567447",15.00,0.35);
        Orelhao ore1 = new Orelhao("+55 (81) 9 97567447",35.00);

        List<Object> chamadas = new ArrayList<Object>();

        chamadas.add(cel1);
        chamadas.add(ore1);

        Operadora telefonica = new Operadora(chamadas);

        telefonica.discar();

    }
}
