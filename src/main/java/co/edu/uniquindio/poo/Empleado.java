package co.edu.uniquindio.poo;

import java.util.List;
import java.util.LinkedList;

public class Empleado extends Persona {
    private double salarioBase;
    private Estado_empleado estadoEmpleado;
    private List<Venta> listaAlquileres;

    public Empleado(String nombre, String identificacion, String correo, double salarioBase, Estado_empleado estadoEmpleado) {
        super(nombre, identificacion, correo);
        this.salarioBase = salarioBase;
        this.estadoEmpleado = estadoEmpleado;
        this.listaAlquileres = new LinkedList<>();
    }

}
