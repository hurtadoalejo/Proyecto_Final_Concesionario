package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Vehiculo_hibridoTest {
    
    /**
     * Metodo para testear si un vehiculo hibrido no es enchufable, no pueda ser hibrido ligero asi se haya asignado como que si es
     */
    @Test
    public void testDeterminarHibridoLigero(){
        Vehiculo_hibrido vehiculo_hibrido = new Vehiculo_hibrido("VAD92G", "Mazda", Estado_vehiculo.NUEVO, 2024, 6, 120, 300, Tipo_transmision.MANUAL, Tipo_uso.ALQUILER, false, true, null);
        assertEquals(false, vehiculo_hibrido.isEsHibridoLigero());
    }
}