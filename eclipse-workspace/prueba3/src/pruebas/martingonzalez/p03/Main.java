package pruebas.martingonzalez.p03;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Moto moto = new Moto(40, 40, 0, 10);
		Coche coche = new Coche(60, 60, 0, 10);
		Camion camion = new Camion(80, 80, 0, 20);

		System.out.println(moto + "\n" + coche + "\n" + camion + "\n");
		
		int rMoto, rCoche, rCamion;
		Random r = new Random();

		System.out.println("PRIMER DIA");

		rMoto = 500 + r.nextInt(501);
		rCoche = 500 + r.nextInt(501);
		rCamion = 500 + r.nextInt(501);
		
		System.out.println("MOTO: Ruta de " + rMoto + " kms.");
		moto.recorrer(rMoto);
		
		System.out.println("COCHE: Ruta de " + rCoche + " kms.");
		coche.recorrer(rCoche);
		
		System.out.println("CAMIÓN: Ruta de " + rCamion + " kms.");
		camion.recorrer(rCamion);
		
		System.out.println("SEGUNDO DIA");

		rMoto = 500 + r.nextInt(501);
		rCoche = 500 + r.nextInt(501);
		rCamion = 500 + r.nextInt(501);
		
		System.out.println("MOTO: Ruta de " + rMoto + " kms.");
		moto.recorrer(rMoto);
		
		System.out.println("COCHE: Ruta de " + rCoche + " kms.");
		coche.recorrer(rCoche);
		
		System.out.println("CAMIÓN: Ruta de " + rCamion + " kms.");
		camion.recorrer(rCamion);
		
		System.out.println("TERCER  DIA");

		rMoto = 500 + r.nextInt(501);
		rCoche = 500 + r.nextInt(501);
		rCamion = 500 + r.nextInt(501);
		
		System.out.println("MOTO: Ruta de " + rMoto + " kms.");
		moto.recorrer(rMoto);
		
		System.out.println("COCHE: Ruta de " + rCoche + " kms.");
		coche.recorrer(rCoche);
		
		System.out.println("CAMIÓN: Ruta de " + rCamion + " kms.");
		camion.recorrer(rCamion);
		
		System.out.println("RESUMEN");
		System.out.println("La moto ha recorrido " + moto.getCuentaKm() + " kms. con " + moto.getRecargas()*moto.getCapMax() + " y ha recargado " + moto.getRecargas() + " veces.");
		System.out.println("El coche ha recorrido " + coche.getCuentaKm() + " kms. con " + coche.getRecargas()*coche.getCapMax() + " y ha recargado " + coche.getRecargas() + " veces.");
		System.out.println("El camión ha recorrido " + camion.getCuentaKm() + " kms. con " + camion.getRecargas()*camion.getCapMax() + " y ha recargado " + camion.getRecargas() + " veces.");

	}

}
