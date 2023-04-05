package tercerEjercicioTest;

import tercerEjercicio.Empleado;
import tercerEjercicio.Empresa;
import tercerEjercicio.Gerente;
import tercerEjercicio.Vendedor;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*Crea una clase base llamada Empleado y dos subclases llamadas Gerente y Vendedor. Agrega un método llamado
         obtenerPago() a la clase Empleado y redefine este método en las subclases para calcular el pago
         correspondiente a cada tipo de empleado. Luego, crea una clase Empresa con una lista de empleados
         y llena la lista con objetos de las subclases. Después, crea un método que tome la lista de empleados
         y devuelva la suma total de los pagos de los empleados.*/

        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Vendedor vendedor2 = new Vendedor();

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(gerente);
        listaEmpleados.add(vendedor);
        listaEmpleados.add(vendedor2);

        Empresa empresa = new Empresa(listaEmpleados);

        empresa.sumaTotalSalarios();



    }

}
