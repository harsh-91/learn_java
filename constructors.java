class Machine {
    private String name;
    private int code;

    public Machine() {
        this("bernie" , 22);
        System.out.println("Constructor running");
        name = "Donald";
    }

    public Machine(String name) {
        System.out.println("Second constructor running");
        this.name = name;
    }

    public Machine(String name, int code){
        this.name = name;
        this.code = code;
        System.out.println(name + code);
    }
}

public class constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Machine machine2 = new Machine("Donald");
        Machine machine3 = new Machine("Trump", 2563654);
    }
}
