package primerEjercicio;

public class Perro extends Animal{

    public Perro() {
        super("Guau");
    }

    public Perro(String sonido) {
        super(sonido);
    }

    @Override
    public String hacerSonido() {
        return this.getSonido();
    }
}
