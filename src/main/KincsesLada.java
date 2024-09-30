package main;

import modell.JatekModell;
import nezet.KonzolNezet;
import vezerlo.KonzolVezerlo;

public class KincsesLada {

    public static void main(String[] args) {

        new KonzolVezerlo(new JatekModell(), new KonzolNezet());
    }
}
