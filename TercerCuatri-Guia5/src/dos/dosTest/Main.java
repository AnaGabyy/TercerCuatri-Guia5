package dos.dosTest;

import dos.Fruta;
import dos.Frutero;
import dos.Manzana;
import dos.Naranja;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Crea una clase base llamada Fruta y dos subclases llamadas Manzana y Naranja. Agrega un método llamado
        obtenerColor() a la clase Fruta y redefine este método en las subclases para que las manzanas sean rojas
        y las naranjas sean naranjas. Luego, crea una clase frutero con un método que tome una lista de frutas y
        devuelva una lista con los colores de las frutas.*/

        Manzana manzana = new Manzana();
        Naranja naranja = new Naranja();

        List<Fruta> listaFrutas = new ArrayList<Fruta>();
        listaFrutas.add(manzana);
        listaFrutas.add(naranja);

        Frutero frutero = new Frutero(listaFrutas);

        frutero.mostrarColorFrutas();
    }
}
