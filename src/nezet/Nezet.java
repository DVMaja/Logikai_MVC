package nezet;

public abstract class Nezet {

    protected static final String SEP = System.lineSeparator();

    protected abstract void nezetbeIr(String ki);

    public abstract int valasztas(String ki);

    public void leirasMegjelenito(String ki) {
        nezetbeIr(ki + SEP);
    }

    public void feladatMegjelenito(String ki) {
        nezetbeIr(ki + SEP);
    }

    public void eredmenyMegjelenito(String ki) {
        nezetbeIr(ki + SEP);
    }
}
