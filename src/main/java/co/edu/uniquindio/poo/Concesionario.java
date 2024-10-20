package co.edu.uniquindio.poo;
import java.util.List;
import java.util.LinkedList;

public class Concesionario {
    private String nombre;
    private double gananciasNetas;
    private List<Sede> listaSedes; 
    
    /**
     * Metodo constructor de la clase Concesionario
     * @param nombre
     */
    public Concesionario(String nombre) {
        this.nombre = nombre;
        this.gananciasNetas = 0;
        this.listaSedes = new LinkedList<>();
    } 

    /**
     * Metodo para agregar una sede a la lista de sedes del concesionario
     * @param sede Sede que se busca agregar a la lista de sedes del concesionario
     */
    public void agregarSede(Sede sede){
        if (!verificarSede(sede.getDireccion(), sede.getCiudad())) {
            listaSedes.add(sede);
        }
    }
    /**
     * Metodo para verificar si una direccion y ciudad son iguales al de una sede en la lista de sedes del concesionario
     * @param direccion Direccion que se verificara
     * @param ciudad Ciudad que se verificara
     * @return Boolean sobre si estos datos son o no iguales al de una sede en la lista de sedes del concesionario
     */
    public boolean verificarSede(String direccion, String ciudad){
        boolean esRepetido = false;
        for (Sede sede : listaSedes) {
            if (sede.getDireccion().equals(direccion) && sede.getCiudad().equals(ciudad)) {
                esRepetido = true;
                break;
            }
        }
        return esRepetido;
    }
    /**
     * Metodo para eliminar una sede de la lista de sedes del concesionario
     * @param direccion Direccion de la sede a eliminar
     * @param ciudad Ciudad de la sede a eliminar
     */
    public void eliminarSede(String direccion, String ciudad){
        for (Sede sede : listaSedes) {
            if (sede.getDireccion().equals(direccion) && sede.getCiudad().equals(ciudad)) {
                listaSedes.remove(sede);
                break;
            }
        }
    }

    /**
     * Metodo para obtener el nombre del concesionario
     * @return Nombre del concesionario
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener las ganancias netas del concesionario
     * @return Ganacias netas del concesionario
     */
    public double getGananciasNetas() {
        return gananciasNetas;
    }
    /**
     * Metodo para obtener la lista de sedes del concesionario
     * @return Lista de las sedes del concesionario
     */
    public List<Sede> getListaSedes() {
        return listaSedes;
    }

    /**
     * Metodo para modificar el nombre del concesionario
     * @param nombre Nuevo nombre del concesionario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar las ganancias netas del concesionario
     * @param gananciasNetas Nuevas ganacias netas del concesionario
     */
    public void setGananciasNetas(double gananciasNetas) {
        this.gananciasNetas = gananciasNetas;
    }
    /**
     * Metodo para modificar la lista de sedes del concesionario
     * @param listaSedes Nueva lista de sedes del concesionario
     */
    public void setListaSedes(List<Sede> listaSedes) {
        this.listaSedes = listaSedes;
    }

    /**
     * Metodo para obtener la informacion del concesionario
     * @return Informacion del concesionario
     */
    @Override
    public String toString() {
        String info = "";
        return info;
    }
}