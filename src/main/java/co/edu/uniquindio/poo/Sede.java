package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Sede {
    private int codigo;
    private String direccion;
    private Ciudad ciudad;
    private double dineroGenerado;
    private double dineroGastado;
    private double dineroGanadoNeto;
    private List<Vehiculo> listaVehiculos;
    
    /**
     * Metodo constructor de la clase Sede
     * @param codigo Codigo de la sede a crear
     * @param direccion Direccion de la sede a crear
     * @param ciudad Ciudad de la sede a crear
     */
    public Sede(int codigo, String direccion, Ciudad ciudad) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.dineroGenerado = 0;
        this.dineroGastado = 0;
        this.dineroGanadoNeto = 0;
        this.listaVehiculos = new LinkedList<>();
    }

    /**
     * Metodo para obtener el codigo de la sede
     * @return Codigo de la sede
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener la direccion de la sede
     * @return Direccion de la sede
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo para obtener la ciudad de la sede
     * @return Ciudad de la sede
     */
    public Ciudad getCiudad() {
        return ciudad;
    }
    /**
     * Metodo para obtener el dinero generado de la sede
     * @return Dinero generado de la sede
     */
    public double getDineroGenerado() {
        return dineroGenerado;
    }
    /**
     * Metodo para obtener el dinero gastado de la sede
     * @return Dinero gastado de la sede
     */
    public double getDineroGastado() {
        return dineroGastado;
    }
    /**
     * Metodo para obtener el dinero ganado neto de la sede
     * @return Dinero ganado neto de la sede
     */
    public double getDineroGanadoNeto() {
        return dineroGanadoNeto;
    }
    /**
     * Metodo para obtener la lista de vehiculos de la sede
     * @return Lista de vehiculos de la sede
     */
    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    /**
     * Metodo para modificar el codigo de la sede
     * @param codigo Nuevo codigo de la sede
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar la direccion de la sede
     * @param direccion Nueva direccion de la sede
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Metodo para modificar la ciudad de la sede
     * @param ciudad Nueva ciudad de la sede
     */
    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
    
    /**
     * Metodo para modificar el dinero generado de la sede
     * @param dineroGenerado Nuevo dinero generado de la sede
     */
    public void setDineroGenerado(double dineroGenerado) {
        this.dineroGenerado = dineroGenerado;
    }
    /**
     * Metodo para modificar el dinero gastado de la sede
     * @param dineroGastado Nuevo dinero gastado de la empresa
     */
    public void setDineroGastado(double dineroGastado) {
        this.dineroGastado = dineroGastado;
    }
    /**
     * Metodo para modificar el dinero ganado neto de la sede
     * @param dineroGanadoNeto Nuevo dinero ganado neto de la sede
     */
    public void setDineroGanadoNeto(double dineroGanadoNeto) {
        this.dineroGanadoNeto = dineroGanadoNeto;
    }
    /**
     * Metodo para modificar la lista de vehiculos de la sede
     * @param listaVehiculos Nueva lista de vehiculos de la sede
     */
    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo){
        boolean accion = false;
        if (verificarVehiculo(vehiculo.getPlaca())) {
            listaVehiculos.add(vehiculo);
            accion = true;
        }
        return accion;
    }
    public boolean verificarVehiculo(String placa){
        boolean accion = false;
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                accion = true;
                break;
            }
        }
        return accion;
    }
    public boolean actualizarVehiculo(String placa, Vehiculo vehiculoDado){
        boolean accion = false;
        for(int a = 0; a < listaVehiculos.size(); a++) {
            if (listaVehiculos.get(a).getPlaca().equals(placa)) {
                accion = true;
                listaVehiculos.set(a, vehiculoDado);
                break;
            }
        }
        return accion;
    }
    public boolean eliminarVehiculo(String placa){
        boolean accion = false;
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                accion = true;
                listaVehiculos.remove(vehiculo);
                break;
            }
        }
        return accion;
    }
}