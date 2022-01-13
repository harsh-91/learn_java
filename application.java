public class application {
    public static void main(String[] args) {
        int myInt = 7;
        String text = "Hello! its a text ";
        String blank = "";
        String name = "John Doe";
        String greeting = text + blank + name;

        System.out.println(greeting);
        System.out.println("Hello!" + "" + "John Doe");
        System.out.println("my Integer is " + myInt);
    }

}
