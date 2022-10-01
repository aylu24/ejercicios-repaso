public class Vehiculo {

    private String marca;
    private int anio;
    private double motor;
    private String tipoCombustible;
    private String tipoAutomovil;
    private byte numPuertas;
    private byte numAsientos;
    private double velocidadMaxima;
    private String color;
    private double velocidadActual;

    public Vehiculo(){

    }

    public Vehiculo(String marca, int anio, double motor, String tipoCombustible, String tipoAutomovil, byte numPuertas,
                    byte numAsientos, double velocidadMaxima, String color, double velocidadActual) {
        this.marca= marca;
        this.anio = anio;
        this.motor= motor;
        this.tipoCombustible=tipoCombustible;
        this.tipoAutomovil=tipoAutomovil;
        this.numPuertas=numPuertas;
        this.numAsientos=numAsientos;
        this.velocidadMaxima=velocidadMaxima;
        this.color=color;
        this.velocidadActual=velocidadActual;
    }
    public void acelerar( double velocidadAincrementar){
        double nuevaVelocidad = velocidadActual + velocidadAincrementar;
        if (nuevaVelocidad > velocidadMaxima){
            System.out.println(" no se puede acelerar a mas de:  " + velocidadMaxima);
        }else {
            velocidadActual = nuevaVelocidad;
        }

    }
    public void desacelerar (double velocidadADecrementar ){
        double nuevaVelocidad = velocidadActual - velocidadADecrementar;
        if (nuevaVelocidad >= 0 ){
            velocidadActual = nuevaVelocidad;
        }else {
            System.out.println("No se puede desacelerar a una velocidad negativa");
        }
    }
    public void frenar(){
        velocidadActual =0;
    }
    public double calcularTiempoEstimadoLlegada(double distanciaARecorrer){
        return distanciaARecorrer / velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public byte getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(byte numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public byte getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(byte numAsientos) {
        this.numAsientos = numAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


}
