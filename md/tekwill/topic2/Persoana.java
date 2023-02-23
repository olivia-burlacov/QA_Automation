package md.tekwill.topic2;

public class Persoana {

    protected String prenume;
    protected String nume;

    private int varsta;

    private char gen;
    public double greutate;

    public Persoana() {

    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public void showPersonDetails() {
        System.out.print("Numele persoanei e: " + nume + " " + prenume + "\n" + "Varsta persoanei e:" + varsta + "\n" + "Genul persoanei e: " + gen + "\n" + "Greutatea persoanei e: " + greutate);
    }

}
