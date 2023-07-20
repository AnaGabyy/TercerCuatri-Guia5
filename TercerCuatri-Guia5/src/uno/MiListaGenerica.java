package uno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MiListaGenerica<EntidadGenerica> implements Iterable<EntidadGenerica> {

    private List<EntidadGenerica> listaGenerica;

    public MiListaGenerica() {
        this.listaGenerica = new ArrayList<>();
    }

    public MiListaGenerica(List<EntidadGenerica> animal) {
        this.listaGenerica = animal;
    }

    public List<EntidadGenerica> getListaGenerica() {
        return listaGenerica;
    }

    public void agregar(EntidadGenerica animal) {
        this.getListaGenerica().add(animal);
    }

    public EntidadGenerica obtener(Integer indice) {
        return this.getListaGenerica().get(indice);
    }

    @Override
    public Iterator<EntidadGenerica> iterator() {
        return this.getListaGenerica().iterator();
    }

}
