package services;

import entities.Leitor;
import entities.Matrix;

public class MatrixServices {

    public static Matrix create() {

        Leitor sc = new Leitor();

        int x = Integer.parseInt(sc.scanner().nextLine());
        int y = Integer.parseInt(sc.scanner().nextLine());

        Matrix newMatrix = new Matrix(x, y);

        for(int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                newMatrix.getMatrix()[i][j] = sc.scanner().nextInt();
            }
        }

        return newMatrix;
    }
}
