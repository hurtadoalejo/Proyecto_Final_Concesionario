package co.edu.uniquindio.poo;

public class Vehiculo {
    private String placa, marca;
    private Estado_vehiculo estadoVehiculo;
    private int modelo, cantidadCambios;
    private double velocidadMax, cilindraje;
    private Tipo_transmision tipoTransmision;

    /**
     * Metodo constructor de la clase Vehiculo
     * @param placa Placa del vehiculo a crear
     * @param marca Marca del vehiculo a crear
     * @param estadoVehiculo Estado del vehiculo a crear
     * @param modelo Modelo del vehiculo a crear
     * @param cantidadCambios Cantidad de cambios del vehiculo a crear
     * @param velocidadMax Velocidad maxima del vehiculo a crear
     * @param cilindraje Cilindraje del vehiculo a crear
     * @param tipoTransmision Tipo de transmision del vehiculo a crear
     */
    public Vehiculo(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios,
            double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision) {
        this.placa = placa;
        this.marca = marca;
        this.estadoVehiculo = estadoVehiculo;
        this.modelo = modelo;
        this.cantidadCambios = cantidadCambios;
        this.velocidadMax = velocidadMax;
        this.cilindraje = cilindraje;
        this.tipoTransmision = tipoTransmision;
    }

    /**
     * Metodo para obtener la placa del vehiculo
     * @return Placa del vehiculo
     */
    public String getPlaca() {
        return placa;
    }
    /**
     * Metodo para obtener la marca del vehiculo
     * @return Marca del vehiculo
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo para obtener el estado del vehiculo
     * @return Estado del vehiculo
     */
    public Estado_vehiculo getEstadoVehiculo() {
        return estadoVehiculo;
    }
    /**
     * Metodo para obtener el modelo del vehiculo
     * @return Modelo del vehiculo
     */
    public int getModelo() {
        return modelo;
    }
    /**
     * Metodo para obtener la cantidad de cambios del vehiculo
     * @return Nueva cantidad de cambios del vehiculo
     */
    public int getCantidadCambios() {
        return cantidadCambios;
    }
    /**
     * Metodo para obtener la velocidad maxima del vehiculo
     * @return Velocidad maxima del vehiculo
     */
    public double getVelocidadMax() {
        return velocidadMax;
    }
    /**
     * Metodo para obtener el cilindraje del vehiculo
     * @return Cilindraje del vehiculo
     */
    public double getCilindraje() {
        return cilindraje;
    }
    /**
     * Metodo para obtener el tipo de transmision del vehiculo
     * @return Tipo de transmision del vehiculo
     */
    public Tipo_transmision getTipoTransmision() {
        return tipoTransmision;
    }
    
    /**
     * Metodo para modificar la placa del vehiculo
     * @param placa Nueva placa del vehiculo
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Metodo para modificar la marca del vehiculo
     * @param marca Nueva marca del vehiculo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Metodo para modificar el estado del vehiculo
     * @param estadoVehiculo Nuevo estado del vehiculo
     */
    public void setEstadoVehiculo(Estado_vehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }
    /**
     * Metodo para modificar el modelo del vehiculo
     * @param modelo Nuevo modelo del vehiculo
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    /**
     * Metodo para modificar los cambios del vehiculo
     * @param cantidadCambios Nueva cantidad de cambios del vehiculo
     */
    public void setCantidadCambios(int cantidadCambios) {
        this.cantidadCambios = cantidadCambios;
    }
    /**
     * Metodo para modificar la velocidad maxima del vehiculo
     * @param velocidadMax Nueva velocidad maxima del vehiculo
     */
    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    /**
     * Metodo para modificar el cilindraje del vehiculo
     * @param cilindraje Nuevo cilindraje del vehiculo
     */
    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }
    /**
     * Metodo para modificar el tipo de transmision del vehiculo
     * @param tipoTransmision Nuevo tipo de transmision del vehiculo
     */
    public void setTipoTransmision(Tipo_transmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }


    /**
     * Metodo para obtener la informacion del vehiculo
     * @return Informacion del vehiculo
     */
    @Override
    public String toString() {
        String info = "";
        return info;
    }
}
