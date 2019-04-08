package lasencinas.org.Tipos;

public class TemperaturaAmbiente {
	private double temp = 0;
	private static final TemperaturaAmbiente INSTANCE = new TemperaturaAmbiente();
	
	private TemperaturaAmbiente() {
	}
	
	public static TemperaturaAmbiente getInstance() {
		return INSTANCE;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	public double getTemperatura() {
		return temp;
	}
	
	public void setTemperatura(double temp) {
		this.temp = temp;
	}
	
	public void subirTemperatura(double incremento) {
		this.temp += incremento;
	}
	
}
