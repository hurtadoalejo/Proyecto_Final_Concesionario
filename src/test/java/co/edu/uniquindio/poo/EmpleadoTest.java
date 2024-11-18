package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class EmpleadoTest {
    
    /**
     * Metodo para testear que se autentique el empleado correctamente
     */
    @Test
    public void testAutenticarEmpleado(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        assertTrue(empleado.isAutenticado());
    }

    /**
     * Metodo para testear que se cierre la sesion de un empleado
     */
    @Test
    public void testCerrarSesion(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.cerrarSesion();
        assertFalse(empleado.isAutenticado());
    }

    /**
     * Metodo para testear que se agregue un cliente correctamente
     */
    @Test
    public void testAgregarCliente(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        assertEquals(1, concesionario.getListaClientes().size());
    }

    /**
     * Metodo para testear si existe un cliente con la misma cedula que una dado
     */
    @Test
    public void testVerificarCliente(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        assertTrue(empleado.verificarCliente("1234"));
    }

    /**
     * Metodo para testear si existe una persona con la misma cedula que una dada
     */
    @Test
    public void testVerificarPersona(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        assertTrue(empleado.verificarPersona("1092850037"));
    }

    /**
     * Metodo para testear si se actualiza un cliente correctamente
     */
    @Test
    public void testActualizarCliente(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Cliente cliente2 = new Cliente("Daniel", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.actualizarCliente("1234", cliente2);
        assertEquals("Daniel", cliente.getNombre());
    }

    /**
     * Metodo para testear que se elimine un cliente correctamente
     */
    @Test
    public void testEliminarCliente(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.eliminarCliente("1234");
        assertEquals(0, concesionario.getListaClientes().size());
    }

    /**
     * Metodo para testear que se agregue un vehiculo correctamente
     */
    @Test
    public void testAgregarVehiculo(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        assertEquals(1, sede.getListaVehiculos().size());
    }

    /**
     * Metodo para testear que se verifique si existe un vehiculo en el concesionario con la misma placa que una dada
     */
    @Test
    public void testVerificarVehiculo(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        assertTrue(empleado.verificarVehiculo("VAD92"));
    }

    /**
     * Metodo para testear que se actualice correctamente un vehiculo
     */
    @Test
    public void testActualizarVehiculo(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Motocicleta motocicleta2 = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.USADO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.actualizarVehiculo("VAD92", motocicleta2);
        assertEquals(motocicleta2, sede.getListaVehiculos().get(0));
    }

    /**
     * Metodo para testear que se elimine un vehiculo correctamente
     */
    @Test
    public void testEliminarVehiculo(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.eliminarVehiculo("VAD92");
        assertEquals(0, sede.getListaVehiculos().size());
    }

    /**
     * Metodo para testear que se agregue una venta correctamente
     */
    @Test
    public void testAgregarVenta(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Venta venta = new Venta(2, empleado, cliente, motocicleta, 350000, LocalDate.of(2024, 11, 24), sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarVenta(venta);
        assertEquals(1, sede.getListaVentas().size());
    }

    /**
     * Metodo para testear que se verifique si existe una venta con el mismo codigo que una dado en la sede del empleado
     */
    @Test
    public void testVerificarVenta(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Venta venta = new Venta(2, empleado, cliente, motocicleta, 350000, LocalDate.of(2024, 11, 24), sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarVenta(venta);
        assertTrue(empleado.verificarVenta(2));
    }

    /**
     * Metodo para testear que se elimine una venta correctamente
     */
    @Test
    public void testEliminarVenta(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Venta venta = new Venta(2, empleado, cliente, motocicleta, 350000, LocalDate.of(2024, 11, 24), sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarVenta(venta);
        empleado.eliminarVenta(2);
        assertEquals(0, sede.getListaVentas().size());
    }

    /**
     * Metodo para testear que se agregue un alquiler correctamente
     */
    @Test
    public void testAgregarAlquiler(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, sede);
        Alquiler alquiler = new Alquiler(2, cliente, motocicleta, empleado, LocalDate.of(2024, 11, 24), 350000, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarAlquiler(alquiler);
        assertEquals(1, sede.getListaAlquileres().size());
    }

    /**
     * Metodo para testear si existe un alquiler con el mismo codigo que uno dado
     */
    @Test
    public void testVerificarAlquiler(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, sede);
        Alquiler alquiler = new Alquiler(2, cliente, motocicleta, empleado, LocalDate.of(2024, 11, 24), 350000, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarAlquiler(alquiler);
        assertTrue(empleado.verificarAlquiler(2));
    }

    /**
     * Metodo para testear que se elimine un alquiler correctamente
     */
    @Test
    public void testEliminarAlquiler(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, sede);
        Alquiler alquiler = new Alquiler(2, cliente, motocicleta, empleado, LocalDate.of(2024, 11, 24), 350000, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarAlquiler(alquiler);
        empleado.eliminarAlquiler(2);
        assertEquals(0, sede.getListaAlquileres().size());
    }

    /**
     * Metodo para testear que se entregue un alquiler correctamente
     */
    @Test
    public void testEntregarAlquiler(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, sede);
        Alquiler alquiler = new Alquiler(2, cliente, motocicleta, empleado, LocalDate.of(2024, 11, 24), 350000, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarAlquiler(alquiler);
        empleado.entregarAlquiler(2, LocalDate.of(2024, 11, 28));
        assertEquals(Estado_alquiler.PAGADO, alquiler.getEstadoAlquiler());
    }

    /**
     * Metodo para testear que se actualice un alquiler correctamente
     */
    @Test
    public void testActualizarAlquiler(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, sede);
        Alquiler alquiler = new Alquiler(2, cliente, motocicleta, empleado, LocalDate.of(2024, 11, 24), 350000, sede);
        Alquiler alquiler2 = new Alquiler(2, cliente, motocicleta, empleado, LocalDate.of(2024, 10, 24), 350000, sede);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.agregarAlquiler(alquiler);
        empleado.actualizarAlquiler(2, alquiler2);
        assertEquals(LocalDate.of(2024, 10, 24), alquiler.getFechaAlquiler());
    }

    /**
     * Metodo para testear que se agregue una compra correctamente
     */
    @Test
    public void testAgregarCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Compra compra = new Compra(2, empleado, cliente, sede, LocalDate.of(2024, 10, 24));
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarCompra(compra);
        assertEquals(1, sede.getListaCompras().size());
    }

    /**
     * Metodo para testear si existe una compra con el mismo codigo que uno dado
     */
    @Test
    public void testVerificarCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Compra compra = new Compra(2, empleado, cliente, sede, LocalDate.of(2024, 10, 24));
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarCompra(compra);
        assertTrue(empleado.verificarCompra(2));
    }

    /**
     * Metodo para testear que se elimine una compra correctamente
     */
    @Test
    public void testEliminarCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Compra compra = new Compra(2, empleado, cliente, sede, LocalDate.of(2024, 10, 24));
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarCompra(compra);
        empleado.eliminarCompra(2);
        assertEquals(0, sede.getListaCompras().size());
    }

    /**
     * Metodo para testear que se devuelvan los vehiculos de una compra correctamente
     */
    @Test
    public void testDevolverVehiculos(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Compra compra = new Compra(2, empleado, cliente, sede, LocalDate.of(2024, 10, 24));
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarVehiculo(motocicleta);
        empleado.devolverVehiculos(compra.getListaDetallesCompra());
        assertEquals(0, sede.getListaCompras().size());
    }

    /**
     * Metodo para testear que se concrete una compra correctamente
     */
    @Test
    public void testConcretarCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Compra compra = new Compra(2, empleado, cliente, sede, LocalDate.of(2024, 10, 24));
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarCompra(compra);
        empleado.concretarCompra(2);
        assertTrue(compra.isConcretada());
    }

    /**
     * Metodo para testear que se actualice una compra correctamente
     */
    @Test
    public void testActualizarCompra(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Cliente cliente = new Cliente("Raul", "1234", "raul@gmail.com");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Compra compra = new Compra(2, empleado, cliente, sede, LocalDate.of(2024, 10, 24));
        Compra compra2 = new Compra(2, empleado, cliente, sede, LocalDate.of(2024, 11, 24));
        Detalle_compra detalle_compra = new Detalle_compra(motocicleta, 250000, compra, true);
        compra.agregarDetalleCompra(detalle_compra);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.agregarCliente(cliente);
        empleado.agregarCompra(compra);
        empleado.actualizarCompra(2, compra2);
        assertEquals(LocalDate.of(2024, 11, 24), compra.getFechaCompra());
    }

    /**
     * Metodo para testear que se recuperen las credenciales de un empleado
     */
    @Test
    public void testRecuperarCredencialesEmpleado(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Empleado empleado = new Empleado("Veronica", "25024", "vero@gmail.com", 450000, "vero", 2411, concesionario, sede, "monalisa");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        administrador.autenticar("alejo", 2911);
        administrador.agregarEmpleado(empleado);
        empleado.autenticar("vero", 2411);
        empleado.recuperarCredenciales("monalisa", "vero", 1520);
        assertEquals(1520, empleado.getPassword());
    }
}