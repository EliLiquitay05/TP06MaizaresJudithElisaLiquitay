package ar.edu.ies6.informatica.model;
import ar.edu.ies6.informatica.util.Region;


public class Provincia {
	
	//atributos
	
	private String identificador;
    private String nombre;
    private Region region;
    private int poblacion;
    private double superficie; // En km²
    private boolean estado; // true o false (verdadero o falso)
	
    
    //contructor
	public Provincia(String identificador, String nombre, Region region, int poblacion, double superficie,
			boolean estado) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.region = region;
		this.poblacion = poblacion;
		this.superficie = superficie;
		this.estado = estado;
	}


//calculamos la densidad poblacional

     public double calcularDensidadPoblacional() {
        return poblacion / superficie;
    }

     // para ver el estado 
    public boolean isEstado() {
        return estado;
    }
    
    
    
    ///Override
	public String toString() {
		return "Provincia [identificador=" + identificador + ", nombre=" + nombre + ", region=" + region
				+ ", poblacion=" + poblacion + ", superficie=" + superficie + ", estado=" + estado + "]";
	}

 
    
    
}
