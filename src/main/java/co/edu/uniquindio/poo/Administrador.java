package co.edu.uniquindio.poo;

public class Administrador extends Persona{
    private double salarioBase;
    private Sede sede;

    public Administrador(String nombre, String identificacion, String correo, double salarioBase, Sede sede) {
        super(nombre, identificacion, correo);
        this.salarioBase = salarioBase;
        this.sede = sede;
    }

    /**
     * Metodo para obtener el salario base del administrador
     * @return Salario base del administrador
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    /**
     * Metodo para obtener la sede del administrador
     * @return Sede del administrador
     */
    public Sede getSede() {
        return sede;
    }

    /**
     * Metodo para modificar el salario base del administrador
     * @param salarioBase Nuevo salario base del administrador
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    /**
     * Metodo para modificar la sede del administrador
     * @param sede Nueva sede del administrador
     */
    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
