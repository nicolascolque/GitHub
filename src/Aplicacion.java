import Util.Ayudante;
import Vista.Pantallas;
import Controlador.Logica;
import Modelo.Persona;

public class Aplicacion {
	public static void main(String[] args)
	{
		Pantallas vista= new Pantallas();
		Logica Controlador= new Logica(); 
		
		int cantidadPersonas= Ayudante.conversor(vista.ingresarValor("ingrese la cantidad de personas"));
		
		Controlador.inicializarPersona(cantidadPersonas);
		
			for (int i = 0; i < cantidadPersonas; i++)
				{
					Controlador.ingresarPersonas(i, vista.ingresarValor("Coloque su Nombre"));
				}
			
			for (int x = 0; x < cantidadPersonas; x++) 
				{
					Persona ekis = Controlador.traerPersona(x);
					vista.mostrarMensaje(ekis.getNombre());
				
				}
	}

}
