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
        noveSlovo("ahoj");
        zkusPismeno('a');
    }
    
    //Metody rozhraní
    public void noveSlovo(String slovo) {
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
            System.out.println(this.pismenaSlova.toString());
        }
        
        return false;
    }
}
