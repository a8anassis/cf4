package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει όλα τα emojis στο range  0x1F600 - 0x1F64F.
 * Η Character.toChars(UnicodeCodePoint), αν το UnicodeCodePoint
 * ανήκει στο Plane 0, (δηλαδή U+0000 - U+FFFF) επιστρέφει το ίδιο
 * το code point, αλλιώς αν το UnicodeCodePoint είναι supplementary
 * code point (ανήκει σε μεγαλύτερο Plane (1-16) και έχει επομένως
 * 5 Hex numbers, π.χ. 0x1F600 ) επιστρέφει το surrogate pair.
 * Στο σύστημα Unicode τα Planes είναι συνεχόμενα groups από 65536 (2^16)
 * χαρακτήρες.
 */
public class AllEmojisApp {

    public static void main(String[] args) {
        char formattedChar = ' ';
        int emojiStart = 0x1F600;
        int emojiEnd = 0x1F64F;
        int i = 0;

        i = emojiStart;
        while (i <= emojiEnd) {
            System.out.print(Character.toChars(i));
            System.out.print(" ");
            i++;
            if (i % 16 == 0) System.out.println();
        }
    }
}
