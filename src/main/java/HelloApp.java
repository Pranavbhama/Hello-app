public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            String greeting = "Hello ";
            for (String name : args) {
                greeting += name + ", ";
            }
            // UC6: Use substring to remove the trailing ", " (last 2 characters)
            greeting = greeting.substring(0, greeting.length() - 2);
            System.out.println(greeting);
        } else {
            System.out.println("Hello World");
        }
    }
}