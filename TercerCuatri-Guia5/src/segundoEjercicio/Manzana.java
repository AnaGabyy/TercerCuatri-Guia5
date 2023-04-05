package segundoEjercicio;

public class Manzana extends Fruta{

    public Manzana() {
        super("Roja");
    }

    public Manzana(String color) {
        super(color);
    }

    @Override
    public String obtenerSonido() {
        return this.getColor();
    }
}
