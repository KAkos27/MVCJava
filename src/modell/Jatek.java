package modell;

import java.util.Scanner;

public class Jatek {

    private static final Scanner sc = new Scanner(System.in);

    private Lada[] ladak;
    private int valasztas;

    public Jatek() {
        valasztas = -1;
        this.ladak = new Lada[]{
            new Lada("Arany", "Én rejtem a kincset!"),
            new Lada("Ezüst", "Nem én rejtem!", true),
            new Lada("Bronz", "Az arany hazudik!")
        };

        kiiras(kezdes());
        bekeres();
        kiiras(ellenorzes());
        vege();
    }

    public String kezdes() {
        String s = "Hol a kincs? Csak az egyik felirat igaz!\n";
        int i = 1;
        for (Lada lada : ladak) {
            String anyag = lada.getAnyag();
            String felirat = lada.getFelirat();

            s += i++ + ". " + anyag + "Láda: " + felirat + "\n";
        }

        return s;
    }

    private void bekeres() {
        kiiras("Melyikben van a kincs? (1, 2, 3): ");
        this.valasztas = sc.nextInt() - 1;
    }

    public String ellenorzes() {
        String szoveg = "Sikerült\n";

        szoveg = this.ladak[this.valasztas].isKincs() ? szoveg : "Nem sikerült\n";

        return szoveg;
    }

    private void kiiras(String szoveg) {
        System.out.print(szoveg);
    }

    private void vege() {
        sc.close();
    }
}
