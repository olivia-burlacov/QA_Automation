package md.tekwill.abstraction;

public class Patrat extends FormaGeometrica {

    private float latura;

    public Patrat(float latura) {
        this.latura = latura;
    }

    @Override
    public void calculArie() {
        result = (float) Math.pow(latura, 2);
        System.out.print("Aria patratului e " + result + " cm2\n");
    }
}
