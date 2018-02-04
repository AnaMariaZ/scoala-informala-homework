package test;

import org.junit.Test;
import siit.fahrenheit.to.celsius.conversion.Conversion;

import static org.junit.Assert.assertEquals;

public class ConversionTest
{
    @Test
    public void testOutputCelsius()
    {
        Conversion temp=new Conversion();
        int temp2= (int) temp.transformTemperature(-50);
        assertEquals(-45, temp2);
    }

    @Test
    public void testTemperatureHigherThanNormal()
    {
        Conversion temp=new Conversion();
        int temp2= (int) temp.transformTemperature(-4);
        if (temp2 < 37 || temp2 >37) assertEquals(-20, temp2);
    }
}
