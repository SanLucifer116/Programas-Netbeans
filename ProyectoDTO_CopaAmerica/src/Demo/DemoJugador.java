package Demo;


import  BusinessObject.Jugador_BO;
import ValueObject.Jugador_VO;

public class DemoJugador {

	 public static void main(String[] args) {
		 
		 
		System.out.println("USUARIOS EN EL SISTEMA");
		Jugador_BO jugadoresBO = new Jugador_BO();
     	jugadoresBO.obtenerUsuario().forEach(System.out::println);
     	
     	System.out.println("****");
     	
     	
     	
     	//ACTUALIZAR  //segundo acutaliza 
     	Jugador_VO jugador = jugadoresBO.ObtenerUsuario(7);
    	jugador.setPais("Colombia");
    	jugadoresBO.ActualizarUsuario(jugador);
     	

    	//OBTENER       //primero obtiene 	

     	//System.out.println("****");
     	//jugador=jugadoresBO.ObtenerUsuario(7);
     	//System.out.println(jugador);
     	
     	
     	
     	//ELIMINAR // tercero elimina
     	//System.out.println("****");
     	//jugador=jugadoresBO.ObtenerUsuario(7);
     	//jugadoresBO.eliminarUsuario(jugador);

		 
		 
		 
		 
		 
		 
		 
		 
		 
	 }
	
	
	
	
	
	
	
}


