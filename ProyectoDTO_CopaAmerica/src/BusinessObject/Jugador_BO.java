package BusinessObject;

import java.util.ArrayList;

import java.util.List;


import ValueObject.Jugador_VO;


public class Jugador_BO {
	
	List<Jugador_VO> jugadores;
	
	public Jugador_BO() {
	
		
		jugadores= new ArrayList<>();
		Jugador_VO jugador1 = new Jugador_VO(7, 8," Italia ", " Radamel Falcao");
		Jugador_VO jugador2 = new Jugador_VO(4, 9," Brasil ", " Luiz Diaz");
       	jugadores.add(jugador1);
		jugadores.add(jugador2);
       
     
    }
						
		//elimina el cliente que se le pasa como paraámetro
    	public void eliminarUsuario(Jugador_VO jugador) {
    	jugadores.remove(jugador.getCed());
        System.out.println("Usuario " + jugador.getNombreJug() + " eliminado satisfactoriamente");
        }
    
    

    	public List<Jugador_VO> obtenerUsuario() {
    		return jugadores;
        }


    	public Jugador_VO ObtenerUsuario(int Ced) {
           return jugadores.get(Ced);
        }
    	
    	

    	public void ActualizarUsuario(Jugador_VO jugador) {
    		 
         //   enfermos.get(enfermo.getId()).setEdad(enfermo.getEdad());
    		jugadores.get(jugador.getCed()).setPais(jugador.getPais());

            System.out.println("Jugador  con ced: " + jugador.getCed() + " actualizado satisfactoriamente");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


