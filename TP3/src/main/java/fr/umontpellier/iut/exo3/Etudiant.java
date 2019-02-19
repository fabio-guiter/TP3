package fr.umontpellier.iut.exo2;
import java.time.LocalDate;
import java.time.Month;

public class Etudiant {

    private LocalDate datedenaissance = LocalDate.of(2019, Month.FEBRUARY, 4);
    private String prenom;
    private String nom;
    private String adresse;
    private String adressemail;
    private Note[] tabNote = new Note[20];
    private int nbNote = 0;

    public Etudiant(LocalDate datedenaissance, String prenom, String nom, String adresse, String adressemail) {
        this.datedenaissance = datedenaissance;
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
        this.adressemail = adressemail;
    }

    public String toString() {
    /* résultat : retourne une chaîne
    de caractères contenant les caractéristiques de this
    */
        return " Prénom : " + this.prenom + " Nom : " + this.nom + " Adresse : " + this.adresse + " Adresse e-mail : " + this.adressemail + " Date de naissance : " + this.datedenaissance;
    }

    public void setNom(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void noter(int valeur,Matiere m) {
        this.tabNote[this.nbNote] = new Note(valeur, m);
    }

    public void calculerMoyenne(){
        int moyenne = 0;
        for (int i = 0; i < this.nbNote; i++) {
            moyenne = moyenne + (this.tabNote[i].getNombreréel() * this.tabNote[i].getMat().getCoefficient());
        }
        moyenne = moyenne / this.nbNote;
    }
}