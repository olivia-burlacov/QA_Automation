package md.tekwill.abstraction;

public class Triunghi extends FormaGeometrica {

    private float baza;
    private float inaltime;

    public Triunghi(float baza, float inaltime) {
        this.baza = baza;
        this.inaltime = inaltime;
    }

    @Override
    public void calculArie() {
        result = (baza * inaltime) / 2;
        System.out.print("Aria triunghiului e " + result + " cm2\n");
    }
}
