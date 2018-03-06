package src.siit.farm;

/**
 * Defines a vegetable item that can be added to the stock.
 */
public class VegetableProduct extends Product
{
    public String listOfVitamins;


    public VegetableProduct(String name, double price, String validityDate, double weight, String listOfVitamins)
    {
        super(name, price, validityDate, weight);
        this.listOfVitamins = listOfVitamins;
    }
}
