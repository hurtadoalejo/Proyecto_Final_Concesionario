package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VentaTest {
    
    /**
     * Metodo para testear si se calcula correctamente el precio total de la venta
     */
    @Test
    public void testCalcularTotalVenta(){
        Venta venta = new Venta(0, null, null, null, 350000, null, null);
        assertEquals(350000, venta.getTotalVenta());
    }
}
