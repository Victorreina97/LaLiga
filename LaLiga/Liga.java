import java.util.Scanner;

public class Liga {

	public static void metJornada() {
		
		Scanner lector = new Scanner(System.in);

		int numeroEquipos;
		String[] equipos;
		String[][] enfrentamientos;

		System.out.println("¿Cuantos equipos hay en la liga?");
		numeroEquipos = lector.nextInt();

		enfrentamientos = new String[numeroEquipos][numeroEquipos];
		equipos = new String[numeroEquipos];

		for (int i = 0; i < numeroEquipos; i++) {
			System.out.println("Pon el nombre del equipo " + (i + 1));
			equipos[i] = lector.next();
		}

		if (esPar(numeroEquipos)) {
			System.out.println(
					"El número de jornadas son: " + (numeroEquipos - 1) + ", no descansa ningún equipo por jornada.");
		} else {
			System.out.println("El número de jornadas son: " + numeroEquipos + ", descansa un equipo por jornada.");
		}

		for (int i = 0; i < numeroEquipos; i++) {
			for (int j = i + 1; j < numeroEquipos; j++) {
				enfrentamientos[i][j] = equipos[i] + " contra " + equipos[j];
			}
		}

		for (int i = 0; i < numeroEquipos; i++) {
			for (int j = i + 1; j < numeroEquipos; j++) {
				System.out.println(enfrentamientos[i][j]);
			}
		}
	}

	public static boolean esPar(int numeroEquipos) {
		return numeroEquipos % 2 == 0;
	}
}
