package pruebas.martingonzalez.p03;

public final class Moto extends Vehiculo {
	
	public Moto() {
		super();
		this.combustible = Combustible.GASOLINA;
	}

	public Moto(int deposito, int capMax, int cuentaKm, int litros100) {
		super(deposito, capMax, cuentaKm, litros100);
		this.combustible = Combustible.GASOLINA;
	}
	
	@Override
	public int rellenar() {
		System.out.println("La moto rellena " + capMax + " litros de combustible");
		this.recargas++;
		return capMax;
	}
	
	@Override
	public void rellenar(int litros) {
		int sum = this.deposito += litros; 
		if (sum < this.capMax) {
			this.deposito = sum;
		}
		System.out.println("La moto rellena " + litros + " litros de combustible");
		this.recargas++;
	}
	
	@Override
	public int recorrer(int km) {
		int recorrido = km;
		while (recorrido > 0) {
			if (recorrido / 100 * this.litros100 < this.deposito) {
				System.out.println("La moto recorre " + recorrido + "km");
				this.deposito = recorrido / 100 * this.litros100;
				recorrido = 0;
			} else {
				int recorridoInicial = 100 * this.deposito / this.litros100;
				System.out.println("La moto recorre " + recorridoInicial + "km");
				recorrido -= recorridoInicial;
				rellenar();
			}

		}
		return km;
	}
	
	public String toString() {
		String s = "MOTO: Consumo de " + litros100 + " a los 100kms.";
		s += "\nLa moto tiene un depósito de " + capMax + " litros de combustible";
		return s;
	}

}
