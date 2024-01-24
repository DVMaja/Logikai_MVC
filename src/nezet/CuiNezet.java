package nezet;

import java.util.Scanner;

public class CuiNezet {

    private static final Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();

    private void konzolra(String ki) {
        System.out.print(ki);
    }

    public void leirasMegjelenito(String ki) {
        konzolra(ki + SEP);
    }

    public void feladatMegjelenito(String ki) {
        konzolra(ki + SEP);
    }

    //válsztás
    public int valasztasMegjelenito(String ki) {
        konzolra(ki);
        return sc.nextInt();
    }

    public void eredmenyMegjelenito(String ki) {
        konzolra(ki + SEP);
    }
}
