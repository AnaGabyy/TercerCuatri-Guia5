package cuatro;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conjunto {

    private Set<Numero> setDeNumerosEnteros;
    private List<Numero> listDeNumerosDecimales;

    public Conjunto() {
        this.listDeNumerosDecimales = new ArrayList<>();
        this.setDeNumerosEnteros = new HashSet<>();
    }

    public Set<Numero> getSetDeNumerosEnteros() {
        return setDeNumerosEnteros;
    }

    public void setSetDeNumerosEnteros(Set<Numero> setDeNumerosEnteros) {
        this.setDeNumerosEnteros = setDeNumerosEnteros;
    }

    public List<Numero> getListDeNumerosDecimales() {
        return listDeNumerosDecimales;
    }

    public void setListDeNumerosDecimales(List<Numero> listaDeNumerosDecimales) {
        this.listDeNumerosDecimales = listaDeNumerosDecimales;
    }


    public void imprimirSetYLista(){

        System.out.println("Números enteros: ");

        for (Numero numerosEnteros : setDeNumerosEnteros) {
            numerosEnteros.imprimirNumero();
        }

        System.out.println("Números decimales: ");

        for (Numero numerosDecimales : listDeNumerosDecimales) {
            numerosDecimales.imprimirNumero();
        }
    }


}
