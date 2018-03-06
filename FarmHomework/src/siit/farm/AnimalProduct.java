package src.siit.farm;

/**
 * Defines an animal item that can be added to the stock.
 */
public class AnimalProduct extends Product
{


    protected double storageTemperature;

    public AnimalProduct(String name, double price, String validityDate, double weight, double storageTemperature)
    {
        super(name, price, validityDate, weight);
        this.storageTemperature = storageTemperature;
    }

}
