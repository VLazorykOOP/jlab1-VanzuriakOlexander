import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        String lastWord = words[words.length - 1];
        char lastLeter = lastWord.charAt(lastWord.length() - 1);
        System.out.println("The last letter is: " + lastLeter);
        for (int i=0;i<words.length;i++){
            String word = words[i];
            for(int j = 0; j < word.length(); j++) {
                if(word.charAt(j) != lastLeter) {
                    System.out.print(word.charAt(j));
                }
            }
            System.out.print(" ");
        }
        in.close();
    }

}
