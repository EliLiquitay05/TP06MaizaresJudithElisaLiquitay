package ar.edu.ies6.informatica.model;

import ar.edu.ies6.informatica.util.Categoria;
import ar.edu.ies6.informatica.util.OrigenFabricacion;

public class Producto {
		
	// atributos
	    private String codigo;
	    private String descripcion;
	    private double precioUnitario;
	    private OrigenFabricacion origenFabricacion;
	    private Categoria categoria;
	
	    
	 // Constructor
	    public Producto (String codigo, String descripcion, double precioUnitario, 
	                    OrigenFabricacion origenFabricacion, Categoria categoria) {
	        this.codigo = codigo;
	        this.descripcion = descripcion;
	        this.precioUnitario = precioUnitario;
	        this.origenFabricacion = origenFabricacion;
	        this.categoria = categoria;
	    }
	    
	    
		 @Override
		    public String toString() {
		        return "Producto{" +
		                "codigo='" + codigo + '\'' +
		                ", descripcion='" + descripcion + '\'' +
		                ", precioUnitario=" + precioUnitario +
		                ", origenFabricacion=" + origenFabricacion +
		                ", categoria=" + categoria +
		                '}';
	 
	    
}


		public double getPrecioUnitario() {
			// TODO Auto-generated method stub
			return precioUnitario;
		}


		
		
		
		}
	



