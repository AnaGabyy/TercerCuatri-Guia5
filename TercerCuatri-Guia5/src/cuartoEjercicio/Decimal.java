package cuartoEjercicio;

public class Decimal extends Numero{

    private double valor;

    public Decimal() {
    }

    public Decimal(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public void imprimirNumero() {
        System.out.println(this.getValor());
    }
}
