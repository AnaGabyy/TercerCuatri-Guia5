package tercerEjercicio;

public abstract class Empleado {

    private double salario;

    public Empleado(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void obtenerSalario();
}
