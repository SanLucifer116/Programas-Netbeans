package ValueObject;

public class Jugador_VO {

private int Goles;
private String Pais;
private String NombreJug;
private int Ced;


    public Jugador_VO(int Goles, int Ced,String Pais, String NombreJug ) {
    	this.Goles = Goles;
    	this.Pais = Pais;
        this.NombreJug = NombreJug;
        this.Ced=Ced;
      
    }


	 public int getGoles() {
		return Goles;
	}
	public void setGoles(int goles) {
		Goles = goles;
	}
	public String getPais() {
		return Pais;
	}
	public void setPais(String pais) {
		Pais = pais;
	}
	public String getNombreJug() {
		return NombreJug;
	}
	public void setNombreJug(String nombreJug) {
		NombreJug = nombreJug;
	}
	public int getCed() {
		return Ced;
	}
	public void setCed(int ced) {
		Ced = ced;
	}
	@Override
	   public String toString() {
	        return this.getCed()+ " " + this.getGoles()+ " " + this.getPais() + " " + this.getNombreJug() ;
	    }



















}
