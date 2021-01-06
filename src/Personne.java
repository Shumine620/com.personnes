public class Personne  {
    private String nom;
    private int age;
    private String lifeStatus;

        //constructeur Personne
    public Personne(String nom, int age){
this.nom = nom;
this.age = age;
this.lifeStatus = lifeStatus;
    }

    public String getNom()
{return nom;}
public void setNom (String nom)
{this.nom = nom;}

public int getAge(){
        return age;
}
public void setAge(int age){
    this.age = age;
}

        public String getLifeStatus() {
            return lifeStatus;
        }
        public void setLifeStatus() {
        if (age <=10) // Enfant
            {
                this.lifeStatus = "enfant";
            }
            else if  (age >=18 ) // Plus de 18 ans
            {
                this.lifeStatus = "adulte";
            }
            else {
                this.lifeStatus ="Adolescent";
            }
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +
                ", Status='" + lifeStatus + '\'' +
                '}';
    }
}







