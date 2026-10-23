class etudaint{
    String nom;
    int age;
    double moyenne;
    void print(){
        System.out.println("=== Etudaint ===");
    }
    
}

class mkh extends etudaint{
    String specialite;
    String niveau;
    void afficher(){
        System.out.println("hello: "+nom);
        System.out.println("Age: "+age);
        System.out.println("===============");
        System.out.println("=== Etudaint ===");
        System.out.println("Specialite: "+specialite);
    }
}
public class  Main{
    public static void main(String[] args) {
      mkh e1=new mkh();
      e1.specialite="Informatique";
      e1.niveau="Licence";
      e1.nom="Ali";
      e1.age=20;
      e1.moyenne=15.5;
      e1.print();
      e1.afficher();
      e1.afficher();
      
    }
}