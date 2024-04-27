public class TableauUtil {

    public static int trouverMax(int[] tableau) {
        if (tableau.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > max) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static int[] concatenerTableaux(int[] tableau1, int[] tableau2) {
        int[] resultat = new int[tableau1.length + tableau2.length];
        System.arraycopy(tableau1, 0, resultat, 0, tableau1.length);
        System.arraycopy(tableau2, 0, resultat, tableau1.length, tableau2.length);
        return resultat;
    }

    public static void main(String[] args) {
        int[] tableau = {3, 7, 2, 9, 5};
        int elementMaximal = trouverMax(tableau);
        System.out.println("L'élément maximal dans le tableau est : " + elementMaximal);

        int[] tableau1 = {1, 2, 3};
        int[] tableau2 = {4, 5, 6};
        int[] nouveauTableau = concatenerTableaux(tableau1, tableau2);
        System.out.println("Le tableau concaténé est : " + Arrays.toString(nouveauTableau));
    }
}
