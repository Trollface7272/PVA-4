package had;

import java.awt.Graphics;
import java.util.ArrayList;

public class Had {
    //Vlastnosti
    private ArrayList<ClanekHada> had;
    //Konstruktor
    public Had() {
        had = new ArrayList<>();
        had.add(new ClanekHada(5, 10, true));
        had.add(new ClanekHada(6, 10, false));
        had.add(new ClanekHada(7, 10, false));
        had.add(new ClanekHada(8, 10, false));
        had.add(new ClanekHada(9, 10, false));
        had.add(new ClanekHada(10, 10, false));
        had.add(new ClanekHada(11, 10, false));
        had.add(new ClanekHada(12, 10, false));


    }
    
    //Metody rozhraní
    public void vykresli(Graphics g, int velikost) {
        for (ClanekHada clanekHada : had) {
            clanekHada.vykresliClanek(g, velikost);
        }
    }
    public void pohyb() {
        ArrayList<ClanekHada> novePole = new ArrayList<>();
        
        ClanekHada hlava = had.get(0);
        hlava.setJeHlava(false);
        
        ClanekHada posledni = had.get(had.size() - 1);
        posledni.setX(hlava.getX());
        posledni.setY(hlava.getY() + 1);
        posledni.setJeHlava(true);
        
        novePole.add(posledni);
        novePole.add(hlava);
        novePole.addAll(had.subList(1, had.size()-1));
        had = novePole;
    }
}