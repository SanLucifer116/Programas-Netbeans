
package herencia;


public class Herencia {
    private String cedula;
	private String nombre;
	private String fechadeingreso;
	private String email;
	private String dircorres;
	private String telefono;

    public Herencia() {
    }

    public Herencia(String cedula, String nombre, String fechadeingreso, String email, String dircorres, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechadeingreso = fechadeingreso;
        this.email = email;
        this.dircorres = dircorres;
        this.telefono = telefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechadeingreso() {
        return fechadeingreso;
    }

    public void setFechadeingreso(String fechadeingreso) {
        this.fechadeingreso = fechadeingreso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDircorres() {
        return dircorres;
    }

    public void setDircorres(String dircorres) {
        this.dircorres = dircorres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Herencia{" + "cedula=" + cedula + ", nombre=" + nombre + ", fechadeingreso=" + fechadeingreso + ", email=" + email + ", dircorres=" + dircorres + ", telefono=" + telefono + '}';
    }

 
}
