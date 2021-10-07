package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Platno extends JPanel {
    //Vlastnosti
    private ArrayList<Boolean> pole;
    private int velikost;
    //Konstruktor
    public Platno() {
        pole = new ArrayList<>();
        velikost = 20;
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                zpracovatKliknuti(e.getX(), e.getY());
            }
            
        });
    }
    
    public void naplnPole(ArrayList<Boolean> pole) {
        this.pole.clear();
        for (int i = 0; i < (20*20); i++) {
            this.pole.add(pole.get(i));
        }
        this.repaint();
    }
    
    
    //Paint component
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        tiskPole(g);
    }
    
    private void tiskPole(Graphics g) {
        if (pole.isEmpty()) return;
        for (int i = 0; i < (20*20); i++) {
            g.setColor(pole.get(i) ? Color.BLACK : Color.WHITE);
            g.fillRect(i%20 * velikost, i/20 * velikost, velikost, velikost);
        }
    }
    
    private void zpracovatKliknuti(int x, int y) {
        int posX = x/velikost;
        int posY = y/velikost;
        int pos = posY * 20 + posX;
        pole.set(pos, !pole.get(pos));
        this.repaint();
    }
}
