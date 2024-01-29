package vezerlo;

import modell.Feladat;
import modell.Lada;

public abstract class Vezerlo {

    protected Feladat model;
    private Lada[] ladak;

    public Vezerlo(Feladat model) {
        this.model = model;
        this.ladak = model.getLadak();
    }

    public Feladat getModel() {
        return model;
    }

    public abstract void mutat();

    protected String feladatOsszeallito() {
        String str = "";
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag() + ": ";
            String felirat = lada.getFelirat();
            str += anyag + felirat + "\n";
        }
        return str;
    }

    protected String eredmenyOsszeallito(int valasztas) {
        Lada lada = ladak[valasztas];
        String str = "";
        if (lada.isKincs()) {
            str = "talált, a kincset a(z) ";
        } else {
            str = "nem talált, a kincset nem a(z) ";
        }
        return str + lada.getAnyag() + " rejti ";
    }

}
