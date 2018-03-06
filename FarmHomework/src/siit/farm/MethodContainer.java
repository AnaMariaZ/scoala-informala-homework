package src.siit.farm;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MethodContainer {

    private List <Product> products = new LinkedList <>();
    private List <Product> soldProducts = new LinkedList <>();
    private static Scanner scanner = new Scanner(System.in);

    /**
     * prints the items that exists in the list.
     */
    public void printStoreList() {
        System.out.println("You have " + products.size() + " items in your grocery list");

        for (Product p : products) {
            System.out.println("Number in the list: " + products.indexOf(p) + "\nName: " + p.getName());
            System.out.println("Price: " + p.getPrice());
            System.out.println("Validity: " + p.getValidityDate());
            System.out.println("Weight: " + p.getWeight());

        }
    }

    /**
     * Adds an animal item to the stock.
     */
    public void createAndAddToStockAnimalItem() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = keyboard.nextLine();

        System.out.print("Please enter price: ");
        double price = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Please enter validity date (MM-DD-YYYY): ");
        String validityDate = keyboard.nextLine();

        System.out.print("Please enter weight: ");
        double weight = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Please enter storage temperature: ");
        double storageTemperature = keyboard.nextDouble();
        keyboard.nextLine();

        // use local variables in constructor call
        AnimalProduct animalProduct = new AnimalProduct(name, price, validityDate, weight, storageTemperature);
        products.add(animalProduct);

    }

    /**
     * Adds a vegetable item to the stock.
     */
    public void createAndAddToStockVegetableItem() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = keyboard.nextLine();

        System.out.print("Please enter price: ");
        double price = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Please enter validity date (MM-DD-YYYY): ");
        String validityDate = keyboard.nextLine();

        System.out.print("Please enter weight: ");
        double weight = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print("Please enter list of Vitamins: ");
        String listOfVitamins = keyboard.nextLine();

        // use local variables in constructor call
        VegetableProduct vegetableProduct = new VegetableProduct(name, price, validityDate, weight, listOfVitamins);
        products.add(vegetableProduct);
    }

    /**
     * Sells the item with the specified index and adds it to the list with sold products.
     */
    public void sellItem()
    {
        printStoreList();
        System.out.println("Choose the number of the item you want to buy");
        int i = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Choose the index for sold products");
        int j = scanner.nextInt();

        soldProducts.add(j, products.remove(i));



    }

    /**
     * Shows the size of the sold products list and shows the name of the product/prducts with the specified validity date.
     */
    public void addSoldItem()
    {
        System.out.println("You have " + soldProducts.size() + " items in your daily sales report list");
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter validity date (MM-DD-YYYY): ");
            String validityDate = keyboard.nextLine();
        for (Product p : soldProducts)
        {
            if (validityDate.equals(p.validityDate)) System.out.println("The list of products:" + p.getName());
        }
    }
}
