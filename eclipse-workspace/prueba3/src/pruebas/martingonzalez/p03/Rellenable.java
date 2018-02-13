package pruebas.martingonzalez.p03;

public interface Rellenable {
	
	public static final int CAPACIDAD_MINIMA = 40;
	public static final int CAPACIDAD_MAXIMA = 100;
	
	public enum Combustible {
		GASOLINA, GASOIL, GASOLEO
	}
	
	public abstract int rellenar();
	public abstract void rellenar(int litros);
	
	public abstract int getDeposito();
	public abstract void setDeposito(int deposito);
	
	public abstract int getCapMax();
	public abstract void setCapMax(int capMax);
	
	public abstract int getCuentaKm();
	public abstract void setCuentaKm(int cuentaKm);
	
	public abstract int getLitros100();
	public abstract void setLitros100(int litros100);

}
