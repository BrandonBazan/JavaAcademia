
public class EmpleadoPorHora extends Empleado{
	
	private double tarifaPorHora;
    private int horasTrabajadas;
    
	public EmpleadoPorHora(String nombre, double tarifaPorHora, int horasTrabajadas) {
		super(nombre);
		this.tarifaPorHora = tarifaPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularPago() {
		return tarifaPorHora*horasTrabajadas;
	}

	@Override
	public String toString() {
		return "EmpleadoPorHora [" + super.toString() + " tarifaPorHora=" + tarifaPorHora + ", horasTrabajadas=" + horasTrabajadas
				+ ", calcularPago()=" + calcularPago() + "]";
	}

	
	
	
    
    

}
