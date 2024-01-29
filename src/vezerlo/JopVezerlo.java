package vezerlo;

import modell.Feladat;
import modell.Lada;
import nezet.JopNezet;

public class JopVezerlo extends Vezerlo {

    private Feladat model;
    private JopNezet nezet;
    private Lada[] ladak;

    public JopVezerlo(Feladat model, JopNezet nezet) {
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
