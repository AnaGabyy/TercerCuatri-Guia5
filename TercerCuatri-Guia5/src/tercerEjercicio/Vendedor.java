package tercerEjercicio;

public class Vendedor extends Empleado{

    public Vendedor() {
        super(1000.05);
    }

    public Vendedor(double salario) {
        super(salario);
    }

    @Override
    public void obtenerSalario() {
        System.out.println(getSalario());
    }
}
