package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.KeyStroke;
import tlacitka.I_Algoritmus;

public class SuperTlacitko extends JButton {
    //Vlastnosti
    private I_Algoritmus strategie;
    
    //Konstruktor
    public SuperTlacitko() {
        super();
        this.setBackground(new Color(200, 255, 200));
        this.setFont(new Font("Tahoma", 1, 11));
    }
    public SuperTlacitko(I_Algoritmus alg, final int klavesa, String nazev) {
        super();
        NastavAlg(alg);
        ActionListener mujListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SpustAlg();
            }
        };
        this.addActionListener(mujListener);
        this.registerKeyboardAction(mujListener,
                KeyStroke.getKeyStroke(klavesa, 0),
                WHEN_IN_FOCUSED_WINDOW);
        this.setText(nazev);
        this.setBackground(new Color(200, 255, 200));
        this.setFont(new Font("Tahoma", 1, 11));
    }
    
    //Metody Strategie
    public void SpustAlg() {
        strategie.Algoritmus();
    }
    public void NastavAlg(I_Algoritmus alg) {
        this.strategie = alg;
    }
}
