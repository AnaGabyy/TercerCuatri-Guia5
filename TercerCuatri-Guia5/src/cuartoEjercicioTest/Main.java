package cuartoEjercicioTest;

import cuartoEjercicio.Conjunto;
import cuartoEjercicio.Decimal;
import cuartoEjercicio.Entero;
import cuartoEjercicio.Numero;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


    /*Crea una clase base llamada Numero y dos subclases llamadas Entero y Decimal. Agrega un método llamado
    imprimir() a la clase Numero y redefine este método en las subclases para que imprima el número correspondiente.
    Luego, crea clase conjunto con un set de números y una lista de números y llena ambas estructuras con objetos
    de las subclases. Después, crea un método que usando su set de números y su lista de números y haga que cada
    número en el set y en la lista imprima su valor.*/

    Entero uno = new Entero(1);
    Entero dos = new Entero(2);
    Entero tres = new Entero(3);

    Decimal unoComaUno = new Decimal(1.1d);
    Decimal dosComaDos = new Decimal(2.2d);
    Decimal tresComaTres = new Decimal(3.3d);

    Conjunto conjunto = new Conjunto();

    conjunto.getSetDeNumerosEnteros().add(uno);
    conjunto.getSetDeNumerosEnteros().add(dos);
    conjunto.getSetDeNumerosEnteros().add(tres);

    conjunto.getListDeNumerosDecimales().add(unoComaUno);
    conjunto.getListDeNumerosDecimales().add(dosComaDos);
    conjunto.getListDeNumerosDecimales().add(tresComaTres);

    conjunto.imprimirSetYLista();

    }
}
