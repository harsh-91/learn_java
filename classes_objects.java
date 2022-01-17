class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My Name is : "+ name);

        }
    void calculateYearsToRetirement(){
        int yearsLeft = 60-age;
        System.out.println("I have " + yearsLeft + " years left to my retirement.");
    }
}

public class classes_objects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Hannah Montana";
        person1.age = 25;

        person1.speak();
        person1.calculateYearsToRetirement();
    }
}
