public class main {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = -5;

        int resulta = a + b + c ;
        System.out.println("a): " + resulta);
        int resultb = 2 * b * 3 *(a - c);
        System.out.println("b): " + resultb);
        int resultc = a / b;
        System.out.println("c): " + resultc);
        int resultd = a % b;
        System.out.println("d): " + resultd);
        int resulte = a / c;
        System.out.println("e): " + resulte);
        int resultf = a % c;
        System.out.println("f): " + resultf);
        int resultg = a * b / c;
        System.out.println("g): " + resultg);
        int resulth = a * (b / c);
        System.out.println("h): " + resulth);
        int resulti = (a * c) % b;
        System.out.println("i): " + resulti);
        int resultj = a * (c % b);
        System.out.println("j): " + resultj);
        int resultk = (3 * a - 2 * b) % (2 * a - c);
        System.out.println("k): " + resultk);
        int resultl = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);
        System.out.println("l): " + resultl);
        int resultm = (a - 3 * b) % (c + 2 * a) / (a -c);
        System.out.println("m): " + resultm);
        int resultn = a - b - c * 2;
        System.out.println("n): " + resultn);
    }
}
