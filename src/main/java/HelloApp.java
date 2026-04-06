public class HelloApp {
    public static void main(String[] args) {
        // UC7: Use String.join for efficient formatting
        if (args.length > 0) {
            String names = String.join(", ", args);
            System.out.println("Hello " + names);
        } else {
            System.out.println("Hello World");
        }
    }
}