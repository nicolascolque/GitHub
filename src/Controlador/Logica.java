package Controlador;
import Modelo.Persona;
public class Logica 
	{
	Persona[] Persona;
	
	public void inicializarPersona(int cantidadpersonas)
		{
			Persona = new Persona [cantidadpersonas];
			
		}
	public void ingresarPersonas(int posicion , String Nombre)
		{
		Persona nuevaPersona = new Persona();
			
			nuevaPersona.setNombre(Nombre);
			Persona[posicion]= nuevaPersona;
		}
public 	Persona traerPersona (int posicion)
		{
			return Persona[posicion];
		}
	Persona[]getPersonas()
		{
			return Persona;
		}
	}
