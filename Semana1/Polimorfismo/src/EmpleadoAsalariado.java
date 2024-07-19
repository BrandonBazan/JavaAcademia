
public class EmpleadoAsalariado extends Empleado{

	private double salarioAnual;
	

	public EmpleadoAsalariado(String nombre, double salarioAnual) {
		super(nombre);
		this.salarioAnual = salarioAnual;
	}


	@Override
	public double calcularPago() {
		
		return salarioAnual/12;
	}


	@Override
	public String toString() {
		return "EmpleadoAsalariado [salarioAnual=" + salarioAnual + ", calcularPago()=" + calcularPago()
				+" "+ super.toString() + "]";
	}


	
	
	

}
