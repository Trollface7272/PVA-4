package tlacitka;

import kalkulacka1.Model;

public class Tlacitko9 implements I_Algoritmus {
    private final Model mujModel;
    public Tlacitko9() {
        mujModel = Model.getInstance();
    }
    @Override
    public void Algoritmus() {
        mujModel.setRadek1(mujModel.getRadek1() + "9");
    }

}
