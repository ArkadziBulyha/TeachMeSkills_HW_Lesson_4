public class Task3 {
    public static void main(String[] args) {

        int summ = 0;
        int[][] mass = new int[][]{{2, 5, 4}, {3, 7, 20}, {6, 9, 30}, {7, 20, 30}};

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                summ = summ + mass[i][j];
            }
        }
        System.out.printf("Сумма всех элементов массива: %s", summ);
    }
}
