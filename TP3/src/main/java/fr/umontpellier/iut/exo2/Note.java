package fr.umontpellier.iut.exo2;

public class Note {
    private int nombreréel;
    private Matiere mat;

    public Note(int nombreréel, Matiere mat) {
        this.nombreréel = nombreréel;
        this.mat = mat;
    }

    public int getNombreréel() {
        return nombreréel;
    }

    public void setNombreréel(int nombreréel) {
        this.nombreréel = nombreréel;
    }

    public Matiere getMat() {
        return mat;
    }

    public void setMat(Matiere mat) {
        this.mat = mat;
    }
}
