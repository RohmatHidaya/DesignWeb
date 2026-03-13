public class thistest {
    int a, b;

    thistest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    thistest(int a) {
        this(a, 0);
    }

    thistest() {
        this(0);
    }

    int getA() {
        return this.a;
    }

    int getB() {
        return this.b;
    }

    public static void main(String[] args) {

        thistest test1 = new thistest(1, 1);
        System.out.println("Nilai a : " + test1.getA());
        System.out.println("nilai b : " + test1.getB());
        System.out.println("");
        thistest test2 = new thistest(1);
        System.out.println("Nilai a : " + test2.getA());
        System.out.println("nilai b : " + test2.getB());
        System.out.println("");
        thistest test3 = new thistest();
        System.out.println("Nilai a : " + test3.getA());
        System.out.println("nilai b : " + test3.getB());
    }
}
