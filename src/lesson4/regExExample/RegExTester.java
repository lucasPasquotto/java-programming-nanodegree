package lesson4.regExExample;

import java.util.regex.Pattern;

public class RegExTester {

    /**
     * https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
     * https://regexr.com/
     */
    public static void main(String[] args) {
        String emailRegex = "^(.+)@(.+).(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        String email = "lucas.florido@outlook.com";

        System.out.println(pattern.matcher(email).matches());
    }
}
