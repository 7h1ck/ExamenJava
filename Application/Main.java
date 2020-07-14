import java.time.LocalDate;
import java.util.Scanner;

public class Main {


public static void main(final String[] args) {
String choix;
     final Scanner clavier=new Scanner(System.in);
     final Router router =new Router();

     //Declaration des variable 
     String libelle;
     String nomComplet;
     int anneeEmb;
     int jour;
     int mois;
     int idService;
     LocalDate dateEmb;
     Embauche embauche;
     Journalier journalier;
     final String sms = "Entrer l\'ID de la service";

    do {

        System.out.println("1-Ajout Service");
        System.out.println("2-Lister les services ");
        System.out.println("3-Ajouter un Employe ");
        System.out.println("4-Lister les journaliers ");
        System.out.println("5-Lister les embauches d'un service ");      
        System.out.println("6-Quitter");
        System.out.println("Faites votre choix");
        choix=clavier.nextLine();
        switch(choix){
            case "1":
            System.out.println("Entrer le libelle du service");
               libelle =clavier.nextLine();
               Service service=new Service(libelle);
               router.creerService(service);
            break;

            case "2":

            router.listerServices();
            break;

            case "3":
            // Ajout empl
            System.out.println("Entrer le nom complet ");
               nomComplet =clavier.nextLine();
               System.out.println("Entrer le type d\'employer");
               System.out.println("1 -Embauche\n2 -Journalier");
              final String type = clavier.nextLine();
              if (type.equals("1")){
                //Embauche
                System.out.println("Entrer le saliare ");
                 int salaire = clavier.nextInt();
                 clavier.nextLine();
                 System.out.println("Entrer le jour d\'Embauche");
                 jour =clavier.nextInt();
                 System.out.println("Entrer le mois d\'Embauche");
                 mois =clavier.nextInt();
                 System.out.println("Entrer l\'annee d\'Embauche");
                 anneeEmb = clavier.nextInt();
                 dateEmb = LocalDate.of(anneeEmb, mois, jour);
                 embauche = new Embauche(nomComplet,dateEmb,salaire);
                 embauche.type = 'E';
            router.listerServices();
            System.out.println(sms);
            idService =clavier.nextInt();
            router.ajouterEmbauche(embauche,idService-1);
            clavier.nextLine();
              
            } else {
              // Journalier
              System.out.println("Entrer la duree");
                 int duree = clavier.nextInt();
                 System.out.println("Entrer le forfait");
                 int forfait =clavier.nextInt();
                 journalier = new Journalier(nomComplet,duree,forfait);
                 journalier.type = 'J';
            router.ajouterJournalier(journalier);
            clavier.nextLine();
            }
               
            break;

            case "4":
            router.listerJournalier();
           
            break;
            case "5":
            router.listerServices();
            System.out.println(sms);
            idService = clavier.nextInt();
            clavier.nextLine();
            router.listerEmbaucheInService(idService-1);
            break;

            default :
            System.out.println("Erreur de choix");

        }
        
    } while (!choix.equals("6"));

        
}
    
}