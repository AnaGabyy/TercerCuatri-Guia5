package uno;

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

    @Override
    public void hacerSonidoDiferente() {
        System.out.println(this.getSonido());
    }
}
