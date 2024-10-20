package co.edu.uniquindio.poo;

public class Cliente extends Persona{

    /**
     * Metodo constructor de la clase Cliente
     * @param nombre Nombre del cliente a crear
     * @param identificacion Identificacion del cliente a crear
     * @param correo Correo del cliente a crear
     */
    public Cliente(String nombre, String identificacion, String correo) {
        super(nombre, identificacion, correo);
    }

    /**
     * Metodo para obtener la informacion del cliente
     * @return
     */
    @Override
    public String toString() {
        String info = "";
        return info;
    }
}