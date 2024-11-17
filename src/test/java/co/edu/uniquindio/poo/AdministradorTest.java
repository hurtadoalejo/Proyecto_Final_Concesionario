package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AdministradorTest {
    
    /**
     * Metodo para testear que se autentique un administrador correctamente
     */
    @Test
    public void testAutenticarAdmin(){
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, null, "alejo", 2911, null, "acaramelao");
        administrador.autenticar("alejo", 2911);
        assertTrue(administrador.isAutenticado());
    }

    /**
     * Metodo para testear que se cierre la sesión de un administrador correctamente 
     */
    @Test
    public void testCerrarSesionAdmin(){
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, null, "alejo", 2911, null, "acaramelao");
        administrador.autenticar("alejo", 2911);
        administrador.cerrarSesion();
        assertFalse(administrador.isAutenticado());
    }

    /**
     * Metodo para testear que se verifique si existe una persona en el concesionario con un numero de identificacion administrado
     */
    @Test
    public void testVerificarPersona(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, null, "alejo", 2911, concesionario, "acaramelao");
        concesionario.getListaAdministradores().add(administrador);
        Cliente cliente = new Cliente("Alejo", "5", "alejo@gmail.con");
        concesionario.getListaClientes().add(cliente);
        assertTrue(administrador.verificarPersona("5"));
    }

    /**
     * Metodo para testear que se pueda actualizar un empleado correctamentes
     */
    @Test
    public void testActualizarEmpleado(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.getListaAdministradores().add(administrador);
        sede.setAdministrador(administrador);
        Empleado empleado = new Empleado("Alejandro", "1092850", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        sede.getListaEmpleados().add(empleado);
        administrador.autenticar("alejo", 2911);
        Empleado empleadoNuevo = new Empleado("Alejandro Hurtado", "1092850", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        administrador.actualizarEmpleado("1092850", empleadoNuevo);
        assertEquals(empleado.getNombre(), empleadoNuevo.getNombre());
    }

    /**
     * Metodo para testear que un empleado administrado tenga negocios pendientes o no
     */
    @Test
    public void testVerificarNegociosPendientesEmpleado(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.getListaAdministradores().add(administrador);
        sede.setAdministrador(administrador);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        sede.getListaEmpleados().add(empleado);
        Cliente cliente = new Cliente("Veronica", "25024", "vero@gmail.com");
        concesionario.getListaClientes().add(cliente);
        Motocicleta motocicleta = new Motocicleta("VAD92", "Yamaha", Estado_vehiculo.NUEVO, 2024, 5, 120, 110, Tipo_transmision.MANUAL, Tipo_uso.VENTA, sede);
        Alquiler alquiler = new Alquiler(0, cliente, motocicleta, empleado, LocalDate.of(2024, 11, 24), 550, sede);
        empleado.getListaAlquileres().add(alquiler);
        assertTrue(administrador.verificarNegociosPendientesEmpleado(empleado));
    }

    /**
     * Metodo para testear que se elimine un empleado correctamente
     */
    @Test
    public void testEliminarEmpleado(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.getListaAdministradores().add(administrador);
        sede.setAdministrador(administrador);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        sede.getListaEmpleados().add(empleado);
        administrador.autenticar("alejo", 2911);
        administrador.eliminarEmpleado("1092850037");
        assertEquals(0, sede.getListaEmpleados().size());
    }

    /**
     * Metodo para testear que se recuperen las credenciales de un administrador correctamente
     */
    @Test
    public void testRecuperarCredenciales(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, null, "alejo", 2911, concesionario, "acaramelao");
        concesionario.getListaAdministradores().add(administrador);
        Administrador administrador2 = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, null, "alejis", 2911, concesionario, "acaramelao");
        administrador.autenticar("alejo", 2911);
        administrador.recuperarCredenciales("acaramelao", "alejis", 2911);
        assertEquals(administrador.getUsuario(), administrador2.getUsuario());
    }

    /**
     * Metodo para testear que se verifique si un administrador esta anclado a su sede
     */
    @Test
    public void testVerificarAdministradorAncladoSede(){
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, null, "acaramelao");
        sede.setAdministrador(administrador);
        assertEquals(sede.getAdministrador(), administrador);
    }

    /**
     * Metodo para testear que se agregue un reporte correctamente
     */
    @Test
    public void testAgregarReporte(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.getListaAdministradores().add(administrador);
        sede.setAdministrador(administrador);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        sede.getListaEmpleados().add(empleado);
        administrador.autenticar("alejo", 2911);
        Reporte reporte = new Reporte(2, LocalDate.of(2024, 11, 20), LocalDate.of(2024, 11, 24), empleado);
        administrador.agregarReporte(reporte);
        List<Reporte> listaReportesEsperada = new LinkedList<>();
        listaReportesEsperada.add(reporte);
        assertIterableEquals(listaReportesEsperada, sede.getListaReportes());
    }

    /**
     * Metodo para testear que se verifique si ya existe un reporte en la lista de reportes de la sede con el mismo codigo que uno dado
     */
    @Test
    public void testVerificarReporte(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);   
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        Reporte reporte = new Reporte(2, LocalDate.of(2024, 11, 20), LocalDate.of(2024, 11, 24), empleado);
        sede.getListaReportes().add(reporte);
        assertTrue(administrador.verificarReporte(2));
    }

    /**
     * Metodo para testear que una fecha final dada sea posterior a una fecha de inicio dada
     */
    @Test
    public void testFechasReporte(){
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, null, "alejo", 2911, null, "acaramelao");
        assertFalse(administrador.verificarFechasReporte(LocalDate.of(2024, 11, 24), LocalDate.of(2024, 11, 20)));
    }

    /**
     * Metodo para testear que se elimine un reporte correctamente
     */
    @Test
    public void testEliminarReporte(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(25, "Cra 6 #20-24", Ciudad.QUIMBAYA);
        concesionario.getListaSedes().add(sede);
        Administrador administrador = new Administrador("Alejo", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.getListaAdministradores().add(administrador);
        sede.setAdministrador(administrador);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 3500000, "alejo", 2911, concesionario, sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        sede.getListaEmpleados().add(empleado);
        administrador.autenticar("alejo", 2911);
        Reporte reporte = new Reporte(2, LocalDate.of(2024, 11, 20), LocalDate.of(2024, 11, 24), empleado);
        administrador.agregarReporte(reporte);
        administrador.eliminarReporte(2);
        assertTrue(sede.getListaReportes().isEmpty());
    }
}