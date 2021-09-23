package mat_sibenice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpravaSlov {
    //Vlastnosti
    private String cesta;
    private ArrayList<String> slova;
    private File soubor;
    
    //konstruktor
    public SpravaSlov(String cesta) {
        this.cesta = cesta;
        this.slova = new ArrayList<>();
        this.soubor = new File(cesta);
        try {
            nacteniTextuDoPole();
        } catch (IOException ex) {
            System.out.println("Soubor nenalezen!");
        }
        tiskPole();
    }
    //Metody rozhraní
    public String vyberNahodneSlovo() {
        Random rand = new Random();
        return slova.get(rand.nextInt(slova.size()));
    }
    public boolean vlozSlovo() {
        
        return false;
    }
    public boolean smazSlovo() {
        
        return false;
    }
    public boolean obsahujeSlovo() {
        
        return false;
    }
    
    //Metody
    private void nacteniTextuDoPole() throws FileNotFoundException, IOException {
        this.slova.clear();
        BufferedReader br = new BufferedReader(new FileReader(this.soubor));
        String line;
        while ((line = br.readLine()) != null) {
            this.slova.add(line);
        }
        br.close();
    }
    private void tiskPole() {
        for (String slovo : this.slova) {
            System.out.println(slovo);
        }
    }
}
