public class ReverseWords {
    public static void main(String[] args) {

       
        if (args.length == 0) {
            System.out.println("Please provide a string as command-line argument.");
            return;
        }

        
        String input = String.join(" ", args);

        // Split into words
        String[] words = input.split(" ");

        
        System.out.print("Reversed string: ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}