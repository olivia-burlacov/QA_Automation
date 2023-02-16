package md.tekwill.inheritance;

public class Masina extends Vehicul {
    private String marca;

    public Masina(String marca) {
        this.marca = marca;
    }

    public void afiseazaDetaliiVehicul() {
        super.afiseazaDetaliiVehicul();
        System.out.print("Marca masinii e " + marca + "\n");
    }
}
