
public class PagoServiceImpl implements PagoService {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago procesado: " + monto);
    }
}
