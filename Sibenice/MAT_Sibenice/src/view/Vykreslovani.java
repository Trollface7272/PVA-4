package view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Vykreslovani extends JPanel {
    //Vlastnosti
    private ArrayList<BufferedImage> obrazky;
    
    //Konstruktor
    public Vykreslovani() {
        this.obrazky = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            try {
                this.obrazky.add(ImageIO.read(new File("src/obrazky/" + i + ".png")));
            } catch (IOException ex) {
                System.out.println("Chyba při načítání obrázku " + i + "!");
            }
        }
        this.novaHra();
    }
    //Metody rozhraní
    public void novaHra() {
        
    }
    public void dalsiObrazek() {
        
    }
}
