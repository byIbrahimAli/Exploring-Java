package random_pile_of_sh.letters_only;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * To return only letters from a string.
 * https://www.javacodeexamples.com/java-string-keep-only-letters-example/721
 */
public class Letters_Only {

    private String input;

    public Letters_Only() throws IOException {
        System.out.println("Input your garbage");
        input();
        System.out.println("Tada 🪄 → " + letter_filter());
    }

    private String input() throws IOException {
        // Ways to get input: https://www.geeksforgeeks.org/ways-to-read-input-from-console-in-java/
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Closing reader tips: https://stackoverflow.com/questions/32042494/is-it-necessary-to-close-an-inputstreamreader-in-a-bufferedreader
        input = reader.readLine();
        reader.close();
        return input;
    }

    public String letter_filter() {
        String input_copy = input;
        // input_copy = input_copy.replaceAll("[^a-zA-Z\s]", "");
        // want no spaces too? Use: [^a-zA-Z]
        return input_copy;
    }

    public static void main(String[] args) throws IOException {
        Letters_Only test = new Letters_Only();
        // 1M34y n3a89*m3e i1__s F4^uc12k__
    }
}
