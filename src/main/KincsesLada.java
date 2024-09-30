package main;

import modell.JatekModell;
import nezet.CuiNezet;
import nezet.FelugroNezet;
import nezet.KonzolNezet;
import vezerlo.CuiVezerlo;

public class KincsesLada {

    public static void main(String[] args) {

        CuiNezet nezet;
        nezet = new KonzolNezet();
        new CuiVezerlo(new JatekModell(), nezet);

        nezet = new FelugroNezet();
        new CuiVezerlo(new JatekModell(), nezet);

    }
}
