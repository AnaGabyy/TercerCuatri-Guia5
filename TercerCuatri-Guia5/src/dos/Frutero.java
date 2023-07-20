package dos;

import java.util.List;

public class Frutero {

    private List<Fruta> listaFrutas;

    public Frutero(List<Fruta> listaFrutas) {
        this.listaFrutas = listaFrutas;
    }

    public List<Fruta> getListaFrutas() {
        return listaFrutas;
    }

    public void setListaFrutas(List<Fruta> listaFrutas) {
        this.listaFrutas = listaFrutas;
    }

    public void mostrarColorFrutas(){

        for (Fruta frutas : listaFrutas) {
            System.out.println(frutas.getColor());
        }
    }

}
