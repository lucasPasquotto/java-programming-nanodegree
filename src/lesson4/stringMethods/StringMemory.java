package lesson4.stringMethods;

public class StringMemory {

    /**
     * Remember, the String object itself is immutable—it cannot be changed.
     * So when we "change the string", we simply create a new String object and change the variable reference
     * so that it points to this new object.
     */
    public static void main(String[] args) {
        String text = "Hello";
        String anotherText = "Hello";
        String yetAnotherText = "Hello";
        text = "Hellooo";
        System.out.println(text == anotherText);
    }
}
