
public class Principal {

	public static void main(String[] args) {
		// Crear las implementaciones
        PagoService pagoService = new PagoServiceImpl();
        HotelRepository hotelRepository = new HotelRepositoryImpl();

        // Crear el servicio con inyección de dependencias manual
        ReservaService reservaService = new ReservaService(pagoService, hotelRepository);

        // Crear una reserva y procesarla
        Reserva reserva = new Reserva("Suite Deluxe", 200.00);
        reservaService.realizarReserva(reserva);

	}

}
