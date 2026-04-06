// UC5: Using enhanced for-loop
public class HelloApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            for (String name : args) {
                System.out.println("Hello " + args[0]); // or name
            }
        } else {
            System.out.println("Hello World");
        }
    }
}