package pruebas.martingonzalez.p03;

public abstract class Vehiculo implements Rellenable {

	protected int deposito;
	protected int capMax;
	protected int cuentaKm;
	protected int litros100;
	protected int recargas;
	protected Combustible combustible;

	public Vehiculo() {
		deposito = 40;
		capMax = 40;
		cuentaKm = 0;
		litros100 = 10;
		recargas = 0;
	}

	public Vehiculo(int deposito, int capMax, int cuentaKm, int litros100) {
		if (capMax > CAPACIDAD_MINIMA || capMax < CAPACIDAD_MAXIMA) {
			this.capMax = capMax;
		}
		if (deposito < capMax || deposito > 0) {
			this.deposito = deposito;
		}
		this.cuentaKm = cuentaKm;
		this.litros100 = litros100;

		recargas = 0;
	}
	
	public int rellenar() {
		System.out.println("El vehículo rellena " + capMax + " litros de combustible");
		this.recargas++;
		return capMax;
	}
	
	public void rellenar(int litros) {
		int sum = this.deposito += litros; 
		if (sum < this.capMax) {
			this.deposito = sum;
		}
		System.out.println("El vehículo rellena " + litros + " litros de combustible");
		this.recargas++;
	}
	
	public int recorrer(int km) {
		int recorrido = km;
		while (recorrido > 0) {
			if (recorrido / 100 * this.litros100 < this.deposito) {
				System.out.println("El vehículo recorre " + recorrido + "km");
				this.deposito = recorrido / 100 * this.litros100;
				recorrido = 0;
			} else {
				int recorridoInicial = 100 * this.deposito / this.litros100;
				System.out.println("El vehículo recorre " + recorridoInicial + "km");
				recorrido -= recorridoInicial;
				rellenar();
			}
			
		}
		return km;
	}

	public int getDeposito() {
		return deposito;
	}
	
	public void setDeposito(int deposito) {
		if (deposito < this.capMax) {
			this.deposito = deposito;
		}
	}
	
	public int getCapMax() {
		return capMax;
	}
	
	public void setCapMax(int capMax) {
		if (capMax > CAPACIDAD_MINIMA || capMax < CAPACIDAD_MAXIMA) {
			this.capMax = capMax;
		}
	}

	public int getCuentaKm() {
		return cuentaKm;
	}

	public void setCuentaKm(int cuentaKm) {
		this.cuentaKm = cuentaKm;
	}

	public int getLitros100() {
		return litros100;
	}

	public void setLitros100(int litros100) {
		this.litros100 = litros100;
	}

	public int getRecargas() {
		return recargas;
	}

	public void setRecargas(int recargas) {
		this.recargas = recargas;
	}

	public Combustible getCombustible() {
		return combustible;
	}

	public void setCombustible(Combustible combustible) {
		this.combustible = combustible;
	}

}
