package vezerlo;

import modell.JatekModell;
import nezet.CuiNezet;

public class CuiVezerlo {

    private JatekModell modell;
    private CuiNezet nezet;

    public CuiVezerlo(JatekModell modell, CuiNezet nezet) {

        this.modell = modell;
        this.nezet = nezet;

        this.nezet.kiiras(modell.kezdes());
        this.modell.setValasztas(nezet.bekeres());
        this.nezet.kiiras(modell.ellenorzes());
    }
}
