package md.tekwill;

import md.tekwill.abstraction.Patrat;
import md.tekwill.abstraction.Triunghi;
import md.tekwill.encapsulation.ContBancar;
import md.tekwill.inheritance.Masina;
import md.tekwill.inheritance.Vehicul;
import md.tekwill.polymorphism.Animal;
import md.tekwill.polymorphism.Pisica;
import md.tekwill.polymorphism.Caine;

public class Main {
    public static void main(String[] args) {
        ContBancar contBancar1 = new ContBancar();
        ContBancar contBancar2 = new ContBancar();
        contBancar1.setNumarCont("0001");
        contBancar1.setSold(12345.67);
        contBancar2.setNumarCont("0002");
        contBancar2.setSold(890123.45);
        System.out.print("Soldul contului numarul " + contBancar1.getNumarCont() + " este: " + contBancar1.getSold() + "\n");
        System.out.print("Soldul contului numarul " + contBancar2.getNumarCont() + " este: " + contBancar2.getSold() + "\n");

        Vehicul vehicle = new Vehicul();
        vehicle.setCuloare("negru");
        vehicle.setNrRoti(2);
        vehicle.afiseazaDetaliiVehicul();
        Masina car = new Masina("Lexus");
        car.setCuloare("alb");
        car.setNrRoti(4);
        car.afiseazaDetaliiVehicul();

        Animal animal = new Animal();
        animal.emiteSunet();
        Pisica cat = new Pisica();
        cat.emiteSunet();
        Caine dog = new Caine();
        dog.emiteSunet();

        Triunghi triangle = new Triunghi(3, 2.5F);
        triangle.CalculArie();
        Patrat square = new Patrat(5.5F);
        square.CalculArie();

    }

}
