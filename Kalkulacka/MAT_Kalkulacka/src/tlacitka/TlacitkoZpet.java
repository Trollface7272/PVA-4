package tlacitka;

import kalkulacka1.Model;

public class TlacitkoZpet implements I_Algoritmus {
    private final Model mujModel;
    public TlacitkoZpet() {
        mujModel = Model.getInstance();
    }
    @Override
    public void Algoritmus() {
        mujModel.setRadek1(mujModel.getRadek1().substring(0, mujModel.getRadek1().length() - 1));
    }

}
