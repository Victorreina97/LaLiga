 
public class Controlador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador miJugador1 = new Jugador("Alvaro", "Delantero", "Equipo1");
		Jugador miJugador2 = new Jugador("Mario", "Mediocampista", "Equipo1");
		Jugador miJugador3 = new Jugador("Victor", "Lateral", "Equipo2");
		Jugador miJugador4 = new Jugador("Jose", "Portero", "Equipo2");
		
		Equipo miEquipo1 = new Equipo("Equipo1");
		Equipo miEquipo2 = new Equipo("Equipo2");
		
		miEquipo2.addJugadores(miJugador4);
		miEquipo2.addJugadores(miJugador3);
		
		miEquipo1.addJugadores(miJugador2);
		miEquipo1.addJugadores(miJugador1);
		
		Liga.metJornada();
		
	}

}
