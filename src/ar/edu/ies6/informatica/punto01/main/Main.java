package ar.edu.ies6.informatica.punto01.main;

import java.util.ArrayList;
import ar.edu.ies6.informatica.model.Producto;
import ar.edu.ies6.informatica.util.Categoria;
import ar.edu.ies6.informatica.util.OrigenFabricacion;

public class Main {
    public static  void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        ArrayList<Producto> productos = new ArrayList<>();

        // Crear 5 objetos de la clase Producto
        
        productos.add(new Producto("P001", "Smartphone", 299.99, OrigenFabricacion.ARGENTINA, Categoria.TELEFONIA));
        productos.add(new Producto("P002", "Laptop", 599.99, OrigenFabricacion.CHINA, Categoria.INFORMATICA));
        productos.add(new Producto("P003", "Refrigerador", 799.99, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR));
        productos.add(new Producto("P004", "Taladro", 99.99, OrigenFabricacion.ARGENTINA, Categoria.HERRAMIENTAS));
        productos.add(new Producto("P005", "Televisor", 399.99, OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR));
        
        // Mostrar el contenido del listado
        for (Producto producto : productos) {
            System.out.println(producto);
            
          
        }
    }



}


