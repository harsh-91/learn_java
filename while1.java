public class while1 {
    public static void main(String[] args) {
        int loop = 0;

        while (loop < 5) {
            System.out.println("looping" + loop);
                        if (loop == 5) {
                break;
            }
            loop++;
            System.out.println("running");
        }
    }
}
