package fr.umontpellier.iut.exo1;
import java.time.LocalDate;
import java.time.Month;

public class Etudiant {

    private LocalDate datedenaissance = LocalDate.of(2019, Month.FEBRUARY, 4);
    private String prenom;
    private String nom;
    private String adresse;
    private String adressemail;

    public Etudiant(LocalDate datedenaissance, String prenom, String nom, String adresse, String adressemail) {
        this.datedenaissance = datedenaissance;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.adressemail = adressemail;
    }

    public String toString(){
    /* résultat : retourne une chaîne
    de caractères contenant les caractéristiques de this
    */
        return " Prénom : " + this.prenom + " Nom : " + this.nom + " Adresse : " + this.adresse + " Adresse e-mail : " + this.adressemail + " Date de naissance : " + this.datedenaissance ;
    }

    public void setNom(String nom ,String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }


}
