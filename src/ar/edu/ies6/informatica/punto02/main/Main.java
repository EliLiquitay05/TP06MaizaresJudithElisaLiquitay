package ar.edu.ies6.informatica.punto02.main;

import java.util.ArrayList;
import ar.edu.ies6.informatica.model.Efemeride;
import ar.edu.ies6.informatica.util.Mes;

		public class Main {
		    public static void main(String[] args) {
		        ArrayList<Efemeride> efemerides = new ArrayList<>();

		        // Agregamos 5 efemérides
		        
		        efemerides.add(new Efemeride("A001", "Día de la Independencia", Mes.JULIO, 9, "Independencia de Argentina"));
		        efemerides.add(new Efemeride("A002", "Navidad", Mes.DICIEMBRE, 25, "Celebración de Navidad"));
		        efemerides.add(new Efemeride("A003", "Año Nuevo", Mes.ENERO, 1, "Celebración del Año Nuevo"));
		        efemerides.add(new Efemeride("A004", "Día del Trabajo", Mes.MAYO, 1, "Celebración del trabajo"));
		        efemerides.add(new Efemeride("A005", "Día de la Revolución", Mes.MAYO, 25, "Revolución de Mayo"));

		        // Mostramos  nombre, día y mes de las efemérides
		        
		        for (Efemeride efemeride : efemerides) {
		            System.out.println(efemeride.getNombre() + ", " + efemeride.getDia() + " " + efemeride.getMes());
		        }

		        // Eliminamos la 3ra efeméride
		        
		        efemerides.remove(2); // Índice 2 es la tercera efeméride

		        // Modificamos la 2da efeméride
		        efemerides.get(1).setNombre("Fiesta de Navidad");
		        efemerides.get(1).setDetalle("Celebración de la Navidad con la familia");

		        // Mostrar las efemérides restantes
		        System.out.println("\nEfemérides restantes:");
		        for (Efemeride efemeride : efemerides) {
		            System.out.println(efemeride.getNombre() + ", " + efemeride.getDia() + " " + efemeride.getMes());
		        }
		
	}

}
