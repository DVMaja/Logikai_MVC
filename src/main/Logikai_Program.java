package main;

import modell.Lada;
import nezet.CuiNezet;

public class Logikai_Program {

    private Lada[] ladak;

    public static void main(String[] args) {
        Logikai_Program lp = new Logikai_Program();
        lp.feladatok();

    }

    private void feladatok() {
        ladak = new Lada[3];
        ladak[0] = new Lada("Arany", "Én rejtem a kincset!", false);
        ladak[1] = new Lada("Ezüst", "Nem én rejtem a kincset!", true);
        ladak[2] = new Lada("Bronz", "Az arany hazudik!", false);
        CuiNezet nezet = new CuiNezet();

        nezet.leirasMegjelenito("CSak 1 igaz");

        for (Lada lada : ladak) {
            String anyag = lada.getAnyag() + ": ";
            String felirat = lada.getFelirat();
            nezet.feladatMegjelenito(anyag + felirat);
        }

        int valasztas = nezet.valasztasMegjelenito("melyik az: ");

        Lada lada = ladak[valasztas];
        String str = "";
        //20perc
        if (lada.isKincs()) {
            str = "talált a kincset a(z) ";
        } else {
            str = "nem talált a a kincset nem a(z) ";
        }
        nezet.eredmenyMegjelenito(str + lada.getAnyag() + " rejti");

    }

}
