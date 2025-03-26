package fr.diginamic.geometrie;

public class Cercle implements ObjetGeometrique {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return rayon * Math.PI * 2;
    }

    @Override
    public double surface() {
        return Math.PI * (Math.pow(rayon, 2));
    }


}