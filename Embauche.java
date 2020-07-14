import java.time.LocalDate;

public class Embauche extends Employe {


    private int salaire;
    private LocalDate dateEmb;
    private Service service;


    //Propriété navigationnelle
     
   
    //Constructeur
       //Par defaut
           public Embauche(){
          }
      //Surcharge du Contructeur
         //Creer un Objet puis de l'initialiser
          public Embauche(String nomComplet,
               LocalDate dateEmb,int salaire ){
            //Initialisation de la personne
              super(nomComplet);
             this.dateEmb=dateEmb;
             this.salaire=salaire;
          }

   //Getters and Setters
  
   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return super.affiche() +" Date d'Embauche : "+dateEmb.toString() 
                     +" Salire "+salaire;
    }
    public void embaucher(Service service){
         this.service = service;
    }
}