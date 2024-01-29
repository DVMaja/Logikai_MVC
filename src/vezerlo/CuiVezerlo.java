package vezerlo;

import modell.Feladat;
import modell.Lada;
import nezet.CuiNezet;

public class CuiVezerlo extends Vezerlo {

    private Feladat model;
    private CuiNezet nezet;
    private Lada[] ladak;

    public CuiVezerlo(Feladat model, CuiNezet nezet) {
        super(model);
        this.model = super.getModel();
        this.nezet = nezet;

        mutat();
    }

    protected int valasztasKezelo() {
        int valasztas = nezet.valasztas("melyik (0..2): ");
        return valasztas;
    }

    @Override
    public void mutat() {
        nezet.leirasMegjelenito("Csak 1 igaz!");
        nezet.feladatMegjelenito(feladatOsszeallito());
        int valasztas = valasztasKezelo();
        nezet.eredmenyMegjelenito(eredmenyOsszeallito(valasztas));
    }

}
