
public abstract class Empleado implements Pagable {
	private String nombre;
	private static int  contador =0;
	private int idEmpleado;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		contador++;
		this.idEmpleado = contador;
	}
	
	public abstract double calcularPago();

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", idEmpleado=" + idEmpleado + "]";
	}
	
	public void mostrarPago() {
        System.out.println("Pago: $" + calcularPago());
    }
	
	
	

}
