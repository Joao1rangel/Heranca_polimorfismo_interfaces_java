public class Principal7 {
    public static void main(String[] args) {
        Reserva r = new Reserva();

        r.reservar();
        r.reservar("15/05/2026");
        r.reservar("15/05/2026", 8);

        ReservaVip vip = new ReservaVip();
        vip.reservar();
    }

}
