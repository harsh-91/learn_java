class frog {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName() {
        return name;
    } 
    public int getAge(){
        return age;
    }
}

public class setters_and_this {
    public static void main(String[] args) {
        frog frog1 = new frog();
        //frog1.name = "Bernie";
        //frog1.age = 55;

        frog1.setName("Bernie");
        frog1.setAge(55);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());
    }
}
