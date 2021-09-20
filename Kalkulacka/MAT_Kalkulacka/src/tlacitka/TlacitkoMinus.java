package tlacitka;

import kalkulacka1.Model;

public class TlacitkoMinus implements I_Algoritmus {
    private final Model mujModel;
    public TlacitkoMinus() {
        mujModel = Model.getInstance();
    }
    @Override
    public void Algoritmus() {
        String radek1 = mujModel.getRadek1();
        try { Integer.parseInt(radek1.substring(radek1.length()-1)); }
        catch (NumberFormatException ex) { return; }
        catch (StringIndexOutOfBoundsException ex) { }
        mujModel.setRadek1(radek1 + "-");
    }

}
