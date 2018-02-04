package test;

import org.junit.Test;
import siit.input.data.validation.InputDataValidation;

import static org.junit.Assert.assertEquals;

public class InputDataValidationTest
{
    @Test
public void testValidateHour()
{
    InputDataValidation hour = new InputDataValidation();
    boolean hours=hour.validateHour(23);
    assertEquals(true, hours);
    //int sum = calc.sum();
    //assertEquals(9,sum);
}

    @Test
    public void testValidateMinutes()
    {
        InputDataValidation minute = new InputDataValidation();
        boolean minutes=minute.validateMinutes(55);
        assertEquals(true, minutes);
    }

    @Test
    public void testValidateValue()
    {
        InputDataValidation value = new InputDataValidation();
        boolean values=value.validateValue(55,0,59);
        assertEquals(true, values);
    }
}
