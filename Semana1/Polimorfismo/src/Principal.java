
public class Principal {

	public static void main(String[] args) {
		Empleado empleado1 = new EmpleadoAsalariado("Juan Perez",12_000);
		Empleado empleado2 = new EmpleadoPorHora("Pedro Perez",150,30);
		Empleado empleado3 = new EmpleadoContratista("Sergio Gomez",60_000, 3);
		System.out.println(empleado1);
		empleado1.mostrarPago();
		System.out.println(empleado2);
		empleado2.mostrarPago();
		System.out.println(empleado3);
		empleado3.mostrarPago();

	}

}
