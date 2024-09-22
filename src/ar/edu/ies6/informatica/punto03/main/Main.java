package ar.edu.ies6.informatica.punto03.main;

import ar.edu.ies6.informatica.model.Provincia;
import ar.edu.ies6.informatica.util.Region;

		public class Main {
		    public static void main(String[] args) {
		    	// TODO Auto-generated method stub
		    	
		        Provincia[] provincias = new Provincia[10];

		        // Crear 10 provincias
		        provincias[0] = new Provincia("P001", "Jujuy", Region.NOA, 700000, 177, true);
		        provincias[1] = new Provincia("P002", "Salta", Region.NOA, 1200000, 155488, true);
		        provincias[2] = new Provincia("P003", "Formosa", Region.NEA, 600000, 72050, false);
		        provincias[3] = new Provincia("P004", "Chaco", Region.NEA, 1100000, 99847, true);
		        provincias[4] = new Provincia("P005", "Corrientes", Region.NEA, 1000000, 99393, false);
		        provincias[5] = new Provincia("P006", "San Juan", Region.CUYO, 600000, 89616, true);
		        provincias[6] = new Provincia("P007", "Mendoza", Region.CUYO, 2000000, 148827, false);
		        provincias[7] = new Provincia("P008", "Córdoba", Region.CENTRO, 3500000, 165321, true);
		        provincias[8] = new Provincia("P009", "Santa Cruz", Region.PATAGONIA, 500000, 243943, false);
		        provincias[9] = new Provincia("P010", "Rio Negro", Region.PATAGONIA, 600000, 203944, false);

		        // Mostrar provincias con estado true
		        System.out.println("Provincias con estado true:");
		        for (Provincia provincia : provincias) {
		            if (provincia.isEstado()) {
		                System.out.println(provincia);
		           }
		        }
		   }
		
		}


