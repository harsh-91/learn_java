class robot {
    public void speak(String text) {
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("jumping "+ height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving " + distance + "m in " + direction + " direction");
    }
}

public class metthod_parameters {

    public static void main(String[] args){
        robot sam = new robot();
        sam.jump(7);
        sam.move("North" , 55);

        String greeting = "hello there";
        sam.speak(greeting);
    }

}