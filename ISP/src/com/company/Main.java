package com.company;

import com.company.ISP.Celular;
import com.company.ISP.Operadora;
import com.company.ISP.OperadoraTim;
import com.company.ISP.Orelhao;

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

        OperadoraTim tim = new OperadoraTim(chamadas);

        cel1.setTelefone("+55 (81) 9 97567446");
        ore1.setTelefone("+55 (81) 9 97567446");

        tim.discar();

    }
}
