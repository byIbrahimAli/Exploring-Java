/**
 * To return only letters from a string.
 * https://www.javacodeexamples.com/java-string-keep-only-letters-example/721
 */
public class Letters_Only {

    String input;

    public Letters_Only(String input) {
        this.input = input;
    }

    public String letter_filter() {
        String input_copy = input;
        input_copy = input_copy.replaceAll("[^a-zA-Z\s]", "");
        // want no spaces too? Use: [^a-zA-Z]
        return input_copy;
    }

    public static void main(String[] args) {
        Letters_Only test = new Letters_Only("1M34y n3a89*m3e i1__s F4^uc12k__ ");
        System.out.println(test.letter_filter());
    }
}
