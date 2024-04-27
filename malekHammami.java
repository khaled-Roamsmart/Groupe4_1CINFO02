public class FonctionsUtilitaires {

    public static double calculerRacineCarree(double nombre) {
        return Math.sqrt(nombre);
    }

    public static String convertirEnMajuscules(String chaine) {
        return chaine.toUpperCase();
    }

    public static void main(String[] args) {
        // Test de la fonction calculerRacineCarree
        double nombre = 25.0;
        double racineCarree = calculerRacineCarree(nombre);
        System.out.println("La racine carrée de " + nombre + " est : " + racineCarree);

        // Test de la fonction convertirEnMajuscules
        String chaine = "bonjour tout le monde";
        String chaineEnMajuscules = convertirEnMajuscules(chaine);
        System.out.println("La chaîne en majuscules est : " + chaineEnMajuscules);
    }
}
