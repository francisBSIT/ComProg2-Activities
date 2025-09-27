

import java.util.Scanner;

public class OrderSystem {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] ordername = null;
        double[] price = null;
        int[] quantity = null;
        double[] totalp = null;

        double total = 0;
        double pay = 0;
        double change = 0;
        boolean isdone = true;
        int choice;
        int nproducts = 0;

        System.out.println("Welcome to Caymart");

        do {
            System.out.println("\nPress the number of your chosen operation");
            System.out.println("(1). Write products ordered and its price");
            System.out.println("(2). List of all products ordered with price");
            System.out.println("(3). Pay the products ordered");
            System.out.println("(4). Print Receipt");
            System.out.println("(5). End");
            System.out.print("Choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter how many products ordered: ");
                    nproducts = scan.nextInt();

                    ordername = new String[nproducts];
                    price = new double[nproducts];
                    quantity = new int[nproducts];
                    totalp = new double[nproducts];

                    scan.nextLine(); 
                    for (int i = 0; i < nproducts; i++) {
                        System.out.println("Product " + (i + 1) + ":");
                        System.out.print("  Name: ");
                        ordername[i] = scan.nextLine();
                        System.out.print("  Quantity: ");
                        quantity[i] = scan.nextInt();
                        System.out.print("  Price: ");
                        price[i] = scan.nextDouble();
                        scan.nextLine();
                    }
                    break;

                case 2:
                    if (ordername == null) {
                        System.out.println("No products entered yet.");
                    } else {
                        System.out.println("\nProducts Ordered:");
                        for (int i = 0; i < ordername.length; i++) {
                            System.out.println("Name: " + ordername[i] + " | Qty: " + quantity[i] + " | Price: " + price[i]);
                        }
                    }
                    break;

                case 3:
                    if (ordername == null) {
                        System.out.println("No products to pay for.");
                        break;
                    }

                    total = 0; 
                    for (int j = 0; j < quantity.length; j++) {
                        totalp[j] = price[j] * quantity[j];
                        total += totalp[j];
                    }

                    System.out.printf("Total amount due: %.2f\n",total);
                    System.out.print("Enter payment: ");
                    pay = scan.nextDouble();

                    if (pay < total) {
                        System.out.println("Not enough payment!");
                    } else {
                        change = pay - total;
                        System.out.println("Payment accepted. Change: " + change);
                    }
                    break;

                case 4:
                    if (ordername == null) {
                        System.out.println("No products ordered yet.");
                        break;
                    }
                    System.out.println("\n===================================");
                    System.out.println("           Caymart Store           ");
                    System.out.println("       Official Sales Receipt      ");
                    System.out.println("===================================");
                    System.out.printf("%-15s %5s %10s %10s%n", "Item", "Qty", "Price", "Total");
                    System.out.println("-----------------------------------");
                    for (int i = 0; i < quantity.length; i++) {
                        System.out.printf("%-15s %5d %10.2f %10.2f%n", ordername[i], quantity[i], price[i], totalp[i]);
                    }
                    System.out.println("-----------------------------------");
                    System.out.printf("%-25s %10.2f%n", "Total:", total);
                    System.out.printf("%-25s %10.2f%n", "Payment:", pay);
                    System.out.printf("%-25s %10.2f%n", "Change:", change);
                    System.out.println("===================================");
                    System.out.println(" Thank you for shopping at Caymart! ");
                    System.out.println("===================================");
                    break;

                case 5:
                    isdone = false;
                    System.out.println("Thank you for using our system");
                    break; 
                default:
                    System.out.println("Please enter the corresponding number of your choice");
            }
        } while (isdone); 
        scan.close();
    }
}

