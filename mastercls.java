
class Example {
    int number;
    String message;
}
public class mastercls {
    public static void main(String[] args) {
        Example myExample = new Example();
        myExample.number = 10;
        myExample.message = "Hello";
        System.out.println("Number: " + myExample.number);
        System.out.println("Message: " + myExample.message);
    }
}
