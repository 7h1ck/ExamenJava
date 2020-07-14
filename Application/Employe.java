
public abstract class Employe implements IService{

   //Auto généré
    protected static int gid=0;
    
    protected  int  id;
    protected  String nomComplet;
    public char type;



    public Employe (String nomComplet){
      Employe.gid++;
	   this.id=Employe.gid;
      this.nomComplet=nomComplet;
     //Initialisé ID
    }

      public Employe (){
        //Initialisé ID
        Employe.gid++;
        this.id=Employe.gid;
    }

   //Getters and Setters


   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }


    public Boolean isEmbauche(){
      return type=='E';
   }

   public Boolean isJournalier(){
      return type=='J';
   }
   

}