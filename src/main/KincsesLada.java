package main;

import modell.JatekModell;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.FelugroVezerlo;
import vezerlo.KonzolVezerlo;

public class KincsesLada {

    public static void main(String[] args) {

        new KonzolVezerlo(new JatekModell(), new KonzolNezet());
        new FelugroVezerlo(new JatekModell(), new FelugroNezet());
    }
}
