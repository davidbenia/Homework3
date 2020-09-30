package btu;

public class Class3 {
    double a, b;

    public double Method1(double a, double b){
        this.a = a;
        this.b = b;

        return ((4 * Math.pow(a, 2)) / b) - 1;
    }

    public double Method2(double a, double b){
        this.a = a;
        this.b = b;

        return ((3 * Math.pow(a, 3)) / 2) - Math.pow(b, 2);
    }
}
