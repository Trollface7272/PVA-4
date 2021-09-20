package tlacitka;

import kalkulacka1.Model;

public class TlacitkoTecka implements I_Algoritmus {
    private final Model mujModel;
    public TlacitkoTecka() {
        mujModel = Model.getInstance();
    }
    @Override
    public void Algoritmus() {
        String radek1 = mujModel.getRadek1();
        try { Integer.parseInt(radek1.substring(radek1.length()-1)); }
        catch (NumberFormatException ex) { return; }
        mujModel.setRadek1(mujModel.getRadek1() + ".");
    }

}
