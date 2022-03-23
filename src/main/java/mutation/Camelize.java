package mutation;

public class Camelize {
    /**
     * Converts a given sentence into camel-case notation.
     *
     * @param sentence sentence
     * @return camel-case notation of sentence
     */
    public String camelize(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            result.append(word);
        }
        return result.toString();
    }
}
