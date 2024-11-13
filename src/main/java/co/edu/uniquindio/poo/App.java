package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("TU CARRO", 2911);
        Sede sede = new Sede(25, "cRA 6 #11-13", Ciudad.ARMENIA);
        Sede sede2 = new Sede(2, "Nalgas de mi novia", Ciudad.QUIMBAYA);
        Administrador administrador = new Administrador("Alexito", "25024", "alex@gmail.com", 250000, sede, "alex", 555, concesionario, "acaramelao");
        Administrador administrador2 = new Administrador("Alex", "250246", "alex@gmail.com", 250000, sede, "alex", 555, concesionario, "tuyo");
        Empleado empleado = new Empleado("Alejo", "1092850037", "alejo@gmail.com", 150000, "alejohg", 25024, concesionario, sede, "sol");
        //Empleado empleado2 = new Empleado("Aleja", "25024", "aleja@gmail.com", 600000, "alejahg", 25024, concesionario, sede);
        Camioneta camioneta = new Camioneta("AHG", "Mazda", Estado_vehiculo.NUEVO, 2020, 5, 120, 200, Tipo_transmision.AUTOMATICA, Tipo_uso.ALQUILER, 120, 60, 4, 2, 6, 55, false, false, false, false, false, false, false, false, sede);
        Camioneta camioneta2 = new Camioneta("AHGA", "Mazda", Estado_vehiculo.NUEVO, 2020, 5, 120, 200, Tipo_transmision.AUTOMATICA, Tipo_uso.VENTA, 120, 60, 4, 2, 6, 55, false, false, false, false, false, false, false, false, sede);
        concesionario.autenticar(2911);
        concesionario.agregarSede(sede);
        concesionario.agregarSede(sede2);
        concesionario.agregarAdministrador(administrador);
        concesionario.agregarAdministrador(administrador2);
        concesionario.cerrarSesion();
        administrador.autenticar("alex", 555);
        administrador.agregarEmpleado(empleado);
        administrador.cerrarSesion();
        Cliente cliente = new Cliente("Vero", "2502455", "vero@gmail.com");
        empleado.autenticar("alejohg", 2502);
        empleado.recuperarCredenciales("sol", "alejito", 2502);
        empleado.autenticar("alejito", 2502);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(camioneta);
        LocalDate fecha = LocalDate.of(2024, 10, 25);
        LocalDate fecha3 = LocalDate.of(2024, 10, 30);
        LocalDate fecha4 = LocalDate.of(2024, 10, 31);
        LocalDate fechaEntrega = LocalDate.of(2024, 10, 25);
        Alquiler alquiler = new Alquiler(4, cliente, camioneta, empleado, fecha, 1000, sede);
        empleado.agregarAlquiler(alquiler);
        empleado.entregarAlquiler(4, fechaEntrega);
        Compra compra = new Compra(2, empleado, cliente, sede, fecha3);
        Detalle_compra detalle_compra = new Detalle_compra(camioneta2, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        empleado.agregarCompra(compra);
        empleado.concretarCompra(2);
        empleado.cerrarSesion();
        LocalDate fechaInicio = LocalDate.of(2024, 10, 25);
        LocalDate fechaFin = LocalDate.of(2024, 10, 25);
        Reporte reporte = new Reporte(4, fechaInicio, fechaFin, empleado);
        Reporte reporte2 = new Reporte(3, fecha3, fecha4, empleado);
        administrador.autenticar("alex", 555);
        administrador.agregarReporte(reporte);
        administrador.agregarReporte(reporte2);
        administrador.eliminarEmpleado("1092850037");
        administrador.cerrarSesion();
        System.out.println(sede.getListaReportes().size());
        System.out.println(sede.getListaReportes().get(0).getAlquileresConcretados());
        System.out.println(sede.getListaReportes().get(0).getComprasConcretadas());
        System.out.println(sede.getListaReportes().get(0).getVentasConcretadas());
        System.out.println("Vehiculos concesionario: ");
        for (Vehiculo vehiculo : concesionario.getListaVehiculos()) {
            System.out.println(vehiculo.getPlaca());
        }
        System.out.println("Vehiculos sede 1: ");
        for (Vehiculo vehiculo : sede.getListaVehiculos()) {
            System.out.println(vehiculo.getPlaca());
        }
    }
}