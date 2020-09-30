package btu;

public class Class2 {
    int n, y;

    public int Method1(int n){
        this.n = n;

        return (2 * (int)Math.pow(n, 2)) + 1;
    }

    public int Method2(int n, int y){
        this.n = n;
        this.y = y;

        return (3 * (int)Math.pow(y, 3)) + (int)Math.pow(n, 2);
    }
}
