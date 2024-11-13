package leninPoliretos;

public class recursionL {

    public long factorial(int a) {
        if (a == 0) {
            return 1;
        } else {
            return a * factorial(a - 1);
        }
    }

    public int multiplicacion(int a, int b) {
        if (b == 0 || a == 0) {
            return 0;
        } else {
            return a + multiplicacion(a, b - 1);
        }
    }

    public int suma(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;

        } else {
            return 1 + suma(a, b - 1);
        }
    }

}
