package mat_sibenice;

import javax.swing.JPanel;

public class DoplnovaniSlova extends JPanel {
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
        this.delkaSlova = slovo.length();
        this.slovo = slovo;
        this.pismenaSlova = slovo.replaceAll("[^.!?\\s]", "_").toCharArray();
        System.out.println(slovo.replaceAll("[^.!?\\s]", "_"));
        this.repaint();
    }
    public boolean zkusPismeno(char pismeno) {
        
        return false;
    }
}
