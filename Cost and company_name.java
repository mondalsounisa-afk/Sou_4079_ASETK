import java.util.Scanner;

class Tender {
    double cost;
    String companyName;

    void input(String name, double c) {
        companyName = name;
        cost = c;
    }
}

public class TenderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tender[] t = new Tender[5];

    
        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
        }

    
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter company name and cost for tender " + (i + 1) + ":");
            String name = sc.next();
            double cost = sc.nextDouble();
            t[i].input(name, cost);
        }
        double minCost = t[0].cost;
        String minCompany = t[0].companyName;

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < minCost) {
                minCost = t[i].cost;
                minCompany = t[i].companyName;
            }
        }
        System.out.println("\nCompany with minimum cost:");
        System.out.println("Company Name: " + minCompany);
        System.out.println("Cost: " + minCost);

        sc.close();
    }
}