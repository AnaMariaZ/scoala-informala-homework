package siit.ro;

import java.util.Arrays;


public class Product implements Buyable {
    protected String name;
    protected Double price;
    protected Integer quantity;
    protected String restriction;

    private String[] acceptedRestrictions = {"None", "Teenager", "Adult"};

    public Product(String name, Double price, Integer quantity, String restriction) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        setRestriction(restriction);

    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        if (Arrays.asList(acceptedRestrictions).contains(restriction))
            this.restriction = restriction;
        else {
            //should throw exception
            throw new IllegalArgumentException("Value not accepted for restriction");
            //System.out.println("Value not accepted for restriction");
        }
    }
}
