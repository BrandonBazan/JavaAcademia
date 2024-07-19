
public class EmpleadoContratista extends Empleado{
	private double pagoContrato;
    private int duracionMeses;
    
	public EmpleadoContratista(String nombre, double pagoContrato, int duracionMeses) {
		super(nombre);
		this.pagoContrato = pagoContrato;
		this.duracionMeses = duracionMeses;
	}

	@Override
	public double calcularPago() {
		return pagoContrato/duracionMeses;
	}

	@Override
	public String toString() {
		return "EmpleadoContratista [" + super.toString() + "Pago Contrato=" + pagoContrato + ", duracionMeses=" + duracionMeses
				+ ", calcularPago()=" + calcularPago() + "]";
	}
	
	
    
    

}
