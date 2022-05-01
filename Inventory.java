import java.util.*;

class DisplayInventory{
    public  void display(int number, int price, String description){
        System.out.println("Part number: "+number+"\nDescription: "+description+"\nPrice: "+price);
    }
}
public class Inventory {
    public static void main(String[] args) {
        DisplayInventory dip = new DisplayInventory();
        String invdes = "Book";
        int number = 100;
        int price = 100000;
        dip.display(number,price,invdes);

    }

}
