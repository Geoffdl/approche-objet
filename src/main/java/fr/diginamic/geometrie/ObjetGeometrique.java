package fr.diginamic.geometrie;

/** List les méthodes obligatoires que doit posséder un objet géométrique
 * @author DIGINAMIC
 *
 */
/*
Methods inside an interface are by default abstract and  public.
 */
public interface ObjetGeometrique {
    /** Retourne le périmètre d'une forme géométrique
     * @return double
     */
    double perimetre();

    /** Retourne la surface
     * @return double
     */
    double surface();
}