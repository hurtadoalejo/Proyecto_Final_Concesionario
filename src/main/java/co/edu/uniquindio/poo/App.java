package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        Concesionario concesionario = new Concesionario("TU CARRO", 5689);
        Sede sede = new Sede(25, "cRA 6 #11-13", Ciudad.ARMENIA);
        Sede sede2 = new Sede(2, "Nalgas de mi novia", Ciudad.QUIMBAYA);
        Administrador administrador = new Administrador("Alexito", "25024", "alex@gmail.com", 250000, sede, "alex", 555, concesionario);
        Administrador administrador2 = new Administrador("Alex", "250246", "alex@gmail.com", 250000, sede2, "alex", 555, concesionario);
        Empleado empleado = new Empleado("Alejo", "1092850037", "alejo@gmail.com", 150000, "alejohg", 25024, concesionario, sede);
        //Empleado empleado2 = new Empleado("Aleja", "25024", "aleja@gmail.com", 600000, "alejahg", 25024, concesionario, sede);
        Camioneta camioneta = new Camioneta("AHG", "Mazda", Estado_vehiculo.NUEVO, 2020, 5, 120, 200, Tipo_transmision.AUTOMATICA, Tipo_uso.VENTA, 120, 60, 4, 2, 6, 55, false, false, false, false, false, false, false, false, sede);
        Camioneta camioneta2 = new Camioneta("AHGA", "Mazda", Estado_vehiculo.NUEVO, 2020, 5, 120, 200, Tipo_transmision.AUTOMATICA, Tipo_uso.VENTA, 120, 60, 4, 2, 6, 55, false, false, false, false, false, false, false, false, sede);
        concesionario.agregarSede(sede);
        concesionario.agregarSede(sede2);
        concesionario.agregarAdministrador(administrador);
        concesionario.agregarAdministrador(administrador2);
        administrador.autenticar("alex", 555);
        administrador.agregarEmpleado(empleado);
        administrador.cerrarSesion();
        Cliente cliente = new Cliente("Vero", "2502455", "vero@gmail.com");
        empleado.autenticar("alejohg", 25024);
        empleado.agregarCliente(cliente);
        Compra compra = new Compra(5, empleado, cliente, sede);
        Detalle_compra detalleCompra = new Detalle_compra(camioneta, 350000, compra, false);
        Detalle_compra detalleCompra2 = new Detalle_compra(camioneta2, 150000, compra, true);
        compra.agregarDetalleCompra(detalleCompra);
        compra.agregarDetalleCompra(detalleCompra2);
        empleado.agregarCompra(compra);
        empleado.concretarCompra(5);
        empleado.cerrarSesion(); 
        System.out.println("Vehiculos concesionario: ");
        for (Vehiculo vehiculo : concesionario.getListaVehiculos()) {
            System.out.println(vehiculo.getPlaca());
        }
        System.out.println("Vehiculos sede 1: ");
        for (Vehiculo vehiculo : sede.getListaVehiculos()) {
            System.out.println(vehiculo.getPlaca());
        }
        System.out.println(concesionario.getListaSedes().size());
    }
}