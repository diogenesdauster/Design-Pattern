package com.company;

import com.company.DIP.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Celular cel1 = new Celular("+55 (81) 9 97567447",15.00,0.35);
        Orelhao ore1 = new Orelhao("+55 (81) 9 97567447",35.00);

        List<Object> chamadas = new ArrayList<Object>();

        chamadas.add(cel1);
        chamadas.add(ore1);

        OperadoraTelefonia oi = new OperadoraOi(chamadas);

        oi.discar();

        OperadoraTelefonia tim = new OperadoraTim(chamadas);

        cel1.setTelefone("+55 (81) 9 97567446");
        ore1.setTelefone("+55 (81) 9 97567446");

        tim.discar();

    }
}
