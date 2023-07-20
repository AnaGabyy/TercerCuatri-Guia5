package uno;

public abstract class Animal {

    private String sonido;

    public Animal(){
    }

    public Animal(String sonido) {
        this.sonido = sonido;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    //Forma 1
    public abstract String hacerSonido();
    //Forma 2
    public abstract void hacerSonidoDiferente();

}
