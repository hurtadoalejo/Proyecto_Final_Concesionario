package co.edu.uniquindio.poo;

public class Sedan extends Vehiculo_hibrido{
    private int numPasajeros, numPuertas, numBolsasAire;
    private double capacidadMaletero;
    private boolean tieneAireAcondicionado, tieneCamaraReversa, tieneVelocidadCrucero, tieneABS, tieneSensorColision, tieneSensorTraficoCruzado, tieneAsistentePermanenciaCarril;
    
    /**
     * 
     * @param placa Placa de la sedan a crear
     * @param marca Marca de la sedan a crear
     * @param estadoVehiculo Estado de la sedan a crear
     * @param modelo Modelo de la sedan a crear
     * @param cantidadCambios Cantidad de cambios de la sedan a crear
     * @param velocidadMax Velocidad maxima de la sedan a crear
     * @param cilindraje Cilindraje de la sedan a crear
     * @param tipoTransmision Tipo de transmision de la sedan a crear
     * @param tipoUso Tipo de uso de la sedan a crear
     * @param esEnchufable Booleano sobre si la sedan a crear es enchufable o no
     * @param esHibridoLigero Booleano sobre si la sedan a crear es hibrido ligero o no
     * @param numPasajeros Numero de pasajeros de la sedan a crear
     * @param numPuertas Numero de puertas de la sedan a crear
     * @param numBolsasAire Numero de bolsas de aire de la sedan a crear
     * @param capacidadMaletero Capacidad de maletero de la sedan a crear
     * @param tieneAireAcondicionado Booleano sobre si la sedan a crear tiene aire acondicionado o no
     * @param tieneCamaraReversa Booleano sobre si la sedan a crear tiene camara de reversa o no
     * @param tieneVelocidadCrucero Booleano sobre si la sedan a crear tiene velocidad de crucero o no
     * @param tieneABS Booleano sobre si la sedan a crear tiene ABS o no
     * @param tieneSensorColision Booleano sobre si la sedan a crear tiene sensor de colision o no
     * @param tieneSensorTraficoCruzado Booleano sobre si la sedan a crear tiene sensor de trafico cruzado o no
     * @param tieneAsistentePermanenciaCarril Booleano sobre si la sedan a crear tiene asistente de permanencia de carril o no
     */
    public Sedan(String placa, String marca, Estado_vehiculo estadoVehiculo, int modelo, int cantidadCambios, double velocidadMax, double cilindraje, Tipo_transmision tipoTransmision, Tipo_uso tipoUso, boolean esEnchufable, boolean esHibridoLigero, int numPasajeros, int numPuertas, int numBolsasAire, double capacidadMaletero, boolean tieneAireAcondicionado, boolean tieneCamaraReversa, boolean tieneVelocidadCrucero, boolean tieneABS, boolean tieneSensorColision, boolean tieneSensorTraficoCruzado, boolean tieneAsistentePermanenciaCarril) {
        super(placa, marca, estadoVehiculo, modelo, cantidadCambios, velocidadMax, cilindraje, tipoTransmision, tipoUso, esEnchufable, esHibridoLigero);
        this.numPasajeros = numPasajeros;
        this.numPuertas = numPuertas;
        this.numBolsasAire = numBolsasAire;
        this.capacidadMaletero = capacidadMaletero;
        this.tieneAireAcondicionado = tieneAireAcondicionado;
        this.tieneCamaraReversa = tieneCamaraReversa;
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
        this.tieneABS = tieneABS;
        this.tieneSensorColision = tieneSensorColision;
        this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
        this.tieneAsistentePermanenciaCarril = tieneAsistentePermanenciaCarril;
    }

    /**
     * Metodo para obtener el numero de pasajeros del sedan
     * @return Numero de pasajeros del sedan
     */
    public int getNumPasajeros() {
        return numPasajeros;
    }
    /**
     * Metodo para obtener el numero de puertas del sedan
     * @return Numero de puertas del sedan
     */
    public int getNumPuertas() {
        return numPuertas;
    }
    /**
     * Metodo para obtener el numero de bolsas de aire del sedan
     * @return Numero de bolsas de aire del sedan
     */
    public int getNumBolsasAire() {
        return numBolsasAire;
    }
    /**
     * Metodo para obtener la capacidad del maletero del sedan
     * @return Capacidad del maletero del sedan
     */
    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }
    /**
     * Metodo para saber si el sedan tiene aire acondicionado o no
     * @return Booleano sobre si el sedan tiene aire acondicionado o no
     */
    public boolean isTieneAireAcondicionado() {
        return tieneAireAcondicionado;
    }
    /**
     * Metodo para saber si el sedan tiene camara de reversa o no
     * @return Booleano sobre si el sedan tiene camara de reversa o no
     */
    public boolean isTieneCamaraReversa() {
        return tieneCamaraReversa;
    }
    /**
     * Metodo para saber si el sedan tiene velocidad de crucero o no
     * @return Booleano sobre si el sedan tiene velocidad de crucero o no
     */
    public boolean isTieneVelocidadCrucero() {
        return tieneVelocidadCrucero;
    }
    /**
     * Metodo para saber si el sedan tiene abs o no
     * @return Booleano sobre si el sedan tiene abs o no
     */
    public boolean isTieneABS() {
        return tieneABS;
    }
    /**
     * Metodo para saber si el sedan tiene sensor de colision o no
     * @return Booleano sobre si el sedan tiene sensor de colision o no
     */
    public boolean isTieneSensorColision() {
        return tieneSensorColision;
    }
    /**
     * Metodo para saber si el sedan tiene sensor de trafico cruzado o no
     * @return Booleano sobre si el sedan tiene sensor de trafico cruzado o no
     */
    public boolean isTieneSensorTraficoCruzado() {
        return tieneSensorTraficoCruzado;
    }
    /**
     * Metodo para saber si el sedan tiene asistente de permanencia de carril o no
     * @return Booleano sobre si el sedan tiene asistente de permanencia de carril o no
     */
    public boolean isTieneAsistentePermanenciaCarril() {
        return tieneAsistentePermanenciaCarril;
    }

    /**
     * 
     * @param numPasajeros
     */
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    public void setNumBolsasAire(int numBolsasAire) {
        this.numBolsasAire = numBolsasAire;
    }
    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }
    public void setTieneAireAcondicionado(boolean tieneAireAcondicionado) {
        this.tieneAireAcondicionado = tieneAireAcondicionado;
    }
    public void setTieneCamaraReversa(boolean tieneCamaraReversa) {
        this.tieneCamaraReversa = tieneCamaraReversa;
    }
    public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
        this.tieneVelocidadCrucero = tieneVelocidadCrucero;
    }
    public void setTieneABS(boolean tieneABS) {
        this.tieneABS = tieneABS;
    }
    public void setTieneSensorColision(boolean tieneSensorColision) {
        this.tieneSensorColision = tieneSensorColision;
    }
    public void setTieneSensorTraficoCruzado(boolean tieneSensorTraficoCruzado) {
        this.tieneSensorTraficoCruzado = tieneSensorTraficoCruzado;
    }
    public void setTieneAsistentePermanenciaCarril(boolean tieneAsistentePermanenciaCarril) {
        this.tieneAsistentePermanenciaCarril = tieneAsistentePermanenciaCarril;
    }
}