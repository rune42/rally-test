package pruebas.martingonzalez.p03;

public final class Camion extends Vehiculo {

	public Camion() {
		super();
		this.combustible = Combustible.GASOLEO;
	}

	public Camion(int deposito, int capMax, int cuentaKm, int litros100) {
		super(deposito, capMax, cuentaKm, litros100);
		this.combustible = Combustible.GASOLEO;
	}

	@Override
	public int rellenar() {
		System.out.println("El camión rellena " + capMax + " litros de combustible");
		this.recargas++;
		return capMax;
	}

	@Override
	public void rellenar(int litros) {
		int sum = this.deposito += litros;
		if (sum < this.capMax) {
			this.deposito = sum;
		}
		System.out.println("El camión rellena " + litros + " litros de combustible");
		this.recargas++;
	}

	@Override
	public int recorrer(int km) {
		int recorrido = km;
		while (recorrido > 0) {
			if (recorrido / 100 * this.litros100 < this.deposito) {
				System.out.println("El camión recorre " + recorrido + "km");
				this.deposito = recorrido / 100 * this.litros100;
				recorrido = 0;
			} else {
				int recorridoInicial = 100 * this.deposito / this.litros100;
				System.out.println("El camión recorre " + recorridoInicial + "km");
				recorrido -= recorridoInicial;
				rellenar();
			}
		}
		return km;
	}

	public String toString() {
		String s = "CAMIÓN: Consumo de " + litros100 + " a los 100kms.";
		s += "\nEl camión tiene un depósito de " + capMax + " litros de combustible";
		return s;
	}

}
