package src.siit.farm;
import java.util.Scanner;

public class Root {
    private static Scanner scanner = new Scanner(System.in);
    private static MethodContainer methodContainer = new MethodContainer();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printStoreOptions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    //print menu options
                    printStoreOptions();
                    break;
                case 1:
                    //Create product and add it to stock
                    createProductAndAddItToStock();
                    break;
                case 2:
                    //Print the list of store items
                    methodContainer.printStoreList();
                    break;
                case 3:
                    //sell an item
                    methodContainer.sellItem();
                    break;
                case 4:
                    ///display daily sales report
                    methodContainer.addSoldItem();
                    break;
                case 5:
                    //exit
                    quit = true;
                    break;
            }
        }
    }

    /**
     * Prints menu options
     */
    private static void printStoreOptions() {
        System.out.println("\nPlease select your choice ");
        System.out.println("\t 0 - Print menu options.");
        System.out.println("\t 1 - Create product and add it to stock.");
        System.out.println("\t 2 - Print the list of store items. ");
        System.out.println("\t 3 - Sell an item in the list.");
        System.out.println("\t 4 - Display daily sales report");
        System.out.println("\t 5 - Exit");
    }

    /**
     * Let the user choose what type of item wants to be added in the list with products.
     */
    private static void createProductAndAddItToStock() {
        System.out.println("\t Please select the product type: ");
        System.out.println(" 1. Animal Product ");
        System.out.println(" 2. Vegetable Product \t");
        int secondChoice = scanner.nextInt();
        scanner.nextLine();
        switch (secondChoice) {
            case 1:
                System.out.println("Please add an animal product");
                methodContainer.createAndAddToStockAnimalItem();
                break;
            case 2:
                System.out.println("Please add a vegetable");
                methodContainer.createAndAddToStockVegetableItem();
                break;
        }

    }

}