import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    
		CPersona objpersona = new CPersona("Mariano", 41);
		CPersona objpersona2 = new CPersona("Persona2", 41);
		
		Celementos objelemento = new Celementos();
		
		objelemento.agregar(objpersona);
		objelemento.agregar(objpersona2);
		
		//System.out.println(objelemento);
		//System.out.println(objelemento.cantidad_elementos());
		
		//Elimina el ultimo registro
		objelemento.sacar();
		
		//System.out.println(objelemento.cantidad_elementos());
		
		System.out.println(objelemento.mostar_elementos());

	}

}
