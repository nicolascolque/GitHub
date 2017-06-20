package Modelo;

public class Persona {

	  private String Nombre;
	
	public String getNombre() 
		{
			return Nombre;
		}

	public void setNombre(String Nombre) 
		{
			this.Nombre = Nombre;
		}
	
	public Persona (){}
	public Persona (boolean llenarBD){
		if(llenarBD)
		crearBD();
	}
	public void crearBD(){}
}
