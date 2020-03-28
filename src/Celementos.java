import java.util.*;

public class Celementos<E> 
{
	
	private List<E> elementos;
	
	public Celementos() 
	{
		this.elementos = new ArrayList<E>();
	}
	
	public void agregar(E nuevoElemento)
	{
		elementos.add(nuevoElemento);
	}
	
	public int cantidad_elementos() 
	{
				
		return elementos.size();
	}
	
	public E sacar() 
	{
		if(elementos.isEmpty())
		throw new UnsupportedOperationException();
		
		E resultado = elementos.get(elementos.size()-1);
		elementos.remove(elementos.size()-1);
		return resultado;
	}
	public List<E> mostar_elementos() 
	{
	  return elementos;	
	}
	



}
