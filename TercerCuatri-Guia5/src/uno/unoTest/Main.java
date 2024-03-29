package uno.unoTest;

import uno.Animal;
import uno.Gato;
import uno.Perro;
import uno.Veterinaria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Crea una clase base llamada Animal y dos subclases llamadas Perro y Gato. Agrega un método llamado sonido() a
         la clase Animal y redefine este método en las subclases para que los perros ladren y los gatos maúllen. Luego,
         crea una clase veterinaria con un metodo que agarre su arreglo de animales y haga que cada animal en el
          arreglo haga su sonido.
         */

        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();

        List<Animal> listaAnimales = new ArrayList<>();
        listaAnimales.add(perro1);
        listaAnimales.add(gato1);
        listaAnimales.add(perro2);
        listaAnimales.add(gato2);

        Veterinaria veterinaria = new Veterinaria(listaAnimales);

        veterinaria.mostrarSonidosAnimales();

        //Ejemplo de el profe con la lista como una clase

        LinkedList<Animal> listaAnimal = new LinkedList<>();
        ArrayList<Animal> listaAnimalDos = new ArrayList<>();

        Veterinaria vet = new Veterinaria(listaAnimalDos, listaAnimal);


    }
}
