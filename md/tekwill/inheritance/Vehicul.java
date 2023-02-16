package md.tekwill.inheritance;

public class Vehicul {
    private String culoare;
    private int nrRoti;

    public Vehicul() {

    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(int nrRoti) {
        this.nrRoti = nrRoti;
    }

    public void afiseazaDetaliiVehicul() {
        System.out.print("Culoarea masinii e " + culoare + "\n");
        System.out.print("Masina are: " + nrRoti + " roti\n");
    }
}
