public class math {
    // penjumlahan
    public static double sum(double a, double b) {
        return a + b;
    }

    // pangkat
    public static double Exponen(double a, double n) {
        if (a == 0)
            return 0;

        double result = 1.0;
        for (double i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }

    // pangkat 2
    public static double sqr(double a) {
        return a * a;
    }

    // bilangan akar sempurna
    public static double PerfectSqrt(double a) {
        for (double i = 1.0; i <= a; i++) {
            if (sqr(i) == a) {
                return i;
            }
        }
        return 0;
    }

    // luas persegi
    public static int LuasPersegi(int sisi) {
        return sisi * sisi;
    }

    // luas lingkaran
    public static double LuasLingkaran(double jariJari) {
        return (22.0 / 7) * sqr(jariJari);
    }

    // rumus pythagoras
    public static double Pythagoras(double a, double b) {
        double sum = sum(sqr(a), sqr(b));
        double c = PerfectSqrt(sum);
        return c;
    }

    public static void main(String[] args) {
        // double lingkaran = LuasLingkaran(7);

        // System.out.print(lingkaran);

        // double exponen = Exponen(100, 1 / 2.0);
        // System.out.println(exponen);

        // double sqrt = sqrt(9);
        // System.out.println(sqrt);
        double pythagoras = Pythagoras(17, 8);
        System.out.println(pythagoras);

        // double test = PerfectSqrt(16);
        // System.out.println(test);
    }
}