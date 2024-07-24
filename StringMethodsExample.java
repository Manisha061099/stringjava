public class StringMethodsExample {
    public static void main(String[] args) {
        String exampleString = "Hello, Manisha!";

        int length = exampleString.length();
        System.out.println("Length: " + length);

        int index = exampleString.indexOf('n');
        System.out.println("Index of 'n': " + index);

        String replacedString = exampleString.replace('n', 'N');
        System.out.println("Replaced: " + replacedString);

        String upperCaseString = exampleString.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        String lowerCaseString = exampleString.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);
    }
}
