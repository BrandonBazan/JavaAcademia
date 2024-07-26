
public class Reserva {
	private String tipoHabitacion;
    private double monto;

    public Reserva(String tipoHabitacion, double monto) {
        this.tipoHabitacion = tipoHabitacion;
        this.monto = monto;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Reserva [tipoHabitacion=" + tipoHabitacion + ", monto=" + monto + "]";
    }    

}
