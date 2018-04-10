package bancsapp;

public class Aplicacio {

    public static void main(String[] args) {

        System.out.println("Introdueix el nom del compte bancari 1: ");
        String nom = cLlegir.dato();
        System.out.println(".................................................");
        System.out.println("Introdueix el nombre secret del compte bancari 1: ");
        int numero = cLlegir.datoInt();
        System.out.println(".................................................");
        CompteBancari compte = new CompteBancari(nom, numero);

        System.out.println("Introdueix el nom del compte bancari 2: ");
        nom = cLlegir.dato();
        System.out.println(".................................................");
        System.out.println("Introdueix el nombre secret del compte bancari 2: ");
        numero = cLlegir.datoInt();
        System.out.println(".................................................");
        CompteBancari compte2 = new CompteBancari(nom, numero);

        System.out.println("Introdueix la quantitat que vols ingressar del compte bancari 1 "
                + "al compte bancari 2: ");
        float quantitat = cLlegir.datoFloat();
        boolean resultat = compte.extreure(quantitat);
        boolean resultat2 = compte2.ingressar(quantitat);

        if (resultat == false || resultat2 == false) {
            System.out.println("No s'ha pogut realitzar l'ingrés!");
        } else {
            System.out.println("El saldo final del compte 1 és: " + compte.consultarSaldo());
            System.out.println("El saldo final del compte 2 és: " + compte2.consultarSaldo());
        }
        System.out.println(".................................................");
    }
}
