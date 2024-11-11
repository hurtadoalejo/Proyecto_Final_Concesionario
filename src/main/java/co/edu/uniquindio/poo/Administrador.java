package co.edu.uniquindio.poo;

public class Administrador extends Persona{
    private double salarioBase;
    private Sede sede;
    private String usuario;
    private int password;
    private boolean autenticado;
    private Concesionario concesionario;

    public Administrador(String nombre, String identificacion, String correo, double salarioBase, Sede sede, String usuario, int password, Concesionario concesionario) {
        super(nombre, identificacion, correo);
        this.salarioBase = salarioBase;
        this.sede = sede;
        this.usuario = usuario;
        this.password = password;
        this.autenticado = false;
        this.concesionario = concesionario;
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
     * Metodo para obtener el usuario del administrador
     * @return Usuario del administrador
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Metodo para obtener la contraseña del administrador
     * @return Contraseña del administrador
     */
    public int getPassword() {
        return password;
    }
    /**
     * Metodo para saber si el administrador esta autenticado o no
     * @return Booleano sobre si el administrador esta autenticado o no
     */
    public boolean isAutenticado() {
        return autenticado;
    }
    /**
     * Metodo para obtener el concesionario del administrador
     * @return Concesionario del administrador
     */
    public Concesionario getConcesionario() {
        return concesionario;
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
    /**
     * Metodo para modificar el usuario del administrador
     * @param usuario Nuevo usuario del administrador
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    /**
     * Metodo para modificar la contraseña del administrador
     * @param password Nueva contraseña del administrador
     */
    public void setPassword(int password) {
        this.password = password;
    }
    /**
     * Metodo para modificar si el administrador esta autenticado o no
     * @param autenticado Nuevo booleano sobre si el administrador esta autenticado o no
     */
    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }
    /**
     * Metodo para modificar el concesionario del administrador
     * @param concesionario Nuevo concesionario del administrador
     */
    public void setConcesionario(Concesionario concesionario) {
        this.concesionario = concesionario;
    }

    /**
     * Metodo para autenticar el usuario y contraseña de un administrador
     * @param usuarioDado Usuario a verificar
     * @param passwordDada Contraseña a verificar
     * @return Booleano sobre si la autenticacion fue lograda o no
     */
    public boolean autenticar(String usuarioDado, int passwordDada){
        if (usuario.equals(usuarioDado) && password == passwordDada) {
            setAutenticado(true);
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * Metodo para cerrar la sesion de un empleado
     */
    public void cerrarSesion(){
        setAutenticado(false);
    }

    /**
     * Metodo para agregar un empleado a la sede del administrador
     * @param empleado Empleado que se busca agregar
     * @return Booleano sobre si se pudo agregar el empleado o no
     */
    public boolean agregarEmpleado(Empleado empleado){
        boolean accion = false;
        if (!verificarPersona(empleado.getIdentificacion())) {
            concesionario.getListaEmpleados().add(empleado);
            sede.getListaEmpleados().add(empleado);
            accion = true;
        }
        return accion;
    }
    /**
     * Metodo para verificar si existe una persona con la misma identificacion administrada en la lista de empleados, administradores o clientes del concesionario
     * @param identificacion Identificacion a verificar
     * @return Booleano sobre si existe una persona con esta condicion o no
     */
    public boolean verificarPersona(String identificacion){
        boolean accion = false;
        for (Empleado empleado : concesionario.getListaEmpleados()) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        for (Cliente cliente : concesionario.getListaClientes()) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        for (Administrador administrador : concesionario.getListaAdministradores()) {
            if (administrador.getIdentificacion().equals(identificacion)) {
                accion = true;
                return accion;
            }
        }
        return accion;
    }
    public boolean actualizarEmpleado(String cedula, Empleado empleadoNuevo){
        boolean accion = false;
        for (Empleado empleado : concesionario.getListaEmpleados()) {
            if (empleado.getIdentificacion().equals(cedula) && empleadoNuevo.getIdentificacion().equals(cedula)) {
                empleado.setNombre(empleadoNuevo.getNombre());
                empleado.setCorreo(empleadoNuevo.getCorreo());
                empleado.setSalarioBase(empleadoNuevo.getSalarioBase());
                empleado.setUsuario(empleadoNuevo.getUsuario());
                empleado.setPassword(empleadoNuevo.getPassword());
                if (!verificarNegociosCerradosEmpleado(empleado)) {
                    empleado.setSede(empleadoNuevo.getSede());
                }
                accion = true;
                break;
            }
        }
        return accion;
    }
    public boolean verificarNegociosCerradosEmpleado(Empleado empleado){
        boolean accion = false;
        for (Compra compra : empleado.getListaCompras()) {
            if (!compra.isConcretada()) {
                return accion = true;
            }
        }
        for (Alquiler alquiler : empleado.getListaAlquileres()) {
            if (alquiler.getEstadoAlquiler().equals(Estado_alquiler.PENDIENTE)) {
                return accion = true;
            }
        }
        return accion;
    }
    public boolean eliminarEmpleado(String identificacion){
        boolean accion = false;
        for (Empleado empleado : concesionario.getListaEmpleados()) {
            if (empleado.getIdentificacion().equals(identificacion) && !verificarNegociosCerradosEmpleado(empleado)) {
                concesionario.getListaEmpleados().remove(empleado);
                empleado.getSede().getListaEmpleados().remove(empleado);
            }
        }
        return accion;
    }
}
