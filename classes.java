class person{
    String name;
    int age;
    void speak(){
        System.out.println("Hello, my name is "+ name + " and my age is " + age +" years.");
    }
}

public class classes {
    public static void main(String[] args) {
        person person1 = new person();

        person1.name = "John Doe";
        person1.age = 46;

        person person2 = new person();
        person2.name = "Jane Doe";
        person2.age = 30;

        person person3 = new person();
        person3.name = "angle.one";
        person3.age = 36;

        person3.speak();

        System.out.println(person1.name);
    }
    
}
