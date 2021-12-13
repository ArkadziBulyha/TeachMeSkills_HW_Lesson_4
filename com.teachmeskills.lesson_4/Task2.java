public class Task2 {
    public static void main(String[] args) {

        int[][] mass1 = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] mass2 = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int[][] resMass = new int[mass1.length][mass2[0].length];

        for (int i = 0; i < resMass[0].length; i++) {
            for (int j = 0; j < resMass.length; j++) {
                for (int k = 0; k < mass1[0].length; k++) {
                    resMass[i][j] = resMass[i][j] + mass1[i][k] * mass2[k][j];
                }
            }
        }

        for (int i = 0; i < resMass.length; i++) {
          for (int j = 0; j < resMass[0].length; j++) {
                System.out.print(resMass[i][j] + "\t");
           }
            System.out.println();
        }
    }
}
