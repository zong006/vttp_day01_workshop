import java.io.Console;
import java.util.ArrayList;
import java.util.Scanner;

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
    String condition = "unquit";
    String input = "";
    ArrayList<String> inputStrings = new ArrayList<String>();

    while(!condition.equals("quit")){

        input = console.readLine(">>> ");
        inputStrings.clear();        

        Scanner scan = new Scanner(input);
        while (scan.hasNext() && inputStrings.size()<1){
            inputStrings.add(scan.next());
        }
        
        if (inputStrings.size()>0){
            String action = inputStrings.get(0).toLowerCase();
            // System.out.println(action);
            // System.out.println(inputStrings.size());

            if (action.equals("list")){
                cart.listItems();
            }
            else if (action.equals("add")){
                cart.addItem(input);
            }
            else if (action.equals("remove")){
                cart.removeItem(input);
            }
            else if (action.equals("quit")){
                condition = "quit";
                continue;
            }
            else {
                System.out.println("Invalid input. Try again.");
            }

        }
        else {
            continue;
        }        
    }
}

}