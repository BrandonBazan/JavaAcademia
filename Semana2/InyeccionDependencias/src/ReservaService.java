
public class ReservaService {
	private final PagoService pagoService;
    private final HotelRepository hotelRepository;

    // Inyección de dependencias a través del constructor
    public ReservaService(PagoService pagoService, HotelRepository hotelRepository) {
        this.pagoService = pagoService;
        this.hotelRepository = hotelRepository;
    }

    public void realizarReserva(Reserva reserva) {
        // Procesar el pago
        pagoService.procesarPago(reserva.getMonto());

        // Guardar la reserva en el repositorio
        hotelRepository.guardarReserva(reserva);

        System.out.println("Reserva realizada exitosamente.");
    }

}
