package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ReporteTest {

    /**
     * Metodo para testear que un reporte cuento la cantidad de compras de un empleado correctamente
     */
    @Test
    public void testContarCompras(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Motocicleta motocicleta2 = new Motocicleta("VAD92G", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        LocalDate fechaCompra = LocalDate.of(2024, 11, 20);
        Compra compra = new Compra(25, empleado, cliente, sede, fechaCompra);
        Compra compra2 = new Compra(26, empleado, cliente, sede, fechaCompra);
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        Detalle_compra detalle_compra2 = new Detalle_compra(motocicleta2, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        compra.setConcretada(true);
        compra2.agregarDetalleCompra(detalle_compra2);
        compra2.setConcretada(true);
        empleado.getListaCompras().add(compra);
        empleado.getListaCompras().add(compra2);
        Reporte reporte = new Reporte(2, LocalDate.of(2024,11, 15), LocalDate.of(2024,11, 23), empleado);
        assertEquals(2, reporte.getComprasConcretadas());
    }

    /**
     * Metodo para testear que un reporte cuento la cantidad de ventas de un empleado correctamente
     */
    @Test
    public void testContarVentas(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Motocicleta motocicleta2 = new Motocicleta("VAD92G", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        LocalDate fechaVenta = LocalDate.of(2024, 11, 20);
        Venta venta = new Venta(0, empleado, cliente, motocicleta, 250000, fechaVenta, sede);
        Venta venta2 = new Venta(2, empleado, cliente, motocicleta2, 100000, fechaVenta, sede);
        empleado.getListaVentas().add(venta);
        empleado.getListaVentas().add(venta2);
        Reporte reporte = new Reporte(2, LocalDate.of(2024,11, 15), LocalDate.of(2024,11, 23), empleado);
        assertEquals(2, reporte.getVentasConcretadas());
    }

    @Test
    public void testContarAlquileres(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, sede);
        Motocicleta motocicleta2 = new Motocicleta("VAD92G", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, sede);
        LocalDate fechaAlquiler = LocalDate.of(2024, 11, 20);
        Alquiler alquiler = new Alquiler(0, cliente, motocicleta, empleado, fechaAlquiler, 500, sede);
        alquiler.setFechaEntregaAlquiler(LocalDate.of(2024, 11, 22));
        alquiler.setEstadoAlquiler(Estado_alquiler.PAGADO);
        Alquiler alquiler2 = new Alquiler(2, cliente, motocicleta2, empleado, fechaAlquiler, 500, sede);
        alquiler2.setFechaEntregaAlquiler(LocalDate.of(2024, 11, 22));
        alquiler2.setEstadoAlquiler(Estado_alquiler.PAGADO);
        empleado.getListaAlquileres().add(alquiler);
        empleado.getListaAlquileres().add(alquiler2);
        Reporte reporte = new Reporte(2, LocalDate.of(2024,11, 15), LocalDate.of(2024,11, 23), empleado);
        assertEquals(2, reporte.getAlquileresConcretados());
    }
}