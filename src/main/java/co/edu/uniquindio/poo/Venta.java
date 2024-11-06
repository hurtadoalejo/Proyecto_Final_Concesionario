package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Venta {
    private int codigo;
    private double totalVenta;
    private Empleado empleado;
    private Cliente cliente;
    private List<Detalle_venta> listaDetallesVenta;

    /**
     * Metodo constructor de la clase venta
     * @param codigo Codigo de la venta a crear
     * @param empleado Empleado de la venta a crear
     * @param cliente Cliente de la venta a crear
     */
    public Compra_venta(int codigo, Empleado empleado, Cliente cliente) {
        this.codigo = codigo;
        this.empleado = empleado;
        this.cliente = cliente;
        this.totalVenta = 0;
        this.listaDetallesVenta = new LinkedList<>();
    }

    /**
     * Metodo para calcular el total de la venta
     * @return Total de la venta
     */
    public double calcularTotal(){
        double total = 0;
        for (Detalle_compra_venta detalleTemporal : listaDetallesVenta) {
            total += detalleTemporal.getSubtotal();
        }
        return total;
    }

    /**
     * Metodo para obtener el codigo de la venta
     * @return Codigo de la venta
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener el empleado de la venta
     * @return Empleado de la venta
     */
    public Empleado getEmpleado() {
        return empleado;
    }
    /**
     * Metodo para obtener el cliente de la venta
     * @return Cliente de la venta
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Metodo para obtener el total de la venta
     * @return Total de la venta
     */
    public double getTotalVenta() {
        return totalVenta;
    }
    /**
     * Metodo para obtener la lista de detalles de venta
     * @return Lista de detalles de venta
     */
    public List<Detalle_venta> getListaDetallesVenta() {
        return listaDetallesVenta;
    }

    /**
     * Metodo para modificar el codigo de la venta
     * @param codigo Nuevo codigo de la venta
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar el empleado de la venta
     * @param empleado Nuevo empleado de la venta
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo para modificar el cliente de la venta
     * @param cliente Nuevo cliente de la venta
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo para modificar el total de la venta
     * @param totalVenta Nuevo total de la venta
     */
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    /**
     * Metodo para modificar la lista de detalles de venta
     * @param listaDetallesCompraVenta Nueva lista de detalles de venta
     */
    public void setListaDetallesVenta(List<Detalle_venta> listaDetallesVenta) {
        this.listaDetallesVenta = listaDetallesVenta;
    }
}