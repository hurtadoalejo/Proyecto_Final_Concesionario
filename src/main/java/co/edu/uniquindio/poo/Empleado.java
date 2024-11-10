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

    /**
     * Metodo para obtener el salario base de un empleado
     * @return Salario base de un empleado
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    /**
     * Metodo para obtener el estado de un empleado
     * @return Estado de un empleado
     */
    public Estado_empleado getEstadoEmpleado() {
        return estadoEmpleado;
    }

    /**
     * Metodo para modificar el salario base de un empleado
     * @param salarioBase Nuevo salario base de un empleado
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    /**
     * Metodo para modificar el estado de un empleado
     * @param estadoEmpleado Nuevo estado del empleado
     */
    public void setEstadoEmpleado(Estado_empleado estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }

}