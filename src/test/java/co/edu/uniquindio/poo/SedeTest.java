package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SedeTest {

    /**
     * Metodo para verificar si se aumentar el dinero gastado de una sede correctamente
     */
    @Test
    public void testAumentarDineroGastado(){
        Sede sede = new Sede(25, "Cra 6 #30-24", Ciudad.QUIMBAYA);
        sede.aumentarDineroGastado(350000);
        assertEquals(350000, sede.getDineroGastado());
    }

    /**
     * Metodo para verificar si se aumentar el dinero generado de una sede correctamente
     */
    @Test
    public void testAumentarDineroGenerado(){
        Sede sede = new Sede(25, "Cra 6 #30-24", Ciudad.QUIMBAYA);
        sede.aumentarDineroGenerado(300000);
        assertEquals(300000, 300000);
    }

    /**
     * Metodo para verificar si se aumentar el dinero generado de una sede correctamente
     */
    @Test
    public void testCalcularDineroGeneradoNeto(){
        Sede sede = new Sede(25, "Cra 6 #30-24", Ciudad.QUIMBAYA);
        sede.aumentarDineroGastado(350000);
        sede.aumentarDineroGenerado(300000);
        assertEquals(-50000, sede.calcularDineroGanadoNeto());
    }
}