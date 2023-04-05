package segundoEjercicio;

public class Naranja extends Fruta{

    public Naranja() {
        super("Anaranjada");
    }

    public Naranja(String color) {
        super(color);
    }

    @Override
    public String obtenerSonido() {
        return this.getColor();
    }
}
