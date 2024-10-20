package co.edu.uniquindio.poo;

public class Sede {
    private String direccion;
    private String ciudad;
    private double dineroGenerado;
    private double dineroGastado;
    private double dineroGanadoNeto;
    
    /**
     * Metodo constructor de la clase Sede
     * @param direccion Direccion de la sede a crear
     * @param ciudad Ciudad de la sede a crear
     */
    public Sede(String direccion, String ciudad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.dineroGenerado = 0;
        this.dineroGastado = 0;
        this.dineroGanadoNeto = 0;
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
    public String getCiudad() {
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
    public void setCiudad(String ciudad) {
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
     * Metodo para obtener la informacion de la sede
     * @return Informacion de la sede
     */
    @Override
    public String toString() {
        String info = "";
        return info;
    }
}