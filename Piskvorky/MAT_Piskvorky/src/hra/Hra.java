package hra;

import nastaveni.Nastaveni;

public class Hra {
    private Boolean[][] pole;
    private Boolean hrac;
    
    public Hra() {
        pole = new Boolean[Nastaveni.velikostPole][Nastaveni.velikostPole];
        hrac = true;
    }
    
    
    //Metody
    public void polickoKliknuto(int x, int y) {
        if (pole[x][y] != null) return;
        pole[x][y] = hrac;
        hrac = !hrac;
    }

    public Boolean[][] getPole() {
        return pole;
    }
    
    
}
