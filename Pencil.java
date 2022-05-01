import java.util.Scanner;

public class Pencil {
    public String display(String colour, int length, int price){
        return "The colour is \""+colour+"\" The length is \""+length+"\" The price is \""+price+"\"";
    }

    public static void main(String[] args) {
        Pencil prt = new Pencil();
        Scanner input = new Scanner(System.in);
        System.out.println("The colour: ");
        String colour = input.next();
        System.out.println("The length: ");
        int length = input.nextInt();
        System.out.println("The price: ");
        int price = input.nextInt();
        System.out.println(prt.display(colour,length,price));
    }
}
