package pilarespoo.polimorfismo.subtipo;

import java.util.List;

public class Veterinaria {
    //metodo que examina cualquier animal
    public void examinar(IAnimal animal){
        System.out.println("Examinando animal");
        animal.hacerSonido();
        animal.moverse();;
    }

    public void examinarVarios(List<IAnimal> animales){
        for (IAnimal animal : animales){
            examinar(animal);
            System.out.println("");
        }
    }
}
