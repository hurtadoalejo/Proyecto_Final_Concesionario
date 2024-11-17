package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Detalle_compraTest {
    
    /**
     * Metodo para testear que un detalle de compra si calcule el subtotal correctamente
     */
    @Test
    public void testCalcularSubtotal(){
        Detalle_compra detalle_compra = new Detalle_compra(null, 300000, null, false);
        assertEquals(300000, detalle_compra.getSubtotal());
    }
}
