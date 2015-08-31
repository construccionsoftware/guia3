package mundo;

public class Paciente {

	private String nombre;
	private String edad;
	private String date;
	private String idpaciente;
	private String dateCita;
	private String telefono;
	private String historial;
	private String apersonal;
	private String afamiliar;
	
	public Paciente()
	{
		
		
	}
	public Paciente(String nombre, String edad, String date, String idpaciente, String dateCita,
			String telefono, String historial,String apersonal, String afamiliar) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.date = date;
		this.idpaciente = idpaciente;
		this.dateCita = dateCita;
		this.telefono = telefono;
		this.historial = historial;
		this.apersonal= apersonal;
		this.afamiliar= afamiliar;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getIdpaciente() {
		return idpaciente;
	}
	public void setIdpaciente(String idpaciente) {
		this.idpaciente = idpaciente;
	}
	public String getDateCita() {
		return dateCita;
	}
	public void setDateCita(String dateCita) {
		this.dateCita = dateCita;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getHistorial() {
		return historial;
	}
	public void setHistorial(String historial) {
		this.historial = historial;
	}
	public String getApersonal() {
		return apersonal;
	}
	public void setApersonal(String apersonal) {
		this.apersonal = apersonal;
	}
	public String getAfamiliar() {
		return afamiliar;
	}
	public void setAfamiliar(String afamiliar) {
		this.afamiliar = afamiliar;
	}
}
