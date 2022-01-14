/**
 * To return only letters from a string.
 * https://www.javacodeexamples.com/java-string-keep-only-letters-example/721
 */
public class Letters_Only {

    String input;

    public Letters_Only(String input) {
        this.input = input;
    }

    public static void main(String[] args) {
        Letters_Only test = new Letters_Only("Fuck");
        System.out.println(test.input);
    }
}
