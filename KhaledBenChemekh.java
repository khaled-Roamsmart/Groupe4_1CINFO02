public class KhaledBenChemekh {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau
        int[] tableau = {1, 2, 3, 4, 5};

        // Calcul de la somme et de la moyenne
        int somme = sommeTableau(tableau);
        double moyenne = moyenneTableau(tableau);

        // Affichage des résultats
        System.out.println("La somme du tableau est : " + somme);
        System.out.println("La moyenne du tableau est : " + moyenne);
    }

    public static int sommeTableau(int[] tableau) {
        int somme = 0;
        // Parcours du tableau pour additionner ses éléments
        for (int nombre : tableau) {
            somme += nombre;
        }
        return somme;
    }

    public static double moyenneTableau(int[] tableau) {
        // Appel de la fonction sommeTableau pour obtenir la somme
        int somme = sommeTableau(tableau);
        // Calcul de la moyenne en divisant la somme par le nombre d'éléments
        double moyenne = (double) somme / tableau.length;
        return moyenne;
    }
}
