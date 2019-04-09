package lasencinas.org.Interfaces;

import lasencinas.org.Tipos.TemperaturaAmbiente;

public interface Regulador {
	public void regular(Termometro termometro, Calentador calentador, double minTemp, double maxTemp, TemperaturaAmbiente temperatura);
}
