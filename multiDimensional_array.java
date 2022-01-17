public class multiDimensional_array {
    public static void main(String[] args) {
        int values[] = {3,5,7,8,6,98,54};

        int[][] grid = {
            {5,4,6,8,7,5,5,4},
            {7,8,5,2,3,5,6,4,2,11,55,151,21,21},
            {65,5,6,1,5,51,6515,1}
        };
         System.out.println(grid[1][4]);

         String[][] text = new String[2][3];
         text[0][1] = "Hello There";
         System.out.println(text[0][1]);

         for(int row=0; row < grid.length; row++){
             for(int column = 0; column < grid[row].length; column++){
                 System.out.println(grid[row][column] + "\t");
             }
             System.out.println();
         }

    }
    
}
