package gr.aueb.cf.testbed;

/**
 * Μετατρέπει σε κεφαλαία-πεζά εναλλάξ με το 1ο κεφαλαίο.
 * "Thanassis" -> "ThAnAsSiS"
 */
public class UpperLowerCaseApp {

    public static void main(String[] args) {
        String sentence = "Thanassis";
        StringBuilder sb = new StringBuilder();
        String s;
        String subString;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) >= 'A' && (sentence.charAt(i) <= 'Z') ||
                    (sentence.charAt(i) >= 'a' && (sentence.charAt(i) <= 'z'))) {
                subString = sentence.substring(i, i + 1);
                s = ((i % 2) == 0) ? subString.toUpperCase() : subString.toLowerCase();
                sb.append(s);
            }
        }

        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }
    }
}
