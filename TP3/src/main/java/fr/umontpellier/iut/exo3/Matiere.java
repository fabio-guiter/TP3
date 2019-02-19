package fr.umontpellier.iut.exo2;

public class Matiere {
    private String intitulé;
    private int coefficient;
    private Professeur responsable;

    public Matiere(String intitulé, int coefficient, Professeur responsable) {
        this.intitulé = intitulé;
        this.coefficient = coefficient;
        this.responsable = responsable;
    }

    public int getCoefficient() {
        return coefficient;
    }
}
