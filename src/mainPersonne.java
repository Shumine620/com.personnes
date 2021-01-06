import java.util.ArrayList;
import java.util.Arrays;

public class mainPersonne {

  public static void  main(String[] args) {

    ArrayList <Personne> personneListe = new ArrayList <Personne>( );

    Personne personneUn = new Personne("Nico", 9);
    Personne personneDeux = new Personne("Lyne", 27);
    Personne personneTrois = new Personne("Albert", 40);
    Personne personneQuatre = new Personne("Lorraine", 2);
    Personne personneCinq = new Personne("Diane", 55);
    Personne personneSix = new Personne("Louis", 42);
    Personne personneSept = new Personne("Gale", 32);
    Personne personneHuit = new Personne("Loic", 39);
    Personne personneNeuf = new Personne("Seb", 15);
    Personne personneDix = new Personne("Denis", 18);

    personneListe.add(personneUn);
    personneListe.add(personneDeux);
    personneListe.add(personneTrois);
    personneListe.add(personneQuatre);
    personneListe.add(personneCinq);
    personneListe.add(personneSix);
    personneListe.add(personneSept);
    personneListe.add(personneHuit);
    personneListe.add(personneNeuf);
    personneListe.add(personneDix);



    System.out.println("---------- Affichage de la liste-------");

    for (int i = 0; i < personneListe.size( ); i++) {
      personneListe.get(i).setLifeStatus( );
      System.out.println(" La liste des personnes :" + personneListe.get(i));
    }
    System.out.println(" ");
    System.out.println("---------- Affichage de plus agée-------");
    System.out.println(" ");


    Personne personneMax = personneListe.get(0);

    for (int j = 0; j < personneListe.size( ); j++) {
      if (personneListe.get(j).getAge() > personneMax.getAge()) {
        personneMax = personneListe.get(j);

      }

  }
    System.out.println("La personne la plus agée est :" + personneMax.getNom() + "  " + personneMax.getAge());

    int somme =0;
    for(Personne personne: personneListe){

      somme = personne.getAge() + somme;
    }
      System.out.println( "la somme des ages est: " +somme) ;

}
}
