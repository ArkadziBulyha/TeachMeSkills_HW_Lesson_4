import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[][] mass = new int[][]{{5, 11, 9}, {20, 34, 26}, {4, 9, 8}, {10, 1, 25}};

        System.out.println("Сортировка элементов в строках по возрастанию: ");
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                for (int k = 0; k < mass[i].length - 1; k++) {
                    if (mass[i][k] > mass[i][k + 1]) {
                        int temp = mass[i][k];
                        mass[i][k] = mass[i][k + 1];
                        mass[i][k + 1] = temp;
                    }
                }
                System.out.print(mass[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
