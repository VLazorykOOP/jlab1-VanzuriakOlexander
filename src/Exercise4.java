import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        for (String word : words) {
            char lastLetter = word.charAt(word.length() - 1);
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) != lastLetter || j == word.length() - 1) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.print(" ");
        }
        in.close();
    }

}
