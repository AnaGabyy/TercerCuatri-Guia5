package uno;
import java.util.ArrayList;
import java.util.List;

public class Veterinaria {

    //PRIMER PARCIAL BIEN, SEGUNDO MAL
    public ArrayList<Animal> animales;
    //AMBOS PARCIALES BIEN
    public List<Animal> animalesLista;

    public MiListaGenerica<Animal> miListaGenerica;

    public Veterinaria(List<Animal> animalesLista) {
        this.animalesLista = animalesLista;
    }
    public Veterinaria() {
        this.animales = new ArrayList<>();
        this.animalesLista = new ArrayList<>();
    }

    public Veterinaria(List<Animal> animalesListaFormaUno, List<Animal> animalesListaFormaDos) {
        this.animalesLista = animalesListaFormaDos;
    }

    public List<Animal> getListaAnimales() {
        return animalesLista;
    }

    public void setAnimalesLista(List<Animal> animalesLista) {
        this.animalesLista = animalesLista;
    }

    public void mostrarSonidosAnimales(){
           /*tipo    nombreQueLeDoy    nombreLista*/
        for (Animal animales : animalesLista) {
            System.out.println(animales.getSonido());
        }
    }
}
