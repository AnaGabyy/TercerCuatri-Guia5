package tres;

public class Gerente extends Empleado{

    public Gerente() {
        super(2000.95d);
    }

    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public void obtenerSalario() {
        System.out.println(getSalario());
    }
}
