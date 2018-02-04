package test;

import org.junit.Test;
import siit.calculate.max.CalculateMax;

import static org.junit.Assert.assertEquals;


public class CalculateMaxTest
{
    @Test
    public void testGetMax()
    {
        CalculateMax calc=new CalculateMax();
        int max=calc.getMax(5,9);
        assertEquals(9, max);
    }
}
