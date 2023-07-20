package dos;

public abstract class Fruta {

    private String color;

    public Fruta(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract String obtenerSonido();

}
