import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        
        String result = str.replace('d', 'f');
        System.out.println("Modified string:");
        System.out.println(result);

        sc.close();
    }
}