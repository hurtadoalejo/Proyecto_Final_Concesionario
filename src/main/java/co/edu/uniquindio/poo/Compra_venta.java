package co.edu.uniquindio.poo;
import java.util.List;
import java.util.LinkedList;

public class Compra_venta {
    private int codigo;
    private double totalCompraVenta;
    private Empleado empleado;
    private Cliente cliente;
    private List<Detalle_compra_venta> listaDetallesCompraVenta;

    /**
     * Metodo constructor de la clase compra venta
     * @param codigo Codigo de la compra venta a crear
     * @param empleado Empleado de la compra venta a crear
     * @param cliente Cliente de la compra venta a crear
     */
    public Compra_venta(int codigo, Empleado empleado, Cliente cliente) {
        this.codigo = codigo;
        this.empleado = empleado;
        this.cliente = cliente;
        this.totalCompraVenta = 0;
        this.listaDetallesCompraVenta = new LinkedList<>();
    }

    /**
     * Metodo para calcular el total de la compra venta
     * @return Ttoal de la compra venta
     */
    public double calcularTotal(){
        double total = 0;
        for (Detalle_compra_venta detalleTemporal : listaDetallesCompraVenta) {
            total += detalleTemporal.getSubtotal();
        }
        return total;
    }

    /**
     * Metodo para obtener el codigo de la compra venta
     * @return Codigo de la compra venta
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo para obtener el empleado de la compra venta
     * @return Empleado de la compra venta
     */
    public Empleado getEmpleado() {
        return empleado;
    }
    /**
     * Metodo para obtener el cliente de la compra venta
     * @return Cliente de la compra venta
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Metodo para obtener el total de la compra venta
     * @return Total de la compra venta
     */
    public double getTotalCompraVenta() {
        return totalCompraVenta;
    }
    /**
     * Metodo para obtener la lista de detalles de compra venta
     * @return Lista de detalles de compra venta
     */
    public List<Detalle_compra_venta> getListaDetallesCompraVenta() {
        return listaDetallesCompraVenta;
    }

    /**
     * Metodo para modificar el codigo de la compra venta
     * @param codigo Nuevo codigo de la compra venta
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo para modificar el empleado de la compra venta
     * @param empleado Nuevo empleado de la compra venta
     */
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    /**
     * Metodo para modificar el cliente de la compra venta
     * @param cliente Nuevo cliente de la compra venta
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo para modificar el total de la compra venta
     * @param totalCompraVenta Nuevo total de la compra venta
     */
    public void setTotalCompraVenta(double totalCompraVenta) {
        this.totalCompraVenta = totalCompraVenta;
    }
    /**
     * Metodo para modificar la lista de detalles de compra venta
     * @param listaDetallesCompraVenta Nueva lista de detalles de compra venta
     */
    public void setListaDetallesCompraVenta(List<Detalle_compra_venta> listaDetallesCompraVenta) {
        this.listaDetallesCompraVenta = listaDetallesCompraVenta;
    }

    /**
     * Metodo para obtener la informacion de la compra venta
     * @return Informacion de la compra venta
     */
    @Override
    public String toString() {
        String info = "";
        return info;
    }
}