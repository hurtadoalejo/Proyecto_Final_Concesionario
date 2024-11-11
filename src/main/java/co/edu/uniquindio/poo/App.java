package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("TU CARRO");
        Sede sede = new Sede(25, "cRA 6 #11-13", Ciudad.ARMENIA);
        Sede sede2 = new Sede(2, "Nalgas de mi novia", Ciudad.QUIMBAYA);
        Empleado empleado = new Empleado("Alejo", "1092850037", "alejo@gmail.com", 150000, "alejohg", 25024, concesionario, sede);
        Camioneta camioneta = new Camioneta("AHG", "Mazda", Estado_vehiculo.NUEVO, 2020, 5, 120, 200, Tipo_transmision.AUTOMATICA, Tipo_uso.VENTA, 120, 60, 4, 2, 6, 55, false, false, false, false, false, false, false, false, sede);
        //Camioneta camioneta2 = new Camioneta("AHGA", "Mazda", Estado_vehiculo.NUEVO, 2020, 5, 120, 200, Tipo_transmision.AUTOMATICA, Tipo_uso.VENTA, 120, 60, 4, 2, 6, 55, false, false, false, false, false, false, false, false, sede);
        concesionario.getListaEmpleados().add(empleado);
        concesionario.getListaSedes().add(sede);
        concesionario.getListaSedes().add(sede2);
        sede.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Vero", "25024", "vero@gmail.com");
        empleado.autenticar("alejohg", 25024);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(camioneta);
        LocalDate fecha = LocalDate.of(2024, 10, 29);
        Venta venta = new Venta(2, empleado, cliente, camioneta, 500000, fecha, sede);
        empleado.agregarVenta(venta);
        empleado.eliminarVenta(2);
        empleado.eliminarVehiculo("AHG");
        empleado.cerrarSesion(); 
        for (Vehiculo vehiculo : concesionario.getListaVehiculos()) {
            System.out.println(vehiculo.getPlaca());
        }
        System.out.println("-------------");
        for (Vehiculo vehiculo : sede.getListaVehiculos()) {
            System.out.println(vehiculo.getPlaca());
        }
        System.out.println("-------------");
        for (Vehiculo vehiculo : sede2.getListaVehiculos()) {
            System.out.println(vehiculo.getPlaca());
        }
    }
}