import java.util.Scanner;

class Item {
    int code;
    double price;

   
    void input(int c, double p) {
        code = c;
        price = p;
    }
    void display() {
        System.out.printf("%-10d %-10.2f\n", code, price);
    }
}

public class ItemDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item[] items = new Item[5];
        double total = 0;

        
        for (int i = 0; i < 5; i++) {
            items[i] = new Item();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter code and price for item " + (i + 1) + ":");
            int code = sc.nextInt();
            double price = sc.nextDouble();
            items[i].input(code, price);
        }

      
        System.out.println("\nCode       Price");
        System.out.println("----------------------");

        for (int i = 0; i < 5; i++) {
            items[i].display();
            total += items[i].price;
        }

        
        System.out.println("----------------------");
        System.out.printf("Total Price: %.2f\n", total);

        sc.close();
    }
}