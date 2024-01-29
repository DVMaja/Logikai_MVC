package modell;

public class Feladat {

    private Lada[] ladak; //ezen a ponton a ládák az  null

    public Feladat() {

        ladak = new Lada[3];
        ladak[0] = new Lada("Arany", "Én rejtem a kincset!", false);
        ladak[1] = new Lada("Ezüst", "Nem én rejtem a kincset!", true);
        ladak[2] = new Lada("Bronz", "Az arany hazudik!", false);

    }

    //**Ez valójában setter*/
    public Lada[] getLadak() {
        return ladak;
    }

}
