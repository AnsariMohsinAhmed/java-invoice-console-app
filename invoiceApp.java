public class invoiceApp {
    public static void main(String[] args) {
        int choice, numberOfProducts = 0, totalAmount;
        // String name[] = new String[20];
        // int price[] = new int[20];
        // int quantity[] = new int[20];
        String name[] = new String[0];
        int price[] = new int[0];
        int quantity[] = new int[0];
        do {
            System.out.println();
            System.out.println("******************");
            System.out.println("Invoice Generator App");
            System.out.println("******************");
            System.out.println("1. Add Products");
            System.out.println("2. Show Invoice");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
            case 1:
                System.out.print("Enter number of products you want to enter: ");
                numberOfProducts = Integer.parseInt(System.console().readLine());
                name = new String[numberOfProducts];
                price = new int[numberOfProducts];
                quantity = new int[numberOfProducts];
                for (int i = 0; i < numberOfProducts; i++) {
                    int productNumber = i + 1;
                    System.out.println("Product " + productNumber);
                    System.out.print("Enter product name: ");
                    name[i] = System.console().readLine();
                    System.out.print("Enter product price: ");
                    price[i] = Integer.parseInt(System.console().readLine());
                    System.out.print("Enter product quantity: ");
                    quantity[i] = Integer.parseInt(System.console().readLine());
                }
                break;
            case 2:
                // name = new String[numberOfProducts];
                // price = new int[numberOfProducts];
                // quantity = new int[numberOfProducts];

                if (name.length == 0 && price.length == 0 && quantity.length == 0) {
                    System.out.println("No products added.");
                } else {
                    System.out.println("\nNo.      Name       Price       Quantity       Amount");
                    System.out.println("---------------------------------------------------------------");
                    for (int i = 0; i < numberOfProducts; i++) {
                        int serialNumber = i + 1;
                        System.out.print(serialNumber + "        " + name[i]);
                        System.out.print("        " + price[i]);
                        System.out.print("          " + quantity[i]);
                        totalAmount = quantity[i] * price[i];
                        System.out.print("              " + totalAmount);
                        System.out.println();
                    }
                }
                break;
            case 3:
                System.out.println("Thanks, Bye.");
                break;
            default:
                System.out.println("Wrong choice");
                break;
            }
        } while (choice != 3);
    }
}
