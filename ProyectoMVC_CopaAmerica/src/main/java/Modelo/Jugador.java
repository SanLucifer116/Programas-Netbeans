
package Modelo;


public class Jugador {
    
    private String Pais;
    private String NombreJug;
    private int Goles;

    public Jugador(String Pais, String NombreJug, int Goles) {
        this.Pais = Pais;
        this.NombreJug = NombreJug;
        this.Goles = Goles;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public String getNombreJug() {
        return NombreJug;
    }

    public void setNombreJug(String NombreJug) {
        this.NombreJug = NombreJug;
    }

    public int getGoles() {
        return Goles;
    }

    public void setGoles(int Goles) {
        this.Goles = Goles;
    }
    
    
    

}
