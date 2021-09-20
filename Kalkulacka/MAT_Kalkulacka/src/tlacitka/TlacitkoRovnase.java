package tlacitka;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import kalkulacka1.Model;

public class TlacitkoRovnase implements I_Algoritmus {
    private final Model mujModel;
    public TlacitkoRovnase() {
        mujModel = Model.getInstance();
    }
    @Override
    public void Algoritmus() {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine js = manager.getEngineByName("js");
        try {
            mujModel.setRadek2(js.eval(mujModel.getRadek1()).toString());
        } catch (ScriptException ex) {
            System.out.println("Error");
        }
    }

}
