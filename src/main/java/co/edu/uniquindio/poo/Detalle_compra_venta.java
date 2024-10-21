package co.edu.uniquindio.poo;

public class Detalle_compra_venta {
    private Vehiculo vehiculo;
    private double precioVehiculo, subtotal;
    private Compra compra;

    /**
     * Metodo constructor de la clase del detalle de compra
     * @param vehiculo Vehiculo del detalle de compra a crear
     * @param precioVehiculo Precio del vehiculo del detalle de compra a crear
     * @param compra Compra del detalle de compra a crear
     */
    public Detalle_compra(Vehiculo vehiculo, double precioVehiculo, Compra compra) {
        this.vehiculo = vehiculo;
        this.precioVehiculo = precioVehiculo;
        this.compra = compra;
        this.subtotal = calcularSubtotal();
    }

    public double calcularSubtotal(){
        double subtotal = precioVehiculo;
        return subtotal;
    }

    /**
     * Metodo para obtener el vehiculo del detalle de compra
     * @return Vehiculo del detalle de compra
     */
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    /**
     * Metodo para obtener el precio del vehiculo del detalle de compra
     * @return Precio del vehiculo del detalle de compra
     */
    public double getPrecioVehiculo() {
        return precioVehiculo;
    }
    /**
     * Metodo para obtener la compra del detalle de compra
     * @return Compra del detalle de compra
     */
    public Compra getCompra() {
        return compra;
    }
    /**
     * Metodo para obtener el subtotal del detalle de compra
     * @return Subtotal del detalle de compra
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * Metodo para modificar el vehiculo del detalle de compra
     * @param vehiculo Nuevo vehiculo del detalle de compra
     */
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    /**
     * Metodo para modificar el precio del vehiculo del detalle de compra
     * @param precioVehiculo Nuevo precio del vehiculo del detalle de compra
     */
    public void setPrecioVehiculo(double precioVehiculo) {
        this.precioVehiculo = precioVehiculo;
    }
    /**
     * Metodo para modificar la compra del detalle de compra
     * @param compra Nueva compra del detalle de compra
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
    /**
     * Metodo para modificar el subtotal del detalle de compra
     * @param subtotal Nuevo subtotal del detalle de compra
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * Metodo para obtener la informacion del detalle de compra
     * @return Informacion del detalle de compra
     */
    @Override
    public String toString() {
        String info = "";
        return info;
    }
}