package aisd.hw1;

public class Evklid {
    public class Main {
        public static int evklid(int a, int b){
            a = Math.abs(a);
            b = Math.abs(b);
            if (a == 1 || b == 1) return 1;
            if (a == b) return a;
            if (a == 0) return b;
            if (b == 0) return a;
            if (a < b){
                int c = a;
                a = b;
                b = c;
            }
            while (b != 0){
                int ostatok = a % b;
                a = b;
                b = ostatok;
                if (a == 1) {
                    return 1;
                }
            }
            return a;
        }
    }
}
