import java.util.Scanner; // import the scanner class

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // creates a scanner object

    System.out.println("Welcome to PriceGougeMart!");
    System.out.println("------------------------------");
    
    //Item 1
    System.out.println("Item 1:");
    String item1 = scan.nextLine(); 
    System.out.println("Price:");
    float price1 = scan.nextFloat();
    scan.nextLine();

    //Item 2
    System.out.println("Item 2:");
    String item2 = scan.nextLine();
    System.out.println("Price:");
    float price2 = scan.nextFloat();
    scan.nextLine();

    //Item 3
    System.out.println("Item 3:");
    String item3 = scan.nextLine();
    System.out.println("Price:");
    float price3 = scan.nextFloat();
    scan.nextLine();

    //Receipt results
    System.out.println("------------------------------");
    System.out.printf("%-15s $%10.2f\n",item1, price1); //"%-15s $%10.2f\n" formats the price information so it lines up on the right side, prints two decimal places, and includes a dollar sign in the printout.
    System.out.printf("%-15s $%10.2f\n",item2, price2);
    System.out.printf("%-15s $%10.2f\n",item3, price3);

    //Add tax and calculate total
    System.out.println("------------------------------");
    float subtotal = (price1 + price2 + price3);
    System.out.printf("%-15s $%10.2f\n", "Subtotal:", subtotal); 
    System.out.printf("%-15s $%10.2f\n", "Tax(9.0125%):", (subtotal * 0.09125));
    System.out.printf("%-15s $%10.2f\n", "Total:", (subtotal * 1.09125));

    //Complete Receipt
    System.out.println("------------------------------");
    System.out.println("Thank you for shopping!");
    System.out.println("You put the 'mark' in our mark-ups!");
    System.out.println("See you next paycheck!");

  }
}