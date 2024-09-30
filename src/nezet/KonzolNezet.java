package nezet;

import java.util.Scanner;

public class KonzolNezet extends CuiNezet {

    private static final Scanner sc = new Scanner(System.in);

    @Override
    public int bekeres() {

        kiiras("Melyikben van a kincs? (1, 2, 3): ");
        return sc.nextInt() - 1;
    }

    @Override
    public void kiiras(String szoveg) {

        System.out.print(szoveg);
    }

    public void bezar() {
        sc.close();
    }
}
