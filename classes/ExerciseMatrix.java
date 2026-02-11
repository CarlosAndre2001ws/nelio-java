package classes;

import entities.Leitor;

public class ExerciseMatrix {
    public static void run() {
        int n;
        int negatives = 0;
        Leitor sc = new Leitor();
        System.out.print("Insert the dimension of the matrix: ");n = Integer.parseInt(sc.scanner().nextLine());
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = sc.scanner().nextInt();
                if(matrix[i][j] < 0 ) {
                    negatives++;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();
        System.out.println("Negative elements in the matrix: " + negatives);

        sc.fecharLeitor();
    }
}
