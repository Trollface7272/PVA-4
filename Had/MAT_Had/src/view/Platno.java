package view;

import had.ClanekHada;
import had.Had;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Platno extends JPanel{
    //Vlastnosti
    private final int velikost = 25;
    private Had had;
    
    //Konstruktor
    public Platno() {
        had = new Had();
    }
    
    //Paint component
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        had.pohyb();
        vykresliPozadi(g);
        had.vykresli(g, getWidth() / velikost);
    }
    
    private void vykresliPozadi(Graphics g) {
        int velikostPolicka = getWidth() / velikost;
        g.setColor(new Color(150, 150, 150));
        for (int i = 0; i < velikost; i++) {
            for (int j = 0; j < velikost; j++) {
                g.drawRect(velikostPolicka * i, velikostPolicka * j, 
                        velikostPolicka, velikostPolicka);
            }
        }
    }
}
