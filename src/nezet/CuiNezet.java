package nezet;

import java.util.Scanner;

public class CuiNezet extends Nezet {

    private static final Scanner sc = new Scanner(System.in);

    @Override
    protected void nezetbeIr(String ki) {
        System.out.print(ki);
    }

    //válsztás
    @Override
    public int valasztas(String ki) {
        nezetbeIr(ki);
        return sc.nextInt();
    }
}
