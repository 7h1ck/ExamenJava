import java.lang.reflect.Array;
import java.util.ArrayList;

public class Service implements IService{

   //Auto généré
   protected static int gid=0;
    private int id;
    private String libelle;
    private ArrayList<Embauche>tabEmbauchee;
 
    //Constructeur
    public Service(){
      tabEmbauchee = new ArrayList<>();
       Service.gid++;
       this.id=Service.gid;

    }

    public Service(String libelle){
       this.libelle=libelle;
       tabEmbauchee = new ArrayList<>();
       Service.gid++;
       this.id=Service.gid;
   }


   //Getters and Setters
   // public String getNom(){
   //    return libelle;
   // }

   //UC
   public void addEmployer(Embauche embauche){
      tabEmbauchee.add(embauche);

   }


   public void listeEmbauche(){
      for(Embauche e : tabEmbauchee){
          System.out.println(e.affiche());
      }
      
  }
  public void compare(int id){
   if (id == this.id) {
      System.out.println("Egal");
   }else{
      System.out.println("Different");

   }
   
}
public void compare(String libelle){
   if (libelle == this.libelle) {
      System.out.println("Egal");
   }else{
      System.out.println("Different");

   }
   
}
  
   

   //redefinition de la methode affiche()

    @Override
    public String affiche(){
       return "Id: "+this.id+" Nom : "+this.libelle;
    }

}