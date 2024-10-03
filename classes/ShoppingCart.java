package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

    ArrayList<String> items = new ArrayList<String>();

    public void addItem (String listOfItems){
        Scanner scan = new Scanner(listOfItems.substring(4));
            while (scan.hasNext()){
                String item = scan.next();
                
                if (this.items.contains(item)){
                    System.out.printf("You already have %s in your cart.\n", item);
                }
                else {
                    this.items.add(item);
                    System.out.printf("%s is added to cart. \n", item);
                }
            }
    }

    public void removeItem (String removeItem){
        Scanner scan = new Scanner(removeItem.substring(7));
        while (scan.hasNext()){
            Integer itemNumber = Integer.parseInt(scan.next());

            if (itemNumber <= items.size()){
                String item = items.get(itemNumber-1);
                if (items.contains(item)){
                    items.remove(item);
                    System.out.printf("%s is removed from your cart \n", item);
                }
                else{
                    System.out.printf("%s is not in your cart \n", item);
                }
            }
            else{
                System.out.printf("Item number %d does not exist. \nThere are only %d items in the cart. \n", itemNumber, items.size());
            }

        }        
    } 


    public void listItems (){
        if (items.size() == 0){
            System.out.println("Cart is empty");
        }
        else{
            System.out.println("Items in yout cart are: ");
            for (int i = 0 ; i < items.size() ; i++){
                System.out.printf("%d: %s \n", i+1, items.get(i));
            }
        }
    }
}

// jar -c -f sdf.jar -e App . 
