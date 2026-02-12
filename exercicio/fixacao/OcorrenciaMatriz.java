package exercicio.fixacao;

import entities.Matrix;
import services.MatrixServices;

public class OcorrenciaMatriz {

    public static void run() {
        Matrix matrix = MatrixServices.create();

        int x = matrix.getX();
        int y = matrix.getY();

        System.out.println(x);
        System.out.println(y);

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                System.out.println(matrix.getMatrix()[i][j]);
            }
        }


    }
}
