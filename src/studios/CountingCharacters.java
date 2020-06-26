package studios;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {

        String quote = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote: ");
        quote = input.nextLine();

//        String quote= "If the product of two terms is zero then common sense says at least one of the two terms " +
//                "has to be zero to start with. So if you move all the terms over to one side, you can put the " +
//                "quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
//                "Once you’ve done that, it’s pretty straightforward from there.";

        char[] allCharacters = quote.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < allCharacters.length; i++) {
            if (!Character.isLetter(allCharacters[i])) {
                // DO NOTHING
            }
            else if (charCount.containsKey(allCharacters[i])) {
                charCount.put(allCharacters[i], charCount.get(allCharacters[i]) + 1);
            } else {
                charCount.put(allCharacters[i], 1);
            }
        }

        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
        System.out.println(charCount);

//        System.out.println(charCount);
    }
}
