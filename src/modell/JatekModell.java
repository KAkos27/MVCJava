package modell;

public class JatekModell {

    private Lada[] ladak;
    private int valasztas;

    public JatekModell() {

        valasztas = -1;

        this.ladak = new Lada[]{
            new Lada("Arany", "Én rejtem a kincset!"),
            new Lada("Ezüst", "Nem én rejtem!", true),
            new Lada("Bronz", "Az arany hazudik!")
        };
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

    public int getValasztas() {
        return valasztas;
    }

    public void setValasztas(int valasztas) {
        this.valasztas = valasztas;
    }

    public String ellenorzes() {

        String szoveg = "Sikerült\n";

        szoveg = this.ladak[this.valasztas].isKincs() ? szoveg : "Nem sikerült\n";

        return szoveg;
    }

}
