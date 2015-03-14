import java.util.ArrayList;

class MiClase
{
	int x;
	public MiClase(int x) {
		this.x = x;
	}
};

public class Ejercicios {

	//Devuelve la division entre 'a' y 'b'
	//Se deben manejar las excepciones en caso de dividir entre 0
	static int dividir(int a, int b)
	{
		// evalua la operacion es caso la evaluacion sea correcta
		try
		{
			return a/b;
		}
		// al no ser correcta regresaria cero enves de ser un error
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//Devuelve el valor almacenado en 'arreglo' en la posicion 'pos'
	//Se deben manejar las excepciones en caso la posicion se salga de los limites
	static int getNumero(int arreglo[], int pos)
	{
		// evalua la posicion del arreglo
		try 
		{
			return arreglo[pos];
		}
		//sy la pasicion del arreglo no exixte regresa 0
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//Devuelve la variable 'x' de 'mi_clase'
	//Se debe manejar las excepciones en caso que 'mi_clase' sea igual a null
	static int getX(MiClase mi_clase)
	{
		// evalua la variave x
		try
		{
			return mi_clase.x;
		}
		// sy x es igual a null regresa 0
		catch(Exception e)
		{
			return 0;
		}
	}
	
	//Devuelve el promedio de todos los elementos de 'mi_lista'
	static int getPromedio(ArrayList<Integer> mi_lista)
	{
		int suma = 0;
		
		// se crea un ciclo para recorrer el arreglo e ir sumanso sus resultados
		for(Integer promedio : mi_lista)
		{
			suma = suma + promedio;
		}
		// al tener la suma de sus resultado se divide entre la cantidad de arreglos que hay
		return suma/mi_lista.size();
	}
	
	//Devuelve el numero menor almacenado en 'mi_lista'
	static int getMenor(ArrayList<Integer> mi_lista)
	{
		int menor = Integer.MAX_VALUE;
		
		//recorre todo el erreglo para evaluar cual es menor y regresa el menor
		for(int num=0;num<mi_lista.size();num++)
		{
		if(menor > mi_lista.get(num)) menor=mi_lista.get(num);
		}
		return menor;
	}
	
	//Devuelve la cantidad de veces que existe 'str' (dado) en mi_lista (dado)
	static int contar(ArrayList<String> mi_lista, String str)
	{
		int contador = 0;
		
		// recorre todo el arreglo y va sumando en el en el contador las veses del 
		// arreglo repetido
		for(int num = 0; num < mi_lista.size(); num++)
		{
			if(mi_lista.get(num) == str)
				contador = contador + 1;
		}
		return contador;
	}
	
	public static void main(String[] args)
	{ 
	}

}
