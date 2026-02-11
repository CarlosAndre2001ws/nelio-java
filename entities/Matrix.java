package entities;

public class Matrix {
    private int x;
    private int y;
    int[][] matrix;


    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        matrix = new int[this.x][this.y];
    }
}
