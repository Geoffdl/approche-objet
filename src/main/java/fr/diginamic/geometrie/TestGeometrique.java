package fr.diginamic.geometrie;

public class TestGeometrique {
    public static void main(String[] args) {

        ObjetGeometrique[] formes = new ObjetGeometrique[2];

        formes[0] = new Cercle(4.0);
        formes[1] = new Rectangle(4.0, 8.0);

        for (ObjetGeometrique forme : formes) {

            System.out.println("Forme : " + forme.getClass().getSimpleName());
            System.out.println("Périmètre : " + forme.perimetre());
            System.out.println("Surface : " + forme.surface());
            System.out.println();
        }

    }
}