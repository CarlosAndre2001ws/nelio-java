package entities;

public class Matrix {
    private final int x;
    private final int y;
    int[][] matrix;

    public Matrix(int x, int y) {
        this.x = x;
        this.y = y;
        matrix = new int[this.x][this.y];
    }

    public int[][] getMatrix() {
        return this.matrix;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
