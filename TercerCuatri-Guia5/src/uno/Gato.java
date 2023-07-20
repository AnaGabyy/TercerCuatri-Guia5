package uno;

public class Gato extends Animal{

    public Gato() {
        super ("Miau");
    }

    public Gato(String sonido) {
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
