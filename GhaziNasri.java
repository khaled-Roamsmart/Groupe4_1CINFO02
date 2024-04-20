import java.util.Arrays;

public class GhaziNasri {
    public static void main(String[] args) {
        // Tri d'un tableau d'entiers en ordre croissant
        int[] tableau = {5, 2, 8, 1, 3};
        trierTableauCroissant(tableau);
        System.out.println("Tableau trié en ordre croissant : " + Arrays.toString(tableau));

        // Vérification si une chaîne est un palindrome
        String chaine1 = "radar";
        String chaine2 = "hello";

        System.out.println(chaine1 + " est un palindrome : " + estPalindrome(chaine1));
        System.out.println(chaine2 + " est un palindrome : " + estPalindrome(chaine2));
    }

    public static void trierTableauCroissant(int[] tableau) {
        Arrays.sort(tableau);
    }

    public static boolean estPalindrome(String chaine) {
        int longueur = chaine.length();
        for (int i = 0; i < longueur / 2; i++) {
            if (chaine.charAt(i) != chaine.charAt(longueur - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
