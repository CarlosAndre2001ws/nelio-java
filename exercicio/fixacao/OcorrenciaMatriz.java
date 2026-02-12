package exercicio.fixacao;

import entities.Matrix;
import services.ElementServices;
import services.MatrixServices;

public class OcorrenciaMatriz {

    public static void run() {
        Matrix matrix = MatrixServices.create();

        ElementServices.getInfo(matrix);
    }
}
