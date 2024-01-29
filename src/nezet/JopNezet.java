package nezet;

import javax.swing.JOptionPane;

public class JopNezet extends Nezet {

    @Override
    protected void nezetbeIr(String ki) {
        JOptionPane.showMessageDialog(null, ki);
    }

    //válsztás
    @Override
    public int valasztas(String ki) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, ki));
    }
}
