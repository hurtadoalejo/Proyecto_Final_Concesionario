package co.edu.uniquindio.poo;

public class Detalle_venta {
    private Vehiculo vehiculo;
    private double precioVehiculo, subtotal;
    private Venta venta;

    /**
     * Metodo constructor de la clase del detalle de venta
     * @param vehiculo Vehiculo del detalle de venta a crear
     * @param precioVehiculo Precio del vehiculo del detalle de venta a crear
     * @param venta Venta del detalle de venta a crear
     */
    public Detalle_venta(Vehiculo vehiculo, double precioVehiculo, Venta venta) {
        this.vehiculo = vehiculo;
        this.precioVehiculo = precioVehiculo;
        this.venta = venta;
        this.subtotal = calcularSubtotal();
    }

    /**
     * Metodo para calcular el total del detalle de venta
     * @return Subtotal del detalle de venta creado
     */ 
    public double calcularSubtotal(){
        double subtotal = precioVehiculo;
        return subtotal;
    }

    /**
     * Metodo para obtener el vehiculo del detalle de venta
     * @return Vehiculo del detalle de venta
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    /**
     * Metodo para obtener el precio del vehiculo del detalle de venta
     * @return Precio del vehiculo del detalle de venta
     */
    public double getPrecioVehiculo() {
        return precioVehiculo;
    }
    /**
     * Metodo para obtener la venta del detalle de venta
     * @return Venta del detalle de venta
     */
    public Venta getVenta() {
        return venta;
    }
    /**
     * Metodo para obtener el subtotal del detalle de venta
     * @return Subtotal del detalle de venta
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Metodo para modificar el vehiculo del detalle de venta
     * @param vehiculo Nuevo vehiculo del detalle de venta
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    /**
     * Metodo para modificar el precio del vehiculo del detalle de venta
     * @param precioVehiculo Nuevo precio del vehiculo del detalle de venta
     */
    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }
    /**
     * Metodo para modificar la venta del detalle de venta
     * @param venta Nueva venta del detalle de venta
     */
    public void setVenta(Venta venta) {
        this.venta = venta;
    }
    /**
     * Metodo para modificar el subtotal del detalle de venta
     * @param subtotal Nuevo subtotal del detalle de venta
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}