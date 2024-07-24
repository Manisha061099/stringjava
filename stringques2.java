public class stringques2 {
    public static void main(String[] args) {
    String exstring= "Hello Manisha ";
    String concatString= exstring.concat("How are you");
    System.out.println("concat: " + concatString);

    int length = exstring.length();
    System.out.println("Length: " + length);

    String exString = exstring.substring(6);
    System.out.println("substring: " + exString);

    int index = exstring.indexOf('n');
    System.out.println("index of 'n': " + index);

    String replacedString = exstring.replace('n', 'N');
    System.out.println("replaced: " + replacedString);  

    String splitString = exstring.split(" ")[1];
    System.out.println("split: " + splitString);    

    String joinsString = String.join(" hi ", exstring, exstring);
    System.out.println("join: " + joinsString); 
    }
}
