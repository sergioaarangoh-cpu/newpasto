package pilarespoo.polimorfismo.subtipo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Veterinaria vet = new Veterinaria();
        IAnimal perro = new Perro("Darío Gómez", 66);
        IAnimal gato = new Gato("Newperro");
        IAnimal pajaro = new Pajaro("Nefausto", "Grande");

        //Forma de agregar varios objetos a una lista
        List<IAnimal> animales = Arrays.asList(perro, gato, pajaro);

        //examinar varios permite revisar todos los animales
        vet.examinarVarios(animales);
    }
}
