package mat_sibenice;

public class MAT_Sibenice {
    public static void main(String[] args) {
        SpravaSlov sprava = new SpravaSlov("src/slova/slovo.txt");
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            System.out.println(sprava.vyberNahodneSlovo());
        }
        System.out.println(sprava.obsahujeSlovo("čau"));
        System.out.println(sprava.obsahujeSlovo("ghdjgdf"));
        sprava.smazSlovo("čau");
    }
}
