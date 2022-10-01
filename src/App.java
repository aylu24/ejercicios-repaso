public class App {
        public static final void main(String[] args) {
            byte numPuertas = 4;
            byte numAsientos= 4;
            Vehiculo bmw = new Vehiculo("BMW" , 2017 ,2000, "GASOLINA",
                    "familiar", numPuertas, numAsientos, 260, "gris",100);
            System.out.println("Para recorrer " + 1000 + " km estimariamos un tiempo de: " + bmw.calcularTiempoEstimadoLlegada(1000));






        }

}

