class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My Name is : "+ name);

        }
    int calculateYearsToRetirement(){
        int yearsLeft = 60-age;
        System.out.println("I have " + yearsLeft + " years left to my retirement.");
        return yearsLeft;
    }

    int getAge(){
        return age;
    }
    
    String getName(){
        return name;
    }
}

public class classes_objects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Hannah Montana";
        person1.age = 25;

        //person1.speak();
        int years = person1.calculateYearsToRetirement();
        System.out.println(years);

        int age = person1.getAge();
        String name = person1.getName();

        System.out.println("My Name is : "+ name + " and my age is "+ age + ".");
    }
    
}
