class person {
    String name;
    int age;

    void speak() {
        System.out.println("My Name is :" + name);
    }
}

public class getters {

    public static void main(String[] args) {

        person person1 = new person();
        person1.name = "Dorthoraki";
        person1.age = 23;
        person1.speak();

    }
}