package variables;

/**
 * Clase Developer Instancia los empleados para FPDual
 * 
 * @author aruidelg
 * @version 1.0
 */
public class Developer {

	// Variables
	private static int cont = 0;
	private String nombre;
	private int idDeveloper, maxDevelopers = 127, holidays;

	// Constructor vacio
	public Developer() {

	}

	// Constructor principal
	public Developer(String nombre) {

		cont++;
		this.nombre = nombre;
		idDeveloper = cont;
		this.holidays = 21;

	}

	/**
	 * @return the maxDevelopers
	 */
	public int getMaxDevelopers() {
		return maxDevelopers;
	}

	@Override
	public String toString() {
		return "Developer [nombre=" + nombre + ", idDeveloper=" + idDeveloper + ", holidays=" + holidays + "]\n";
	}

	/**
	 * @return the cont
	 */
	public static int getCont() {
		return cont;
	}

	/**
	 * @return the idDeveloper
	 */
	public int getIdDeveloper() {
		return idDeveloper;
	}

	/**
	 * @return the holidays
	 */
	public int getHolidays() {
		return holidays;
	}

	/**
	 * @param holidays
	 *            the holidays to set
	 */
	public void setHolidays(int holidays) {

		// Verificamos que no pueda tomar mas vacaciones de las permitidas
		if (holidays > 21 | holidays > this.holidays) {

			System.out.println("No puedes tomar mas vacaciones");

		} else {

			this.holidays -= holidays;

		}

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

}
