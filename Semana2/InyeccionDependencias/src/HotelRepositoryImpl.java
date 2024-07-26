
public class HotelRepositoryImpl implements HotelRepository {
    
	@Override
    public void guardarReserva(Reserva reserva) {
        System.out.println("Reserva guardada: " + reserva);
    }
}
