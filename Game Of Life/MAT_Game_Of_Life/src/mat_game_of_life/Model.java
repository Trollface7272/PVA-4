package mat_game_of_life;

import java.util.ArrayList;

public class Model {
    //Vlastnosti
    private ArrayList<Boolean> oldPole;
    private ArrayList<Boolean> newPole;
    private final int velikostX = 20;
    private final int velikostY = 20;
    
    //Metody rozhraní
    public void staraGenerace(ArrayList<Boolean> pole) {
        this.oldPole = pole;
    }
    public ArrayList<Boolean> novaGenerace() {
        spustPravidla();
        return newPole;
    }
    
    private void spustPravidla() {
        pravidlo1();
        pravidlo2();
        pravidlo3();
        pravidlo4();
    }
    private void pravidlo1() {
        
    }
    private void pravidlo2() {
        
    }
    private void pravidlo3() {
        
    }
    private void pravidlo4() {
        
    }
    
    private int zjistiSousedy(int x, int y) {
        int pocet = 0;
        if (x > 0 && y > 0 && oldPole.get((y-1) * velikostY + (x-1))) pocet++;
        if (y > 0 && oldPole.get((y-1) * velikostY +  x))    pocet++;
        if (x < velikostX - 1 && y > 0 && oldPole.get((y-1) * velikostY + (x+1))) pocet++;
        if (x > 0 && oldPole.get(y * velikostY + (x-1))) pocet++;
        if (x < velikostX - 1 && oldPole.get(y * velikostY + (x+1))) pocet++;
        if (x > 0 && y < velikostY - 1 && oldPole.get((y+1) * velikostY + (x-1))) pocet++;
        if (y < velikostY - 1 && oldPole.get((y+1) * velikostY + x)) pocet++;
        if (x < velikostX - 1 && y < velikostY - 1 && oldPole.get((y+1) * velikostY + (x+1))) pocet++;

        return pocet;
    }
}
