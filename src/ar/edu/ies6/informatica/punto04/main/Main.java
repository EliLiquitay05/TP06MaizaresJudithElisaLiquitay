package ar.edu.ies6.informatica.punto04.main;


		import ar.edu.ies6.informatica.model.Compra;
		import ar.edu.ies6.informatica.model.Producto;
		import ar.edu.ies6.informatica.util.Categoria;
		import ar.edu.ies6.informatica.util.OrigenFabricacion;

		import java.util.ArrayList;
		import java.util.Date;

		public class Main {
		    public static void main(String[] args) {
		    	// TODO Auto-generated method stub
		        // Crear  listado de 10 productos
		        ArrayList<Producto> productos = new ArrayList<>();
		        productos.add(new Producto("P001", "Smartphone", 300.00, OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA));
		        productos.add(new Producto("P002", "Laptop", 560.99, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
		        productos.add(new Producto("P003", "Refrigerador", 799.99, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
		        productos.add(new Producto("P004", "Taladro", 500.000, OrigenFabricacion.ARGENTINA, Categoria.HERRAMIENTAS));
		        productos.add(new Producto("P005", "Televisor", 400.000, OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR));
		        productos.add(new Producto("P006", "Tablet", 199.00, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
		        productos.add(new Producto("P007", "Cámara", 150.00, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
		        productos.add(new Producto("P008", "Smartwatch", 200.99, OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA));
		        productos.add(new Producto("P009", "Impresora", 149.99, OrigenFabricacion.URUGUAY, Categoria.INFORMATICA));
		        productos.add(new Producto("P010", "Aspiradora", 89.99, OrigenFabricacion.CHINA, Categoria.ELECTROHOGAR));

		        // hacer tres compras
		        Compra[] compras = new Compra[3];
		        compras[0] = new Compra("C001", new Date(), productos.get(0), 2); // Smartphone
		        compras[1] = new Compra("C002", new Date(), productos.get(3), 1); // Taladro
		        compras[2] = new Compra("C003", new Date(), productos.get(5), 3); // Tablet

		        // Mostrar las tres compras
		        for (Compra compra : compras) {
		            compra.imprimirRecibo();
		        }
		    }
		

	}


