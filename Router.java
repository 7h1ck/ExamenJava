import java.util.ArrayList;

public class Router{

    //Declaration des Tableaux
    private ArrayList<Service> tabService;
    private ArrayList<Journalier> tabJournalier;


    public Router(){
        //Creation du Tableau
        tabService=new ArrayList<>();
        tabJournalier=new ArrayList<>();

    }


    public void creerService(Service service){
            tabService.add(service);       
    }
    public void listerServices(){
        for(Service s: tabService){
            System.out.println(s.affiche());
        }
        
    }

    public void  ajouterJournalier(Journalier jr){
        tabJournalier.add(jr);
    }


    public void ajouterEmbauche(Embauche p,int id){
        
            p.embaucher(tabService.get(id));
            tabService.get(id).addEmployer(p);
        
    }



	public void listerJournalier() {
        for(Journalier p: tabJournalier){
                System.out.println(p.affiche());
        }
    }
    
    //Uc 

    public void listerEmbaucheInService(int id){
        tabService.get(id).listeEmbauche();
    }
    
}