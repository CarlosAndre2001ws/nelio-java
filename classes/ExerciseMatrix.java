package classes;

import entities.Leitor;

public class ExerciseMatrix {
    public static void run() {
        int n;
        Leitor sc = new Leitor();
        System.out.print("Insert the dimension of the matrix: ");n = Integer.parseInt(sc.scanner().nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");matrix[i][j] = Integer.parseInt(sc.scanner().nextLine());
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.println("matrix[" + i + "][" + "] = " + matrix[i][i]);
        }

        sc.fecharLeitor();
    }
}
