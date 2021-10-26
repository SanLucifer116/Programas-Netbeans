
package herencia;


public class Principal {
    
    /**
     *
     * @param args
     */ 
    public static void main (String[] args){
        Propietario propietario = new Propietario( 20, "Crear Cuenta ", "Administrador Finca");  
        AdminProp adminprop;
        adminprop = new AdminProp();
                
        System.out.println("Datos del Propietario: ");
        System.out.println(propietario);
        
        System.out.println("Datos del Administrador: ");
        System.out.println(adminprop);
    }
    
}
