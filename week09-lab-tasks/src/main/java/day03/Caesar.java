package day03;

public class Caesar extends Encryption {

    private static final int LENGTH_OF_ALPHABET = 'Z' - 'A' + 1;
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts (String input) {
        char[] result = input.toUpperCase().toCharArray();
        for (int i = 0; i < result.length; i++) {
            result[i] += offset;
            if (result[i] > 'Z') {
                result[i] -= LENGTH_OF_ALPHABET;
            }
        }
        return new String(result);
    }
}
