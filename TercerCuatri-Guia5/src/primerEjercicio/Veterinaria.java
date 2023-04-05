package primerEjercicio;

import java.util.List;

public class Veterinaria {

    private List<Animal> listaAnimales;

    public Veterinaria(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(List<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public void mostrarSonidosAnimales(){
           /*tipo    nombreQueLeDoy    nombreLista*/
        for (Animal animales : listaAnimales) {
            System.out.println(animales.getSonido());
        }
    }
}
