package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ConcesionarioTest {

    /**
     * Metodo para testear que se agregue una sede correctamente
     */
    @Test
    public void testAgregarSede(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        assertEquals(1, concesionario.getListaSedes().size());
    }

    /**
     * Metodo para testear que se verifique que ya existe una sede con un codigo dado
     */
    @Test
    public void testVerificarSede(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        assertTrue(concesionario.verificarSede(24));
    }

    /**
     * Metodo para testear que se elimine una sede correctamente
     */
    @Test
    public void testEliminarSede(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.eliminarSede(24);
        assertEquals(0, concesionario.getListaSedes().size());
    }

    /**
     * Metodo para testear que se actualice una sede correctamente
     */
    @Test
    public void testActualizarSede(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Sede sede2 = new Sede(24, "Cra 6 #30-24", Ciudad.QUIMBAYA);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.actualizarSede(24, sede2);
        assertEquals(sede2.getCiudad(), sede.getCiudad());
    }

    /**
     * Metodo para testear que se verifique que una sede esta vacia
     */
    @Test
    public void testVerificarSedeVacia(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        assertTrue(concesionario.verificarSedeVacia(sede));
    }

    /**
     * Metodo para testear que se autentique el concesionario
     */
    @Test
    public void testAutenticarConcesionario(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        concesionario.autenticar(2524);
        assertTrue(concesionario.isAutenticado());
    }

    /**
     * Metodo para testear que una sede este libre de un administrador
     */
    @Test
    public void testVerificarSedeLibre(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        assertTrue(concesionario.verificarSedeLibre(sede));
    }

    /**
     * Metodo para testear que se agregue un administrador correctamente
     */
    @Test
    public void testAgregarAdministrador(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        assertEquals(1, concesionario.getListaAdministradores().size());
    }

    /**
     * Metodo para testear que se cierre la sesion correctamente
     */
    @Test
    public void testCerrarSesion(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        concesionario.autenticar(2524);
        concesionario.cerrarSesion();
        assertFalse(concesionario.isAutenticado());
    }

    /**
     * Metodo para testear que se actualice un administrador
     */
    @Test
    public void testActualizarAdministrador(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Administrador administrador2 = new Administrador("Veronica", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        concesionario.actualizarAdministrador("1092850037", administrador2);
        assertEquals("Veronica", administrador.getNombre());
    }

    /**
     * Metodo para testear que se elimine un administrador correctamente
     */
    @Test
    public void testEliminarAdministrador(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        concesionario.eliminarAdministrador("1092850037");
        assertEquals(0, concesionario.getListaAdministradores().size());
    }

    /**
     * Metodo para testear si en el concesionario existe un persona con un usuario igual que uno dado
     */
    @Test
    public void testVerificarUsuario(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        assertTrue(concesionario.verificarUsuario("alejo"));
    }

    /**
     * Metodo para testear si en el concesionario existe un persona con una identificacion igual que uno dada
     */
    @Test
    public void testVerificarPersona(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        assertTrue(concesionario.verificarPersona("1092850037"));
    }

    /**
     * Metodo para testear que se obtenga un empleado que tenga la misma identificacion que una administrada
     */
    @Test
    public void testObtenerEmpleadoPorCedula(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 350000, "alejo", 2911, concesionario,sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        assertEquals(empleado, concesionario.obtenerEmpleadoPorCedula("1092850037"));
    }

    /**
     * Metodo para testear que se cambien las credenciales del admin
     */
    @Test
    public void testCambiarCredencialesAdmin(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        concesionario.cambiarCredencialesAdmin("1092850037", "acaramelao", "alejo", 20);
        assertEquals(20, administrador.getPassword());
    }

    /**
     * Metodo para testear que se cambien las credenciales del empleado
     */
    @Test
    public void testCambiarCredencialesEmpleado(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        concesionario.autenticar(2524);
        Empleado empleado = new Empleado("Alejandro", "1092850037", "alejo@gmail.com", 350000, "alejo", 2911, concesionario,sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.cambiarCredencialesEmpleado("1092850037", "acaramelao", "alejo", 20);
        assertEquals(20, empleado.getPassword());
    }

    /**
     * Metodo para testear que se pueda obtener un administrador con un usuario y password administrados
     */
    @Test
    public void testObtenerUsuarioAdministrador(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        assertEquals(administrador, concesionario.obtenerUsuarioAdministrador("alejo", 2911));
    }

    /**
     * Metodo para testear que se pueda obtener un administrador dada una cedula
     */
    @Test
    public void testObtenerAdministradorPorCedula(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        assertEquals(administrador, concesionario.obtenerAdministradorPorCedula("1092850037"));
    }

    /**
     * Metodo para testear que se pueda obtener un empleado con un usuario y password administrados
     */
    @Test
    public void testObtenerUsuarioEmpleado(){
        Concesionario concesionario = new Concesionario("Concesionario", 2524);
        Sede sede = new Sede(24, "Cra 6 #30-24", Ciudad.ARMENIA);
        Administrador administrador = new Administrador("Alejandro", "1092850037", "alejo@gmail.com", 350000, sede, "alejo", 2911, concesionario, "acaramelao");
        Empleado empleado = new Empleado("Veronica", "25024", "alejo@gmail.com", 350000, "vero", 2911, concesionario,sede, "acaramelao");
        concesionario.getListaEmpleados().add(empleado);
        concesionario.autenticar(2524);
        concesionario.agregarSede(sede);
        concesionario.agregarAdministrador(administrador);
        assertEquals(empleado, concesionario.obtenerUsuarioEmpleado("vero", 2911));
    }
}