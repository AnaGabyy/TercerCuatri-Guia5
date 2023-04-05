package tercerEjercicio;

import java.util.List;

public class Empresa {

    private List<Empleado> listaEmpleados;

    public Empresa(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public void sumaTotalSalarios(){
        double totalSalarios = 0.0d;

        for (Empleado empleados : listaEmpleados) {
            totalSalarios = totalSalarios + empleados.getSalario();
        }
            System.out.println(totalSalarios);
    }

}
