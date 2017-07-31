public class HelloWorldMethod {
    private String message = "Hello World!";

    public HelloWorldMethod(String message) {
        if (message.length() > 0) this.message = message;
    }
    public void write() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        String message = "Hi!";
        if (args.length > 0) message = args[0];
        HelloWorldMethod helloWorldMethod = new HelloWorldMethod(message);
        helloWorldMethod.write();
    }
}
