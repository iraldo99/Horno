package lasencinas.org.Aparatos;

import lasencinas.org.Interfaces.Calentador;
import lasencinas.org.Tipos.TemperaturaAmbiente;

public class CalderaGas implements Calentador{
	private TemperaturaAmbiente temperatura;
	
	public void encender() {
		temperatura.subirTemperatura(28);
	}
	
	public void apagar() {
		temperatura.subirTemperatura(-28);
	}
	
}
