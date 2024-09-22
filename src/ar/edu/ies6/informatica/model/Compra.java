package ar.edu.ies6.informatica.model;

import java.util.Date;
public class Compra {
	
	
	
	//atributos
	private  String codigo;
	private Date fechaDeCompra;
	private Producto  Producto;
	private int cantidad ;
	
	 
	//conttructores
	
	
	public Compra(String codigo, Date fechaDeCompra, ar.edu.ies6.informatica.model.Producto producto, int cantidad) {
		super();
		this.codigo = codigo;
		this.fechaDeCompra = fechaDeCompra;
		Producto = producto;
		this.cantidad = cantidad;
	}
		//imprimir recibo
		public void imprimirRecibo() {
			  double total = Producto.getPrecioUnitario() * cantidad;
	        System.out.println("Recibo de Compra:");
	        System.out.println("Código: " + codigo);
	        System.out.println("Fecha de Compra: " + fechaDeCompra);
	        System.out.println("Producto: " + Producto);
	        System.out.println("Cantidad: " + cantidad);
	        System.out.println("Precio Total: " + total);
	        System.out.println("-----------------------");
		

		}
}
