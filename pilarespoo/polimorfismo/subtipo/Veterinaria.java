package pilarespoo.polimorfismo.subtipo;

import java.util.List;

public class Veterinaria {
    //metodo que examina cualquier animal
    public void examinar(pilarespoo.polimorfismo.subtipo.IAnimal animal) {
        System.out.println("Examinando animal");
        animal.hacerSonido();
        animal.moverse();
        ;
    }

    public void examinarVarios(List<pilarespoo.polimorfismo.subtipo.IAnimal> animales) {
        for (pilarespoo.polimorfismo.subtipo.IAnimal animal : animales) {
            examinar(animal);
            System.out.println("");
        }
    }
}
