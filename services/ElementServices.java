package services;

import entities.Leitor;
import entities.Matrix;

public class ElementServices {

    public static void getInfo(Matrix matrix) {
        Leitor sc = new Leitor();
        int elem = Integer.parseInt(sc.scanner().nextLine());

        for(int i = 0; i < matrix.getX(); i++) {
            for(int j = 0; j < matrix.getY(); j++) {
                if(elem == matrix.getMatrix()[i][j]) {
                    int left = j - 1;
                    int right = j + 1;
                    int up = i - 1;
                    int down = i + 1;
                    System.out.println("Position: " + i + "," + j + ":");
                    if(validPos(matrix, i, left)) System.out.println("Left: " + matrix.getMatrix()[i][left]);
                    if(validPos(matrix, i, right)) System.out.println("Right: " + matrix.getMatrix()[i][right]);
                    if(validPos(matrix, up, j)) System.out.println("Up: " + matrix.getMatrix()[up][j]);
                    if(validPos(matrix, down, j)) System.out.println("Down: " + matrix.getMatrix()[down][j]);
                }
            }
        }
    }

    private static boolean validPos(Matrix matrix, int i, int j) {
        if (i > matrix.getX() -1) { return false; }
        if (j > matrix.getY() -1) { return false; }
        return i >= 0 && j >= 0;
    }
}
