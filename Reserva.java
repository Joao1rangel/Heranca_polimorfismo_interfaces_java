public class Reserva {
    public void reservar() {
        System.out.println("Reserva realizada");
    }

    public void reservar(String data) {
        System.out.printf("Reserva feita para o dia %s", data);
    }

    public  void reservar(String data, int pessoas) {
        System.out.printf("\nReserva feita para o dia %s | Mesa para %s pessoas", data, pessoas);
    }


}
