package mutation;

public class StringUtil {
    /**
     * Doubles each character of a string ("abc" -> "aabbcc")
     *
     * @param str string
     * @return string where each character is duplicated
     * @throws IllegalArgumentException if parameter is null
     */
    public static String duplicateCharactersInString(String str) {
        if (str == null) {
            throw new IllegalArgumentException("str must not be null");
        }
        StringBuilder builder = new StringBuilder();
        for (char ch : str.toCharArray()) {
            builder.append(ch);
            builder.append(ch);
        }
        return builder.toString();
    }
}
