
package herencia;


public class Propietario extends Herencia {
    
private int NumFincas;
private String Proceso;
private String Cargo;

    public Propietario() {
     super();   
    }

    public Propietario(int NumFincas, String Proceso, String Cargo, String cedula, String nombre, String fechadeingreso, String email, String dircorres, String telefono) {
        super(cedula, nombre, fechadeingreso, email, dircorres, telefono);
        this.NumFincas = NumFincas;
        this.Proceso = Proceso;
        this.Cargo = Cargo;
    }

    Propietario(int i, String _) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Propietario(int i, String crear_Cuenta_, String administrador_Finca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumFincas() {
        return NumFincas;
    }

    public void setNumFincas(int NumFincas) {
        this.NumFincas = NumFincas;
    }

    public String getProceso() {
        return Proceso;
    }

    public void setProceso(String Proceso) {
        this.Proceso = Proceso;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Propietario{" + "NumFincas=" + NumFincas + ", Proceso=" + Proceso + ", Cargo=" + Cargo + '}';
    }
  
   
   
}
