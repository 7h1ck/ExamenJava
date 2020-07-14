
public class Journalier extends Employe {


    private int duree;

    //Propriété navigationnelle
    private int forfait;

     
   
    //Constructeur
       //Par defaut
           public Journalier(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Journalier(String nomComplet,
               int duree,int forfait){
            //Initialisation de la personne
              super(nomComplet);
             this.duree=duree;
             this.forfait=forfait;

          }

          
   //Getters and Setters
      
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
    //super signifie personne
    //this signifie etudiant
       return super.affiche() +" Duree : "+duree+" Forfait : "+forfait;
    }

}