package fr.diginamic.pays;

public class TestEqualsPays {
    public static void main(String[] args) {
        Pays p = new Pays("Tinytopie", 2);
        Pays p2 = new Pays("Olalaland", 2);

        boolean tomate = p.equals(p2);
        System.out.println(tomate);
    /*
        if (Objects.equals(p.nom, p2.nom)) {
            System.out.println("name match");
        } else {
            System.out.println("name no match");
        }
        if (p.population == p2.population) {
            System.out.println("==");
        } else {
            System.out.println("pop no match");
        }

     */

//        Integer a= 200; // integer pool jusqu'à 127
//        Integer b= 200;
//        if(a==b){
//            System.out.println("EGAL");
//        } else {
//            System.out.println("DIFF");
//        }
    }
}