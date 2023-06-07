
public class Clasificacion extends Liga{

	private String victoria;
	private String derrota;
	private String empate;
	private String puntos;
	private String equipo;

	public Clasificacion(String victoria, String derrota, String empate, String puntos, String equipo) {
		super();
		this.victoria = victoria;
		this.derrota = derrota;
		this.empate = empate;
		this.puntos = puntos;
		this.equipo = equipo;
	}

	public String getVictoria() {
		return victoria;
	}

	public void setVictoria(String victoria) {
		this.victoria = victoria;
	}

	public String getDerrota() {
		return derrota;
	}

	public void setDerrota(String derrota) {
		this.derrota = derrota;
	}

	public String getEmpate() {
		return empate;
	}

	public void setEmpate(String empate) {
		this.empate = empate;
	}

	public String getPuntos() {
		return puntos;
	}

	public void setPuntos(String puntos) {
		this.puntos = puntos;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Clasificacion [victoria=" + victoria + ", derrota=" + derrota + ", empate=" + empate + ", puntos="
				+ puntos + ", equipo=" + equipo + "]";
	}
	
	public static void verClasificacion() {
		
		String[] titulos = new String[5];
		titulos[0] = "[Equipo]";
		titulos[1] = "[Puntos]";
		titulos[2] = "[P Ganados]";
		titulos[3] = "[P Empatados]";
		titulos[4] = "[P Perdidos]";
		
		for(int i=0; i < numeroEquipos; i++) {
			String[] (datos + 1)= new String[5];
		}
		
		System.out.println(titulos.toString());
		
	}

}
