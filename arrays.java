public class arrays {
    public static void main(String[] args) {
        int value = 7;
        int[] values;
        values = new int[3];
        System.out.println(values[0]);
        values [0]= 10;
        values[1]= 56;
        values[2] = 9;
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);

        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
        int numbers[] = {56,2,454,2,5,6,4,4,5,5,5,5,49,85,4,4,46,454,5,464,654,354,54};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

    }
    
}
