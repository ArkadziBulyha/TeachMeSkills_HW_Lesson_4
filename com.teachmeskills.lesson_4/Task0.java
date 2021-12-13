import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        int[][][] threeMass = new int[][][]{{{25, 43, 22}, {74, 45, 55}}, {{80, 24, 54}, {28, 64, 52}}, {{98, 51, 26}, {88, 45, 71}}};

        System.out.print("Введите число для умножения: " + " ");

        int someNum = new Scanner(System.in).nextInt();

        System.out.println();

        for (int i = 0; i < threeMass.length; i++) {
            for (int j = 0; j < threeMass[i].length; j++) {
                for (int k = 0; k < threeMass[i][j].length; k++) {
                    threeMass[i][j][k] = someNum * threeMass[i][j][k];
                    System.out.print(threeMass[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
