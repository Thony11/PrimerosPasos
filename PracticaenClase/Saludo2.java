public class Saludo2 {
	public static void main(String[] args) {
		String nombre;
		System.out.println("Por favor, dime como te llamas: ");
		nombre = System.console().readLine();
		System.out.println("Hola" + nombre);
		System.out.println(", ¡encantado de conocerte!");
	}
}		