package Controlador;
import Modelo.Persona;
public class Logica 
	{
	Persona[] Personas;
	
	public void inicializarPersona(int cantidadpersonas)
		{
			Personas = new Persona [cantidadpersonas];
			
		}
	public void ingresarPersonas(int posicion , String Nombre)
		{
		Persona nuevaPersona = new Persona();
			
			nuevaPersona.setNombre(Nombre);
			Personas[posicion]= nuevaPersona;
		}
public 	Persona traerPersona (int posicion)
		{
			return Personas[posicion];
		}
	Persona[]getPersonas()
		{
			return Personas;
		}
	}
