package entities;

public class Triangle {

    public double a;
    public double b;
    public double c;
    private final double p;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.p = (a + b + c) / 2.0;
    }

    public double area () {
        return Math.sqrt(this.p * (this.p - this.a) * (this.p - this.b) * (this.p - this.c));
    }
}
