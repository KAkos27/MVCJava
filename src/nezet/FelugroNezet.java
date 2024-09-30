package nezet;

import javax.swing.JOptionPane;

public class FelugroNezet extends CuiNezet {

    @Override
    public int bekeres() {

        return Integer.parseInt(JOptionPane.showInputDialog("Melyikben van a kincs? (1, 2, 3): ")) - 1;

    }

    @Override
    public void kiiras(String szoveg) {

        JOptionPane.showMessageDialog(null, szoveg);
    }
}
