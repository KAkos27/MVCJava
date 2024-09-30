package vezerlo;

import modell.JatekModell;
import nezet.KonzolNezet;

public class KonzolVezerlo {

    private JatekModell modell;
    private KonzolNezet nezet;

    public KonzolVezerlo(JatekModell modell, KonzolNezet nezet) {

        this.modell = modell;
        this.nezet = nezet;

        this.nezet.kiiras(modell.kezdes());
        this.modell.setValasztas(nezet.bekeres());
        this.nezet.kiiras(modell.ellenorzes());
        this.nezet.bezar();
    }
}
