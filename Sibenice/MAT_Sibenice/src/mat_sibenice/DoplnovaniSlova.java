package mat_sibenice;

import java.awt.Font;
import java.awt.Graphics;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import javax.swing.JPanel;

public class DoplnovaniSlova extends JPanel implements PropertyChangeListener {
    //Vlastnosti
    private String slovo;
    private char[] pismenaSlova;
    private int delkaSlova;
    //Konstruktor
    public DoplnovaniSlova() {
        delkaSlova = 0;
        slovo = "";
        pismenaSlova = new char[0];
    }
    
    //Metody rozhraní
    public void noveSlovo(String slovo) {
        slovo = slovo.toUpperCase();
        this.delkaSlova = slovo.length();
        this.slovo = slovo;
        this.pismenaSlova = slovo.replaceAll("[^.!?\\s]", "_").toCharArray();
        
        this.repaint();
    }
    public boolean zkusPismeno(char pismeno) {
        if (!this.slovo.contains(String.valueOf(pismeno))) return false;
        for (int i = 0; i < this.slovo.length(); i++) {
            if (this.slovo.charAt(i) != pismeno) continue;
            this.pismenaSlova[i] = pismeno;
        }
        this.repaint();
        return true;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", 42, 42));
        g.drawString(new String(this.pismenaSlova), 20, 40);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (!"stisk_tlacitka".equals(evt.getPropertyName())) return;
        if (!zkusPismeno(evt.getNewValue().toString().charAt(0)))
            propertyChangeSupport.firePropertyChange("spatny_znak", "", "a");
    }

    //Property change support
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
