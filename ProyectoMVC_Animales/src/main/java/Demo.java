import Modelo.Cliente;
import Vista.ClienteView;
import Controlador.ClienteController;

public class Demo {

public static void main (String [] args){
    
    Cliente modelo= llenarDatosMascota();
    ClienteView vista= new ClienteView();
    
    ClienteController controlador= new  ClienteController(modelo, vista);
    
    controlador.actualizarVista();
    
    controlador.setNombre("Archi");
    controlador.setRaza("Labrador");
    controlador.actualizarVista();

    

}    

 
 private static Cliente llenarDatosMascota() {
   
    Cliente cliente = new Cliente();
    cliente.setIdent(1);
    cliente.setEdad(2);
    cliente.setNombre("Firulais");
    cliente.setRaza("Pastor Aleman ");
    return cliente;       
    
    }   
    
    
    
    
    
    
    
    
}
