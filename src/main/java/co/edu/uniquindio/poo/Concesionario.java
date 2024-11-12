package co.edu.uniquindio.poo;
import java.util.List;
import java.util.LinkedList;

public class Concesionario{
    private String nombre;
    private double gananciasNetas;
    private List<Sede> listaSedes;
    private List<Empleado> listaEmpleados; 
    private List<Administrador> listaAdministradores;
    private List<Cliente> listaClientes;
    private List<Vehiculo> listaVehiculos;
    private int password;
    private boolean autenticado;
    
    /**
     * Metodo constructor de la clase Concesionario
     * @param nombre Nombre del concesionario a crear
     * @param password Contraseña del concesionario a crear
     */
    public Concesionario(String nombre, int password) {
        this.nombre = nombre;
        this.gananciasNetas = 0;
        this.listaSedes = new LinkedList<>();
        this.listaEmpleados = new LinkedList<>();
        this.listaAdministradores = new LinkedList<>();
        this.listaClientes = new LinkedList<>();
        this.listaVehiculos = new LinkedList<>();
        this.password = password;
        this.autenticado = false;
    } 

    /**
     * Metodo para obtener el nombre del concesionario
     * @return Nombre del concesionario
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo para obtener la contraseña del concesionario
     * @return Contraseña del concesionario
     */
    public int getPassword() {
        return password;
    }
    /**
     * Metodo para saber si el concesionario esta autenticado o no
     * @return Booleano sobre si esta autenticado o no
     */
    public boolean isAutenticado() {
        return autenticado;
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
     * Metodo para obtener la lista de empleados del concesionario
     * @return Lista de empleados del concesionario
     */
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    /**
     * Metodo para obtener la lista de administradores del concesionario
     * @return Lista de administradores del concesionario
     */
    public List<Administrador> getListaAdministradores() {
        return listaAdministradores;
    }
    /**
     * Metodo para obtener la lista de clientes del concesionario
     * @return Lista de clientes del concesionario
     */
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }
    /**
     * Metodo para obtener la lista de vehiculos del concesionario
     * @return Lista de vehiculos del concesionario
     */
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    /**
     * Metodo para modificar el nombre del concesionario
     * @param nombre Nuevo nombre del concesionario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo para modificar la contraseña del concesionario
     * @param password Nueva contraseña del concesionario
     */
    public void setPassword(int password) {
        this.password = password;
    }
    /**
     * Metodo para modificar si el concesionario esta autenticado o no
     * @param autenticado Nuevo booleano si el concesionario esta autenticado o no
     */
    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
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
     * Metodo para modificar la lista de empleados del concesionario
     * @param listaEmpleados Nueva lista de empleados del concesionario
     */
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    /**
     * Metodo para modificar la lista de administradores del concesionario
     * @param listaAdministradores Nueva lista de administradores del concesionario
     */
    public void setListaAdministradores(List<Administrador> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }
    /**
     * Metodo para modificar la lista de clientes del concesionario
     * @param listaClientes Nueva lista de clientes del concesionario
     */
    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    /**
     * Metodo para modificar la lista de vehiculos del concesionario
     * @param listaVehiculos Nueva lista de vehiculos del concesionario
     */
    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    /**
     * Metodo para agregar una sede a la lista de sedes del concesionario
     * @param sede Sede que se busca agregar a la lista de sedes del concesionario
     * @return Booleano sobre si se pudo agregar o no la sede
     */
    public boolean agregarSede(Sede sede){
        boolean accion = false;
        if (!verificarSede(sede.getDireccion(), sede.getCiudad())) {
            listaSedes.add(sede);
            accion = true;
        }
        return accion;
    }
    /**
     * Metodo para verificar si una direccion y ciudad son iguales al de una sede en la lista de sedes del concesionario
     * @param direccion Direccion que se verificara
     * @param ciudad Ciudad que se verificara
     * @return Boolean sobre si estos datos son o no iguales al de una sede en la lista de sedes del concesionario
     */
    public boolean verificarSede(String direccion, Ciudad ciudad){
        boolean esRepetido = false;
        if (isAutenticado()) {
            for (Sede sede : listaSedes) {
                if (sede.getDireccion().equals(direccion) && sede.getCiudad().equals(ciudad)) {
                    esRepetido = true;
                    break;
                }
            }
        }
        return esRepetido;
    }
    /**
     * Metodo para actualizar los datos de una sede si corresponde a un codigo entregado
     * @param codigo Codigo de la sede a verificar
     * @param actualizado Sede con los datos nuevos
     * @return Booleanos sobre si se pudo actualizar o no
     */
    public boolean actualizarSede(int codigo, Sede actualizado) {
        boolean accion = false;
        if (isAutenticado()) {
            for (Sede sede : listaSedes) {
                if (sede.getCodigo() == codigo) {
                    sede.setDireccion(actualizado.getDireccion());
                    sede.setCiudad(actualizado.getCiudad());
                    accion = true;
                    break;
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para eliminar una sede de la lista de sedes del concesionario si no tiene nada dentro de ella
     * @param codigo Codigo de la sede a eliminar
     * @return Booleano sobre si se pudo eliminar la sede o no
     */
    public boolean eliminarSede(int codigo){
        boolean accion = false;
        if (isAutenticado()) {
            for (Sede sede : listaSedes) {
                if (sede.getCodigo() == codigo) {
                    if (verificarSedeVacia(sede)) {
                        listaSedes.remove(sede);
                        accion = true;
                        break;
                    } 
                }
            }
        }
        return accion;
    }
    /**
     * Metodo para verificar si una sede esta totalmente vacia
     * @param sede Sede a verificar
     * @return Booleano sobre si la sede esta totalmente vacio o no
     */
    public boolean verificarSedeVacia(Sede sede){
        boolean accion = false;
        if (sede.getListaVehiculos().isEmpty() && sede.getListaEmpleados().isEmpty() && sede.getListaVentas().isEmpty() && sede.getListaAlquileres().isEmpty() && sede.getListaCompras().isEmpty()) {
            accion = true;
        }
        return accion;
    }

    /**
     * Metodo para autenticar la contraseña de el concesionario
     * @param passwordDada Contraseña a verificar
     * @return Booleano sobre si la autenticacion fue lograda o no
     */
    public boolean autenticar(int passwordDada){
        if (passwordDada == password) {
            setAutenticado(true);
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Metodo para cerrar la sesion del concesionario
     */
    public void cerrarSesion(){
        setAutenticado(false);
    }

    public boolean agregarAdministrador(Administrador administrador){
        boolean accion = false;
        if (!verificarPersona(administrador.getIdentificacion())) {
            listaAdministradores.add(administrador);
            administrador.getSede().setAdministrador(administrador);
            accion = true;
        }
        return accion;
    }
    public boolean actualizarAdministrador(String identificacion, Administrador administradorNuevo){
        boolean accion = false;
        for (Administrador administrador : listaAdministradores) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                if (administrador.getSede().equals(administradorNuevo.getSede())) {
                    administrador.getSede().setAdministrador(administradorNuevo);
                }
                else{
                    administrador.getSede().setAdministrador(null);
                    administradorNuevo.getSede().setAdministrador(administradorNuevo);
                }
            }
        }
        return accion;
    }
    public boolean eliminarAdministrador(String identificacion){
        boolean accion = false;
        return accion;
    }
    /**
     * Metodo para verificar si existe una persona con la misma identificacion administrada en la lista de empleados, administradores o clientes del concesionario
     * @param identificacion Identificacion a verificar
     * @return Booleano sobre si existe una persona con esta condicion o no
     */
    public boolean verificarPersona(String identificacion){
        boolean accion = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        for (Cliente cliente : listaClientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        for (Administrador administrador : listaAdministradores) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        return accion;
    }
}