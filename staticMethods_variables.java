
class thing {
    public String name;
    public final static int LUCKY_NUMBER = 7;
    public static String description;
    public static int count = 0;
    public int id;

    public thing() {
        id = count;
        count++;
    }

    public void showName() {
        System.out.println("Object id : " + id + "," + description + ":" + name);
    }

    public static void showInfo() {
        System.out.println(description);
    }
}

public class staticMethods_variables {

    public static void main(String[] args) {

        thing.description = "i am a thing ";

        thing.showInfo();

        System.out.println("Before creating the objects the count is : " + thing.count);

        thing thing1 = new thing();
        thing thing2 = new thing();
        System.out.println("After creating the objects the count is : " + thing.count);

        thing1.name = "bob";
        thing2.name = "sue";

        thing1.showName();
        thing2.showName();

        System.out.println(Math.PI);
        System.out.println(thing.LUCKY_NUMBER);
    }
}