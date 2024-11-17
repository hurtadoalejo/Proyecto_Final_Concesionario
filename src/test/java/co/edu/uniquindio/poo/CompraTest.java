package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class CompraTest {

    /**
     * Metodo para testear que una compra agregue un detalle de compra correctamente
     */
    @Test
    public void testAgregarDetalleCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        LocalDate fechaCompra = LocalDate.of(2024, 11, 29);
        Compra compra = new Compra(25, empleado, cliente, sede, fechaCompra);
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        List<Detalle_compra> listaEsperada = new LinkedList<>();
        listaEsperada.add(detalle_compra);
        assertIterableEquals(listaEsperada, compra.getListaDetallesCompra());
    }

    /**
     * Metodo para testear que una compra verifique un detalle de compra correctamente
     */
    @Test
    public void testVerificarDetalleCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        LocalDate fechaCompra = LocalDate.of(2024, 11, 29);
        Compra compra = new Compra(25, empleado, cliente, sede, fechaCompra);
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, false);
        assertEquals(false, compra.verificarDetalleCompra(detalle_compra));
    }

    /**
     * Metodo para testear que una compra elimine un detalle de compra correctamente
     */
    @Test
    public void testEliminarDetalleCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        LocalDate fechaCompra = LocalDate.of(2024, 11, 29);
        Compra compra = new Compra(25, empleado, cliente, sede, fechaCompra);
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        compra.eliminarDetalleCompra("VAD92");
        List<Detalle_compra> listaEsperada = new LinkedList<>();
        assertIterableEquals(listaEsperada, compra.getListaDetallesCompra());
    }

    /**
     * Metodo para testear que una compra verifique si ya existe un vehiculo con la misma placa que uno en la lista de detalles de compra 
     */
    @Test
    public void testVerificarVehiculoEnCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        LocalDate fechaCompra = LocalDate.of(2024, 11, 29);
        Compra compra = new Compra(25, empleado, cliente, sede, fechaCompra);
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        assertEquals(true, compra.verificarVehiculoEnCompra("VAD92"));
    }
}