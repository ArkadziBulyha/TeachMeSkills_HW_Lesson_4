public class Task4 {
    public static void main(String[] args) {

        int[][] mass = new int[][]{{5, 7, 8}, {6, 12, 18}, {7, 14, 21}};

        String diag1 = new String();
        String diag2 = new String();

        System.out.println("Выведем диагонали массива:");
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i == j) {
                    diag1 = diag1 + " " + mass[i][j];
                }
                if (i == (mass[i].length - 1) - j) {
                    diag2 = diag2 + " " + mass[i][j];
                }
            }
        }
        System.out.print(diag1 + "\n" + diag2);
    }
}
