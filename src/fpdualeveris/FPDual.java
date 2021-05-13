package fpdualeveris;

import java.util.ArrayList;
import java.util.List;

import variables.Developer;

/**
 * Clase principal MainApp
 * 
 * @author aruidelg
 *
 */
public class FPDual {

	/**
	 * Instancia los Developers y usa sus funciones
	 */
	private static void variablesChallenge() {

		List<Developer> developers = new ArrayList<>();

		Developer dev = new Developer();
		Developer dev1 = new Developer("Andres");
		Developer dev2 = new Developer("Campos");
		Developer dev3 = new Developer("Esmerado");
		Developer dev4 = new Developer("Ramos");

		developers.add(dev1);
		developers.add(dev2);
		developers.add(dev3);
		developers.add(dev4);

		// Elimina todos los empleados por encima de la cantidad maxima de empleados
		do {
			if (developers.size() > dev.getMaxDevelopers()) {
				for (int i = dev.getMaxDevelopers(); i <= developers.size(); i++) {
					i = dev.getMaxDevelopers();
					developers.remove(i);
				}
			}
		} while (developers.size() > dev1.getMaxDevelopers());
		// Muestra la cantidad de empleados totales
		System.out.println("Hay un total de " + developers.size() + " empleados");

		// getCont = ArrayList.size
		// System.out.println("Hay un total de "+dev4.getCont()+" empleados");

		// Mostrara toda la informacion de los empleados
		System.out.println(developers.toString());

		// Muestra la ID de todos los empleados + nombre
		for (Developer developer : developers) {
			System.out.println("Empleado con ID " + developer.getIdDeveloper() + " " + developer.getNombre());
		}

		// Debera introducir cuantos dias de vacaciones desea tomar
		dev2.setHolidays(2);

		// Muestra los dias de vacaciones de cada empleado + ID
		for (Developer developer : developers) {
			System.out.println("Empleado numero " + developer.getIdDeveloper() + " dias de vacaciones: " + developer.getHolidays());
		}

	}

	/**
	 * Metodo principal Accionara el metodo Static
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Metodo el cual contendra todas nuestra funciones
		variablesChallenge();

	}

}
