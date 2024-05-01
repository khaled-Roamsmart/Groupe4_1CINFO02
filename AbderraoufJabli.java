package ABDERRAOUF;

public class AbderraoufJabli {
    public class Factorielle {
        public static long calculerFactorielle(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("Le nombre doit être positif ou nul.");
            }
            if (n == 0 || n == 1) {
                return 1;
            }
            long resultat = 1;
            for (int i = 2; i <= n; i++) {
                resultat *= i;
            }
            return resultat;
        }

        public static void main(String[] args) {
            int nombre = 5; // Vous pouvez changer le nombre ici
            long resultat = calculerFactorielle(nombre);
            System.out.println("La factorielle de " + nombre + " est : " + resultat);
        }
    }


    public class NombrePair {
        public static boolean estPair(int nombre) {
            return nombre % 2 == 0;
        }

        public static void main(String[] args) {
            int nombre = 6; // Vous pouvez changer le nombre ici
            if (estPair(nombre)) {
                System.out.println(nombre + " est pair.");
            } else {
                System.out.println(nombre + " n'est pas pair.");
            }
        }
    }
}
//j'ai modifier gla methode est pair 2 eme fois pour test