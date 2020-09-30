package btu;

public class Class4 {
    double a, b, z;

    public double Method1(double a, double b, double z){
        this.a = a;
        this.b = b;
        this.z = z;

        return (a + Math.pow(b, 3) - 7) / (z + 8);
    }

    public double Method2(double a, double b, double z){
        this.a = a;
        this.b = b;
        this.z = z;

        return (a + z - Math.pow(b, 3)) / (z * a * b);
    }

    public double Method3(double a, double b, double z){
        this.a = a;
        this.b = b;
        this.z = z;

        return ((a * z) - b) / (z * b);
    }
}
