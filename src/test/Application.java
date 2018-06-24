package test;

import classe.Admin2;
import classe.Commercial;
import classe.Client;
import classe.User;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
    public static void main(String[] main) {

        Admin2[] admins = new Admin2[2];
        admins[0] = new Admin2("Admin1", "Admin1");
        admins[1] = new Admin2("Admin2", "Admin2");
        System.out.println("\n La liste des admins : ");
        for (Admin2 e : admins)
            System.out.println("\t" + e );

        Commercial[] commercials = new Commercial[2];
        commercials[0] = new Commercial("Commercial1", "Commercial1");
        commercials[1] = new Commercial("Commercial2", "Commercial2");
        System.out.println("\n La liste des commerciaux : ");
        for (Commercial e : commercials)
            System.out.println("\t" + e);

        Client[] clients = new Client[2];
        clients[0] = new Client("Client1", "Client1");
        clients[1] = new Client("Client2", "Client2");
        System.out.println("\n La liste des clients : ");
        for (Client p : clients)
            System.out.println("\t" + p);

        Scanner keyboard = new Scanner(System.in);
        int choice = -1;//initialisation à -1 pour utiliser le try/catch


        do {
            System.out.println("\n Entrez votre choix:");

            System.out.println("\n1\t Afficher le(s) utilisateur(s)");// Display the menu
            System.out.println("2\t Créer un commercial");
            System.out.println("3\t Créer un client");
            System.out.println("4\t Créer un admin");
            System.out.println("5\t Sortir du menu/programme");

            try {
                choice = keyboard.nextInt();//Get user's choice
            } catch (InputMismatchException e) {
                System.out.println("Merci d'entrer un chiffre entre 1 et 5 !");
            }
            finally {
                keyboard.nextLine();
            }//fin du test de vérification du choix


            switch (choice) {//Display the title of the chosen module
                case 1:

                    break;
                case 2:

                    break;
                case 3:
                    break;

                case 4:

                    break;
                case 5:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix invalide");
            }//end of switch
        } while (choice != 5);


    }
}



