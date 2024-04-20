public class benTouhemiWalid {
    public static void main(String[] args) {
        int base = 3;
        int exposant = 4;

        int resultatPuissance = puissance(base, exposant);
        System.out.println(base + " puissance " + exposant + " = " + resultatPuissance);

        int a = 24;
        int b = 36;

        int pgcdResult = pgcd(a, b);
        System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcdResult);
    }

    public static int puissance(int base, int exposant) {
        if (exposant == 0) {
            return 1;
        } else {
            int resultat = 1;
            for (int i = 0; i < exposant; i++) {
                resultat *= base;
            }
            return resultat;
        }
    }

    public static int pgcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
