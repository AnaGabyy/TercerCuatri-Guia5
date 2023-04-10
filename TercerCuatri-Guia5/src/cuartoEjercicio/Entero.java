package cuartoEjercicio;

public class Entero extends Numero{

    private int valor;

    public Entero(){
    }

    public Entero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void imprimirNumero() {
        System.out.println(this.getValor());
    }
}
