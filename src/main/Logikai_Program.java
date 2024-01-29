package main;

import modell.Feladat;
import nezet.CuiNezet;
import nezet.JopNezet;
import nezet.Nezet;
import vezerlo.CuiVezerlo;
import vezerlo.JopVezerlo;

public class Logikai_Program {

    public static void main(String[] args) {
        new Logikai_Program().init();

    }

    private void init() {
        Nezet nezet;
        Feladat model = new Feladat();

//        nezet = new CuiNezet();
//        new CuiVezerlo(model, (CuiNezet) nezet);
        nezet = new JopNezet();
        new JopVezerlo(model, (JopNezet) nezet);

    }
}
