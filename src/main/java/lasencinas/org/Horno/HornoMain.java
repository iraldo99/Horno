package lasencinas.org.Horno;

import lasencinas.org.Aparatos.CalderaGas;
import lasencinas.org.Interfaces.Regulador;
import lasencinas.org.Interfaces.Termometro;
import lasencinas.org.Tipos.TemperaturaAmbiente;

public class HornoMain 
{
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        TemperaturaAmbiente temperature = TemperaturaAmbiente.getInstance();
        Heater heater = new GasHeater();
        Termometro thermometer = new RemoteCommandSensor();
        
        Regulador regulator = new Regulador();
        
        System.out.println( "Arrancando..." );
        regulator.regulate(thermometer, heater, minTemp, maxTemp, temperature);
        
        CalderaGas yoda = new CalderaGas();
        System.out.println( "\nArrancando a Yoda: " );
        regulator.regulate(thermometer, yoda, minTemp, maxTemp, temperature);
        yoda.speak();
    }
}
