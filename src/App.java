import java.io.Console;

import classes.ShoppingCart;

public class App {

    public static void main (String[] args){

        ShoppingCart cart = new ShoppingCart();
        userInput(cart);
    }
    
private static void menu(){

    System.out.println("\n");
    System.out.println("enter either of the following after the prompt '>>>' ");
    System.out.println("'add XXX YYY ZZZ' to add items XXX, YYY and ZZZ to the cart. Eg. add apple banana");
    System.out.println("'remove x y z' to remove items number x, y and z from the list. Eg. remove 1 3 4");
    System.out.println("'list' to list down the items in the cart. ");
    System.out.println("'quit' to exit.");
    System.out.println("\n");
}

public static void userInput(ShoppingCart cart){

    System.out.println("Welcome to your shopping cart.");
    System.out.println("A function to add unique items to your shopping cart.");
    menu();
    Console console = System.console();
    String input = "";

    while(!input.equals("quit")){

        input = console.readLine(">>> ");
        input = input.toLowerCase();

        if (input.equals("list")){
            cart.listItems();
        }
        else if (input.contains("add")){
            cart.addItem(input);
        }
        else if (input.contains("remove")){
            cart.removeItem(input);
        }
        else if (input.equals("quit")){
            continue;
        }
        else {
            System.out.println("Invalid input. Try again.");
        }
    }
}

}